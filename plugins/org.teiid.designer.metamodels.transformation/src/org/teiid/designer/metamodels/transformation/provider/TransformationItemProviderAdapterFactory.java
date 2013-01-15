/*
 * JBoss, Home of Professional Open Source.
 *
 * See the LEGAL.txt file distributed with this work for information regarding copyright ownership and licensing.
 *
 * See the AUTHORS.txt file distributed with this work for a full listing of individual contributors.
 */
package org.teiid.designer.metamodels.transformation.provider;

import java.util.ArrayList;
import java.util.Collection;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.teiid.designer.metamodels.transformation.util.TransformationAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 *
 * @since 8.0
 */
public class TransformationItemProviderAdapterFactory extends TransformationAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final String copyright = "See the LEGAL.txt file distributed with this work for information regarding copyright ownership and licensing."; //$NON-NLS-1$

    /**
     * This keeps track of the root adapter factory that delegates to this adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ComposedAdapterFactory parentAdapterFactory;

    /**
     * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected IChangeNotifier changeNotifier = new ChangeNotifier();

    /**
     * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected Collection supportedTypes = new ArrayList();

    /**
     * This constructs an instance.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TransformationItemProviderAdapterFactory() {
        supportedTypes.add(IEditingDomainItemProvider.class);
        supportedTypes.add(IStructuredItemContentProvider.class);
        supportedTypes.add(ITreeItemContentProvider.class);
        supportedTypes.add(IItemLabelProvider.class);
        supportedTypes.add(IItemPropertySource.class);		
    }

    /**
     * This keeps track of the one adapter used for all {@link org.teiid.designer.metamodels.transformation.TransformationContainer} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TransformationContainerItemProvider transformationContainerItemProvider;

    /**
     * This creates an adapter for a {@link org.teiid.designer.metamodels.transformation.TransformationContainer}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createTransformationContainerAdapter() {
        if (transformationContainerItemProvider == null) {
            transformationContainerItemProvider = new TransformationContainerItemProvider(this);
        }

        return transformationContainerItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.teiid.designer.metamodels.transformation.SqlTransformation} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SqlTransformationItemProvider sqlTransformationItemProvider;

    /**
     * This creates an adapter for a {@link org.teiid.designer.metamodels.transformation.SqlTransformation}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createSqlTransformationAdapter() {
        if (sqlTransformationItemProvider == null) {
            sqlTransformationItemProvider = new SqlTransformationItemProvider(this);
        }

        return sqlTransformationItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.teiid.designer.metamodels.transformation.FragmentMappingRoot} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected FragmentMappingRootItemProvider fragmentMappingRootItemProvider;

    /**
     * This creates an adapter for a {@link org.teiid.designer.metamodels.transformation.FragmentMappingRoot}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createFragmentMappingRootAdapter() {
        if (fragmentMappingRootItemProvider == null) {
            fragmentMappingRootItemProvider = new FragmentMappingRootItemProvider(this);
        }

        return fragmentMappingRootItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.teiid.designer.metamodels.transformation.TreeMappingRoot} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TreeMappingRootItemProvider treeMappingRootItemProvider;

    /**
     * This creates an adapter for a {@link org.teiid.designer.metamodels.transformation.TreeMappingRoot}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createTreeMappingRootAdapter() {
        if (treeMappingRootItemProvider == null) {
            treeMappingRootItemProvider = new TreeMappingRootItemProvider(this);
        }

        return treeMappingRootItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.teiid.designer.metamodels.transformation.MappingClass} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected MappingClassItemProvider mappingClassItemProvider;

    /**
     * This creates an adapter for a {@link org.teiid.designer.metamodels.transformation.MappingClass}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createMappingClassAdapter() {
        if (mappingClassItemProvider == null) {
            mappingClassItemProvider = new MappingClassItemProvider(this);
        }

        return mappingClassItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.teiid.designer.metamodels.transformation.MappingClassColumn} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected MappingClassColumnItemProvider mappingClassColumnItemProvider;

    /**
     * This creates an adapter for a {@link org.teiid.designer.metamodels.transformation.MappingClassColumn}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createMappingClassColumnAdapter() {
        if (mappingClassColumnItemProvider == null) {
            mappingClassColumnItemProvider = new MappingClassColumnItemProvider(this);
        }

        return mappingClassColumnItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.teiid.designer.metamodels.transformation.StagingTable} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected StagingTableItemProvider stagingTableItemProvider;

    /**
     * This creates an adapter for a {@link org.teiid.designer.metamodels.transformation.StagingTable}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createStagingTableAdapter() {
        if (stagingTableItemProvider == null) {
            stagingTableItemProvider = new StagingTableItemProvider(this);
        }

        return stagingTableItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.teiid.designer.metamodels.transformation.MappingClassSet} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected MappingClassSetItemProvider mappingClassSetItemProvider;

    /**
     * This creates an adapter for a {@link org.teiid.designer.metamodels.transformation.MappingClassSet}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createMappingClassSetAdapter() {
        if (mappingClassSetItemProvider == null) {
            mappingClassSetItemProvider = new MappingClassSetItemProvider(this);
        }

        return mappingClassSetItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.teiid.designer.metamodels.transformation.MappingClassSetContainer} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected MappingClassSetContainerItemProvider mappingClassSetContainerItemProvider;

    /**
     * This creates an adapter for a {@link org.teiid.designer.metamodels.transformation.MappingClassSetContainer}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createMappingClassSetContainerAdapter() {
        if (mappingClassSetContainerItemProvider == null) {
            mappingClassSetContainerItemProvider = new MappingClassSetContainerItemProvider(this);
        }

        return mappingClassSetContainerItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.teiid.designer.metamodels.transformation.InputParameter} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected InputParameterItemProvider inputParameterItemProvider;

    /**
     * This creates an adapter for a {@link org.teiid.designer.metamodels.transformation.InputParameter}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createInputParameterAdapter() {
        if (inputParameterItemProvider == null) {
            inputParameterItemProvider = new InputParameterItemProvider(this);
        }

        return inputParameterItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.teiid.designer.metamodels.transformation.InputSet} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected InputSetItemProvider inputSetItemProvider;

    /**
     * This creates an adapter for a {@link org.teiid.designer.metamodels.transformation.InputSet}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createInputSetAdapter() {
        if (inputSetItemProvider == null) {
            inputSetItemProvider = new InputSetItemProvider(this);
        }

        return inputSetItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.teiid.designer.metamodels.transformation.InputBinding} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected InputBindingItemProvider inputBindingItemProvider;

    /**
     * This creates an adapter for a {@link org.teiid.designer.metamodels.transformation.InputBinding}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createInputBindingAdapter() {
        if (inputBindingItemProvider == null) {
            inputBindingItemProvider = new InputBindingItemProvider(this);
        }

        return inputBindingItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.teiid.designer.metamodels.transformation.DataFlowMappingRoot} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DataFlowMappingRootItemProvider dataFlowMappingRootItemProvider;

    /**
     * This creates an adapter for a {@link org.teiid.designer.metamodels.transformation.DataFlowMappingRoot}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createDataFlowMappingRootAdapter() {
        if (dataFlowMappingRootItemProvider == null) {
            dataFlowMappingRootItemProvider = new DataFlowMappingRootItemProvider(this);
        }

        return dataFlowMappingRootItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.teiid.designer.metamodels.transformation.DataFlowNode} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DataFlowNodeItemProvider dataFlowNodeItemProvider;

    /**
     * This creates an adapter for a {@link org.teiid.designer.metamodels.transformation.DataFlowNode}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createDataFlowNodeAdapter() {
        if (dataFlowNodeItemProvider == null) {
            dataFlowNodeItemProvider = new DataFlowNodeItemProvider(this);
        }

        return dataFlowNodeItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.teiid.designer.metamodels.transformation.DataFlowLink} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DataFlowLinkItemProvider dataFlowLinkItemProvider;

    /**
     * This creates an adapter for a {@link org.teiid.designer.metamodels.transformation.DataFlowLink}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createDataFlowLinkAdapter() {
        if (dataFlowLinkItemProvider == null) {
            dataFlowLinkItemProvider = new DataFlowLinkItemProvider(this);
        }

        return dataFlowLinkItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.teiid.designer.metamodels.transformation.Expression} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ExpressionItemProvider expressionItemProvider;

    /**
     * This creates an adapter for a {@link org.teiid.designer.metamodels.transformation.Expression}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createExpressionAdapter() {
        if (expressionItemProvider == null) {
            expressionItemProvider = new ExpressionItemProvider(this);
        }

        return expressionItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.teiid.designer.metamodels.transformation.TargetNode} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TargetNodeItemProvider targetNodeItemProvider;

    /**
     * This creates an adapter for a {@link org.teiid.designer.metamodels.transformation.TargetNode}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createTargetNodeAdapter() {
        if (targetNodeItemProvider == null) {
            targetNodeItemProvider = new TargetNodeItemProvider(this);
        }

        return targetNodeItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.teiid.designer.metamodels.transformation.SourceNode} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SourceNodeItemProvider sourceNodeItemProvider;

    /**
     * This creates an adapter for a {@link org.teiid.designer.metamodels.transformation.SourceNode}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createSourceNodeAdapter() {
        if (sourceNodeItemProvider == null) {
            sourceNodeItemProvider = new SourceNodeItemProvider(this);
        }

        return sourceNodeItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.teiid.designer.metamodels.transformation.OperationNodeGroup} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected OperationNodeGroupItemProvider operationNodeGroupItemProvider;

    /**
     * This creates an adapter for a {@link org.teiid.designer.metamodels.transformation.OperationNodeGroup}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createOperationNodeGroupAdapter() {
        if (operationNodeGroupItemProvider == null) {
            operationNodeGroupItemProvider = new OperationNodeGroupItemProvider(this);
        }

        return operationNodeGroupItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.teiid.designer.metamodels.transformation.OperationNode} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected OperationNodeItemProvider operationNodeItemProvider;

    /**
     * This creates an adapter for a {@link org.teiid.designer.metamodels.transformation.OperationNode}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createOperationNodeAdapter() {
        if (operationNodeItemProvider == null) {
            operationNodeItemProvider = new OperationNodeItemProvider(this);
        }

        return operationNodeItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.teiid.designer.metamodels.transformation.JoinNode} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected JoinNodeItemProvider joinNodeItemProvider;

    /**
     * This creates an adapter for a {@link org.teiid.designer.metamodels.transformation.JoinNode}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createJoinNodeAdapter() {
        if (joinNodeItemProvider == null) {
            joinNodeItemProvider = new JoinNodeItemProvider(this);
        }

        return joinNodeItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.teiid.designer.metamodels.transformation.UnionNode} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected UnionNodeItemProvider unionNodeItemProvider;

    /**
     * This creates an adapter for a {@link org.teiid.designer.metamodels.transformation.UnionNode}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createUnionNodeAdapter() {
        if (unionNodeItemProvider == null) {
            unionNodeItemProvider = new UnionNodeItemProvider(this);
        }

        return unionNodeItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.teiid.designer.metamodels.transformation.ProjectionNode} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ProjectionNodeItemProvider projectionNodeItemProvider;

    /**
     * This creates an adapter for a {@link org.teiid.designer.metamodels.transformation.ProjectionNode}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createProjectionNodeAdapter() {
        if (projectionNodeItemProvider == null) {
            projectionNodeItemProvider = new ProjectionNodeItemProvider(this);
        }

        return projectionNodeItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.teiid.designer.metamodels.transformation.FilterNode} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected FilterNodeItemProvider filterNodeItemProvider;

    /**
     * This creates an adapter for a {@link org.teiid.designer.metamodels.transformation.FilterNode}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createFilterNodeAdapter() {
        if (filterNodeItemProvider == null) {
            filterNodeItemProvider = new FilterNodeItemProvider(this);
        }

        return filterNodeItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.teiid.designer.metamodels.transformation.GroupingNode} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected GroupingNodeItemProvider groupingNodeItemProvider;

    /**
     * This creates an adapter for a {@link org.teiid.designer.metamodels.transformation.GroupingNode}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createGroupingNodeAdapter() {
        if (groupingNodeItemProvider == null) {
            groupingNodeItemProvider = new GroupingNodeItemProvider(this);
        }

        return groupingNodeItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.teiid.designer.metamodels.transformation.DupRemovalNode} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DupRemovalNodeItemProvider dupRemovalNodeItemProvider;

    /**
     * This creates an adapter for a {@link org.teiid.designer.metamodels.transformation.DupRemovalNode}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createDupRemovalNodeAdapter() {
        if (dupRemovalNodeItemProvider == null) {
            dupRemovalNodeItemProvider = new DupRemovalNodeItemProvider(this);
        }

        return dupRemovalNodeItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.teiid.designer.metamodels.transformation.SortNode} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SortNodeItemProvider sortNodeItemProvider;

    /**
     * This creates an adapter for a {@link org.teiid.designer.metamodels.transformation.SortNode}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createSortNodeAdapter() {
        if (sortNodeItemProvider == null) {
            sortNodeItemProvider = new SortNodeItemProvider(this);
        }

        return sortNodeItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.teiid.designer.metamodels.transformation.SqlNode} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SqlNodeItemProvider sqlNodeItemProvider;

    /**
     * This creates an adapter for a {@link org.teiid.designer.metamodels.transformation.SqlNode}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createSqlNodeAdapter() {
        if (sqlNodeItemProvider == null) {
            sqlNodeItemProvider = new SqlNodeItemProvider(this);
        }

        return sqlNodeItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.teiid.designer.metamodels.transformation.XQueryTransformationMappingRoot} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected XQueryTransformationMappingRootItemProvider xQueryTransformationMappingRootItemProvider;

    /**
     * This creates an adapter for a {@link org.teiid.designer.metamodels.transformation.XQueryTransformationMappingRoot}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createXQueryTransformationMappingRootAdapter() {
        if (xQueryTransformationMappingRootItemProvider == null) {
            xQueryTransformationMappingRootItemProvider = new XQueryTransformationMappingRootItemProvider(this);
        }

        return xQueryTransformationMappingRootItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.teiid.designer.metamodels.transformation.XQueryTransformation} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected XQueryTransformationItemProvider xQueryTransformationItemProvider;

    /**
     * This creates an adapter for a {@link org.teiid.designer.metamodels.transformation.XQueryTransformation}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createXQueryTransformationAdapter() {
        if (xQueryTransformationItemProvider == null) {
            xQueryTransformationItemProvider = new XQueryTransformationItemProvider(this);
        }

        return xQueryTransformationItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.teiid.designer.metamodels.transformation.TransformationMapping} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TransformationMappingItemProvider transformationMappingItemProvider;

    /**
     * This creates an adapter for a {@link org.teiid.designer.metamodels.transformation.TransformationMapping}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createTransformationMappingAdapter() {
        if (transformationMappingItemProvider == null) {
            transformationMappingItemProvider = new TransformationMappingItemProvider(this);
        }

        return transformationMappingItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.teiid.designer.metamodels.transformation.SqlAlias} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SqlAliasItemProvider sqlAliasItemProvider;

    /**
     * This creates an adapter for a {@link org.teiid.designer.metamodels.transformation.SqlAlias}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createSqlAliasAdapter() {
        if (sqlAliasItemProvider == null) {
            sqlAliasItemProvider = new SqlAliasItemProvider(this);
        }

        return sqlAliasItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.teiid.designer.metamodels.transformation.SqlTransformationMappingRoot} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SqlTransformationMappingRootItemProvider sqlTransformationMappingRootItemProvider;

    /**
     * This creates an adapter for a {@link org.teiid.designer.metamodels.transformation.SqlTransformationMappingRoot}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createSqlTransformationMappingRootAdapter() {
        if (sqlTransformationMappingRootItemProvider == null) {
            sqlTransformationMappingRootItemProvider = new SqlTransformationMappingRootItemProvider(this);
        }

        return sqlTransformationMappingRootItemProvider;
    }

    /**
     * This returns the root adapter factory that contains this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
	public ComposeableAdapterFactory getRootAdapterFactory() {
        return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
    }

    /**
     * This sets the composed adapter factory that contains this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
        this.parentAdapterFactory = parentAdapterFactory;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isFactoryForType(Object type) {
        return supportedTypes.contains(type) || super.isFactoryForType(type);
    }

    /**
     * This implementation substitutes the factory itself as the key for the adapter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter adapt(Notifier notifier, Object type) {
        return super.adapt(notifier, this);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object adapt(Object object, Object type) {
        if (isFactoryForType(type)) {
            Object adapter = super.adapt(object, type);
            if (!(type instanceof Class) || (((Class)type).isInstance(adapter))) {
                return adapter;
            }
        }

        return null;
    }

    /**
     * This adds a listener.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
	public void addListener(INotifyChangedListener notifyChangedListener) {
        changeNotifier.addListener(notifyChangedListener);
    }

    /**
     * This removes a listener.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
	public void removeListener(INotifyChangedListener notifyChangedListener) {
        changeNotifier.removeListener(notifyChangedListener);
    }

    /**
     * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
	public void fireNotifyChanged(Notification notification) {
        changeNotifier.fireNotifyChanged(notification);

        if (parentAdapterFactory != null) {
            parentAdapterFactory.fireNotifyChanged(notification);
        }
    }

    /**
     * This disposes all of the item providers created by this factory. 
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
	public void dispose() {
        if (transformationContainerItemProvider != null) transformationContainerItemProvider.dispose();
        if (sqlTransformationItemProvider != null) sqlTransformationItemProvider.dispose();
        if (transformationMappingItemProvider != null) transformationMappingItemProvider.dispose();
        if (sqlAliasItemProvider != null) sqlAliasItemProvider.dispose();
        if (sqlTransformationMappingRootItemProvider != null) sqlTransformationMappingRootItemProvider.dispose();
        if (fragmentMappingRootItemProvider != null) fragmentMappingRootItemProvider.dispose();
        if (treeMappingRootItemProvider != null) treeMappingRootItemProvider.dispose();
        if (mappingClassItemProvider != null) mappingClassItemProvider.dispose();
        if (mappingClassColumnItemProvider != null) mappingClassColumnItemProvider.dispose();
        if (stagingTableItemProvider != null) stagingTableItemProvider.dispose();
        if (mappingClassSetItemProvider != null) mappingClassSetItemProvider.dispose();
        if (mappingClassSetContainerItemProvider != null) mappingClassSetContainerItemProvider.dispose();
        if (inputParameterItemProvider != null) inputParameterItemProvider.dispose();
        if (inputSetItemProvider != null) inputSetItemProvider.dispose();
        if (inputBindingItemProvider != null) inputBindingItemProvider.dispose();
        if (dataFlowMappingRootItemProvider != null) dataFlowMappingRootItemProvider.dispose();
        if (dataFlowNodeItemProvider != null) dataFlowNodeItemProvider.dispose();
        if (dataFlowLinkItemProvider != null) dataFlowLinkItemProvider.dispose();
        if (expressionItemProvider != null) expressionItemProvider.dispose();
        if (targetNodeItemProvider != null) targetNodeItemProvider.dispose();
        if (sourceNodeItemProvider != null) sourceNodeItemProvider.dispose();
        if (operationNodeGroupItemProvider != null) operationNodeGroupItemProvider.dispose();
        if (operationNodeItemProvider != null) operationNodeItemProvider.dispose();
        if (joinNodeItemProvider != null) joinNodeItemProvider.dispose();
        if (unionNodeItemProvider != null) unionNodeItemProvider.dispose();
        if (projectionNodeItemProvider != null) projectionNodeItemProvider.dispose();
        if (filterNodeItemProvider != null) filterNodeItemProvider.dispose();
        if (groupingNodeItemProvider != null) groupingNodeItemProvider.dispose();
        if (dupRemovalNodeItemProvider != null) dupRemovalNodeItemProvider.dispose();
        if (sortNodeItemProvider != null) sortNodeItemProvider.dispose();
        if (sqlNodeItemProvider != null) sqlNodeItemProvider.dispose();
        if (xQueryTransformationMappingRootItemProvider != null) xQueryTransformationMappingRootItemProvider.dispose();
        if (xQueryTransformationItemProvider != null) xQueryTransformationItemProvider.dispose();
    }

}