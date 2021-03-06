/*
 * JBoss, Home of Professional Open Source.
 *
 * See the LEGAL.txt file distributed with this work for information regarding copyright ownership and licensing.
 *
 * See the AUTHORS.txt file distributed with this work for a full listing of individual contributors.
 */
package org.teiid.designer.metamodels.diagram.util;

import java.util.List;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.teiid.designer.metamodels.diagram.AbstractDiagramEntity;
import org.teiid.designer.metamodels.diagram.Diagram;
import org.teiid.designer.metamodels.diagram.DiagramContainer;
import org.teiid.designer.metamodels.diagram.DiagramEntity;
import org.teiid.designer.metamodels.diagram.DiagramLink;
import org.teiid.designer.metamodels.diagram.DiagramPackage;
import org.teiid.designer.metamodels.diagram.DiagramPosition;
import org.teiid.designer.metamodels.diagram.PresentationEntity;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.teiid.designer.metamodels.diagram.DiagramPackage
 * @generated
 *
 * @since 8.0
 */
public class DiagramSwitch {

    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static DiagramPackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DiagramSwitch() {
        if (modelPackage == null) {
            modelPackage = DiagramPackage.eINSTANCE;
        }
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    public Object doSwitch(EObject theEObject) {
        return doSwitch(theEObject.eClass(), theEObject);
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    protected Object doSwitch(EClass theEClass, EObject theEObject) {
        if (theEClass.eContainer() == modelPackage) {
            return doSwitch(theEClass.getClassifierID(), theEObject);
        }
        List eSuperTypes = theEClass.getESuperTypes();
        return
            eSuperTypes.isEmpty() ?
                defaultCase(theEObject) :
                doSwitch((EClass)eSuperTypes.get(0), theEObject);
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    protected Object doSwitch(int classifierID, EObject theEObject) {
        switch (classifierID) {
            case DiagramPackage.DIAGRAM_ENTITY: {
                DiagramEntity diagramEntity = (DiagramEntity)theEObject;
                Object result = caseDiagramEntity(diagramEntity);
                if (result == null) result = caseAbstractDiagramEntity(diagramEntity);
                if (result == null) result = casePresentationEntity(diagramEntity);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DiagramPackage.PRESENTATION_ENTITY: {
                PresentationEntity presentationEntity = (PresentationEntity)theEObject;
                Object result = casePresentationEntity(presentationEntity);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DiagramPackage.DIAGRAM: {
                Diagram diagram = (Diagram)theEObject;
                Object result = caseDiagram(diagram);
                if (result == null) result = casePresentationEntity(diagram);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DiagramPackage.DIAGRAM_CONTAINER: {
                DiagramContainer diagramContainer = (DiagramContainer)theEObject;
                Object result = caseDiagramContainer(diagramContainer);
                if (result == null) result = casePresentationEntity(diagramContainer);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DiagramPackage.DIAGRAM_LINK: {
                DiagramLink diagramLink = (DiagramLink)theEObject;
                Object result = caseDiagramLink(diagramLink);
                if (result == null) result = caseAbstractDiagramEntity(diagramLink);
                if (result == null) result = casePresentationEntity(diagramLink);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DiagramPackage.ABSTRACT_DIAGRAM_ENTITY: {
                AbstractDiagramEntity abstractDiagramEntity = (AbstractDiagramEntity)theEObject;
                Object result = caseAbstractDiagramEntity(abstractDiagramEntity);
                if (result == null) result = casePresentationEntity(abstractDiagramEntity);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DiagramPackage.DIAGRAM_POSITION: {
                DiagramPosition diagramPosition = (DiagramPosition)theEObject;
                Object result = caseDiagramPosition(diagramPosition);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            default: return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpretting the object as an instance of '<em>Entity</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpretting the object as an instance of '<em>Entity</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseDiagramEntity(DiagramEntity object) {
        return null;
    }

    /**
     * Returns the result of interpretting the object as an instance of '<em>Presentation Entity</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpretting the object as an instance of '<em>Presentation Entity</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object casePresentationEntity(PresentationEntity object) {
        return null;
    }

    /**
     * Returns the result of interpretting the object as an instance of '<em>Diagram</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpretting the object as an instance of '<em>Diagram</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseDiagram(Diagram object) {
        return null;
    }

    /**
     * Returns the result of interpretting the object as an instance of '<em>Container</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpretting the object as an instance of '<em>Container</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseDiagramContainer(DiagramContainer object) {
        return null;
    }

    /**
     * Returns the result of interpretting the object as an instance of '<em>Link</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpretting the object as an instance of '<em>Link</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseDiagramLink(DiagramLink object) {
        return null;
    }

    /**
     * Returns the result of interpretting the object as an instance of '<em>Abstract Diagram Entity</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpretting the object as an instance of '<em>Abstract Diagram Entity</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseAbstractDiagramEntity(AbstractDiagramEntity object) {
        return null;
    }

    /**
     * Returns the result of interpretting the object as an instance of '<em>Position</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpretting the object as an instance of '<em>Position</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseDiagramPosition(DiagramPosition object) {
        return null;
    }

    /**
     * Returns the result of interpretting the object as an instance of '<em>EObject</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch, but this is the last case anyway.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpretting the object as an instance of '<em>EObject</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject)
     * @generated
     */
    public Object defaultCase(EObject object) {
        return null;
    }

} //DiagramSwitch
