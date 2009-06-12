/*
 * JBoss, Home of Professional Open Source.
 *
 * See the LEGAL.txt file distributed with this work for information regarding copyright ownership and licensing.
 *
 * See the AUTHORS.txt file distributed with this work for a full listing of individual contributors.
 */
package com.metamatrix.modeler.internal.ui.properties;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.DialogCellEditor;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.dialogs.ListDialog;
import org.eclipse.ui.views.properties.IPropertyDescriptor;
import org.eclipse.xsd.XSDSchema;
import com.metamatrix.core.util.I18nUtil;
import com.metamatrix.modeler.ui.UiConstants;
import com.metamatrix.modeler.ui.properties.ITransientPropertyDescriptor;

class NamespacePropertyDescriptor implements ITransientPropertyDescriptor, UiConstants {

    static final String PREFIX = I18nUtil.getPropertyPrefix(NamespacePropertyDescriptor.class);

    private EObject obj;
    private ILabelProvider labelProvider;
    List namespaces;

    /**
     * @see org.eclipse.ui.views.properties.IPropertyDescriptor#createPropertyEditor(org.eclipse.swt.widgets.Composite)
     * @since 4.3
     */
    public CellEditor createPropertyEditor( Composite theParent ) {
        CellEditor editor = new DialogCellEditor(theParent) {
            @Override
            protected Object openDialogBox( Control cellEditorWindow ) {
                ListDialog dialog = new ListDialog(cellEditorWindow.getShell());
                dialog.setInput(namespaces);
                dialog.setContentProvider(new ListSCP());
                dialog.setLabelProvider(getLabelProvider());
                dialog.setTitle(Util.getStringOrKey(PREFIX + "displayName")); //$NON-NLS-1$
                dialog.open();
                return null;
            }
        };
        return editor;
    }

    /**
     * @see org.eclipse.ui.views.properties.IPropertyDescriptor#getCategory()
     * @since 4.3
     */
    public String getCategory() {
        return Util.getStringOrKey(PREFIX + "category"); //$NON-NLS-1$
    }

    /**
     * @see org.eclipse.ui.views.properties.IPropertyDescriptor#getDescription()
     * @since 4.3
     */
    public String getDescription() {
        return Util.getStringOrKey(PREFIX + "description"); //$NON-NLS-1$
    }

    public String getDisplayName() {
        return Util.getStringOrKey(PREFIX + "displayName"); //$NON-NLS-1$
    }

    /**
     * @see org.eclipse.ui.views.properties.IPropertyDescriptor#getFilterFlags()
     * @since 4.3
     */
    public String[] getFilterFlags() {
        return null;
    }

    /**
     * @see com.metamatrix.modeler.ui.properties.ITransientPropertyDescriptor#getPropertyValue()
     * @since 4.3
     */
    public Object getPropertyValue() {
        if (this.obj == null) {
            throw new IllegalStateException(Util.getStringOrKey(PREFIX + "errorMsg.objectNotSet")); //$NON-NLS-1$
        }

        XSDSchema xsdObj = (XSDSchema)obj;

        Map qNameRoNamespaces = xsdObj.getQNamePrefixToNamespaceMap();
        if (qNameRoNamespaces != null && !qNameRoNamespaces.isEmpty()) {
            namespaces = new ArrayList();
            Iterator iter = qNameRoNamespaces.entrySet().iterator();
            while (iter.hasNext()) {
                Map.Entry entry = (Map.Entry)iter.next();
                if (entry.getKey() != null) {
                    namespaces.add("xmlns:" + entry.getKey() + "=" + entry.getValue()); //$NON-NLS-1$ //$NON-NLS-2$
                    // null key is used for default NS
                } else {
                    namespaces.add("xmlns[default]=" + entry.getValue()); //$NON-NLS-1$
                }
            }
        }

        if (namespaces != null && namespaces.size() > 0) {
            return namespaces.get(0);
        }
        return null;
    }

    /**
     * @see org.eclipse.ui.views.properties.IPropertyDescriptor#getHelpContextIds()
     * @since 4.3
     */
    public Object getHelpContextIds() {
        return null;
    }

    /**
     * @see org.eclipse.ui.views.properties.IPropertyDescriptor#getId()
     * @since 4.3
     */
    public Object getId() {
        return Util.getStringOrKey(PREFIX + "id"); //$NON-NLS-1$
    }

    /**
     * @see org.eclipse.ui.views.properties.IPropertyDescriptor#getLabelProvider()
     * @since 4.3
     */
    public ILabelProvider getLabelProvider() {
        if (labelProvider == null) {
            labelProvider = new LabelProvider();
        } // endif

        return labelProvider;
    }

    /**
     * @see org.eclipse.ui.views.properties.IPropertyDescriptor#isCompatibleWith(org.eclipse.ui.views.properties.IPropertyDescriptor)
     * @since 4.3
     */
    public boolean isCompatibleWith( IPropertyDescriptor theAnotherProperty ) {
        return false;
    }

    /**
     * @see com.metamatrix.modeler.ui.properties.ITransientPropertyDescriptor#setObject(java.lang.Object)
     * @since 4.3
     */
    public void setObject( Object theObject ) {
        if ((theObject != null) && supports(theObject)) {
            this.obj = (XSDSchema)theObject;
        } else {
            throw new IllegalArgumentException(Util.getString(PREFIX + "errorMsg.objectNotSupported", this.obj)); //$NON-NLS-1$
        }
    }

    /**
     * @see com.metamatrix.modeler.ui.properties.ITransientPropertyDescriptor#supports(java.lang.Object)
     * @since 4.3
     */
    public boolean supports( Object theObject ) {
        return (theObject instanceof XSDSchema);
    }

    class ListSCP implements IStructuredContentProvider {
        public Object[] getElements( Object inputElement ) {
            if (inputElement != null) {
                return ((Collection)inputElement).toArray();
            } // endif
            return new Object[0];
        }

        public void dispose() {
            // ignore
        }

        public void inputChanged( Viewer viewer,
                                  Object oldInput,
                                  Object newInput ) {
            // ignore
        }
    } // endclass ListSCP
}
