/*
 * JBoss, Home of Professional Open Source.
*
* See the LEGAL.txt file distributed with this work for information regarding copyright ownership and licensing.
*
* See the AUTHORS.txt file distributed with this work for a full listing of individual contributors.
*/
package org.komodo.teiid.model.vdb;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.komodo.common.util.CollectionUtil;
import org.komodo.common.util.HashCode;
import org.komodo.common.util.Precondition;
import org.komodo.common.util.StringUtil;

/**
 * The Teiid VDB model business object.
 */
public class Schema extends VdbAdminObject {

    /**
     * VDB model property names.
     */
    public interface PropertyName extends VdbAdminObject.PropertyName {

        /**
         * The model metadata definition.
         */
        String METADATA = Schema.class.getSimpleName() + ".metadata"; //$NON-NLS-1$

        /**
         * The metadata type (defaults to 'DDL').
         */
        String METADATA_TYPE = Schema.class.getSimpleName() + ".metadataType"; //$NON-NLS-1$

        /**
         * A collection of model source information.
         */
        String SOURCES = Schema.class.getSimpleName() + ".sources"; //$NON-NLS-1$

        /**
         * The model type (like physical or virtual).
         */
        String TYPE = Schema.class.getSimpleName() + ".type"; //$NON-NLS-1$
    }

    /**
     * The default model definition metadata type. Value is {@value}.
     */
    public static final String DEFAULT_METADATA_TYPE = "DDL"; //$NON-NLS-1$

    private static final List<Source> NO_SOURCES = Collections.emptyList();

    private String metadata; // model definition written in DDL
    private String metadataType;
    private List<Source> sources;
    private String type;

    /**
     * Generates a property change event if the collection of schema/model sources is changed.
     * 
     * @param newSource the schema/model source being added (cannot be <code>null</code>)
     */
    public void addSource(final Source newSource) {
        Precondition.notNull(newSource, "newSource"); //$NON-NLS-1$

        if (this.sources == null) {
            this.sources = new ArrayList<Source>();
        }

        final List<Source> oldValue = getSources();

        if (this.sources.add(newSource)) {
            firePropertyChangeEvent(PropertyName.SOURCES, oldValue, getSources());
        } else if (this.sources.isEmpty()) {
            this.sources = null;
        }
    }

    /**
     * {@inheritDoc}
     *
     * @see org.komodo.teiid.model.vdb.VdbAdminObject#equals(java.lang.Object)
     */
    @Override
    public boolean equals(final Object that) {
        if (super.equals(that)) {
            final Schema thatSchema = (Schema)that;
            return (StringUtil.matches(this.type, thatSchema.type) && StringUtil.matches(this.metadata, thatSchema.metadata)
                    && StringUtil.matches(this.metadataType, thatSchema.metadataType) && CollectionUtil.matches(this.sources,
                                                                                                                thatSchema.sources));
        }

        return false;
    }

    /**
     * @return the metadata definition (can be <code>null</code> or empty)
     */
    public String getMetadata() {
        return this.metadata;
    }

    /**
     * @return the type of the metadata definition (can be <code>null</code> or empty)
     */
    public String getMetadataType() {
        return this.metadataType;
    }

    /**
     * @return an unmodifiable collection of model sources (never <code>null</code> but can be empty)
     */
    public List<Source> getSources() {
        if (this.sources == null) {
            return NO_SOURCES;
        }

        return Collections.unmodifiableList(this.sources);
    }

    /**
     * @return the type the model/schema type (can be <code>null</code> or empty)
     */
    public String getType() {
        return this.type;
    }

    /**
     * {@inheritDoc}
     *
     * @see org.komodo.teiid.model.vdb.VdbObject#hashCode()
     */
    @Override
    public int hashCode() {
        return HashCode.compute(super.hashCode(), this.type, this.metadata, this.metadataType, this.sources);
    }

    /**
     * Generates a property change event if the collection of schema/model sources is changed.
     * 
     * @param sourceToDelete the schema/model source being deleted (cannot be <code>null</code>)
     */
    public void removeSource(final Entry sourceToDelete) {
        Precondition.notNull(sourceToDelete, "sourceToDelete"); //$NON-NLS-1$

        if (this.sources != null) {
            final List<Source> oldValue = getSources();

            if (this.sources.remove(sourceToDelete)) {
                if (this.sources.isEmpty()) {
                    this.sources = null;
                }

                firePropertyChangeEvent(PropertyName.SOURCES, oldValue, getSources());
            }
        }
    }

    /**
     * Generates a property change event if the metadata definition is changed.
     * 
     * @param newMetadata the new metadata definition (can be <code>null</code> or empty)
     */
    public void setMetadata(final String newMetadata) {
        if (!StringUtil.matches(this.metadata, newMetadata)) {
            final String oldValue = this.metadata;
            this.metadata = newMetadata;
            firePropertyChangeEvent(PropertyName.METADATA, oldValue, this.metadata);

            assert StringUtil.matches(this.metadata, newMetadata);
            assert !StringUtil.matches(this.metadata, oldValue);
        }
    }

    /**
     * Generates a property change event if the schema/model type is changed.
     * 
     * @param newMetadataType the new schema/model type (can be <code>null</code> or empty)
     */
    public void setMetadataType(final String newMetadataType) {
        if (!StringUtil.matches(this.metadataType, newMetadataType)) {
            final String oldValue = this.metadataType;
            this.metadataType = newMetadataType;
            firePropertyChangeEvent(PropertyName.METADATA_TYPE, oldValue, this.metadataType);

            assert StringUtil.matches(this.metadataType, newMetadataType);
            assert !StringUtil.matches(this.metadataType, oldValue);
        }
    }

    /**
     * Generates a property change event if the schema/model type is changed.
     * 
     * @param newType the new schema/model type (can be <code>null</code> or empty)
     */
    public void setType(final String newType) {
        if (!StringUtil.matches(this.type, newType)) {
            final String oldValue = this.type;
            this.type = newType;
            firePropertyChangeEvent(PropertyName.TYPE, oldValue, this.type);

            assert StringUtil.matches(this.type, newType);
            assert !StringUtil.matches(this.type, oldValue);
        }
    }

}