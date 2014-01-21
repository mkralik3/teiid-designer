/* Generated By:JJTree: Do not edit this line. WindowSpecification.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=true,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=,NODE_EXTENDS=,NODE_FACTORY=TeiidNodeFactory,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package org.teiid.runtime.client.lang.ast;

import java.util.List;
import org.teiid.runtime.client.lang.parser.AbstractTeiidParserVisitor;
import org.teiid.runtime.client.lang.parser.TeiidParser;

public class WindowSpecification extends SimpleNode {

    private List<Expression> partition;

    private OrderBy orderBy;

    public WindowSpecification(int id) {
        super(id);
    }

    public WindowSpecification(TeiidParser p, int id) {
        super(p, id);
    }

    /**
     * @return the partition
     */
    public List<Expression> getPartition() {
        return this.partition;
    }

    /**
     * @param partition the partition to set
     */
    public void setPartition(List<Expression> partition) {
        this.partition = partition;
    }

    /**
     * @return the orderBy
     */
    public OrderBy getOrderBy() {
        return this.orderBy;
    }

    /**
     * @param orderBy the orderBy to set
     */
    public void setOrderBy(OrderBy orderBy) {
        this.orderBy = orderBy;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((this.orderBy == null) ? 0 : this.orderBy.hashCode());
        result = prime * result + ((this.partition == null) ? 0 : this.partition.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!super.equals(obj)) return false;
        if (getClass() != obj.getClass()) return false;
        WindowSpecification other = (WindowSpecification)obj;
        if (this.orderBy == null) {
            if (other.orderBy != null) return false;
        } else if (!this.orderBy.equals(other.orderBy)) return false;
        if (this.partition == null) {
            if (other.partition != null) return false;
        } else if (!this.partition.equals(other.partition)) return false;
        return true;
    }

    /** Accept the visitor. **/
    @Override
    public void accept(AbstractTeiidParserVisitor visitor, Object data) {
        visitor.visit(this, data);
    }

    @Override
    public WindowSpecification clone() {
        WindowSpecification clone = new WindowSpecification(this.parser, this.id);

        if(getOrderBy() != null)
            clone.setOrderBy(getOrderBy().clone());
        if(getPartition() != null)
            clone.setPartition(cloneList(getPartition()));

        return clone;
    }

}
/* JavaCC - OriginalChecksum=955691556e321ccc1bc9cfb1cbe30f7c (do not edit this line) */
