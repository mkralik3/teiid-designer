/* Generated By:JJTree: Do not edit this line. BranchingStatement.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=true,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package org.teiid.runtime.client.lang.ast;

import org.teiid.runtime.client.lang.parser.TeiidParser;
import org.teiid.runtime.client.lang.parser.AbstractTeiidParserVisitor;

public class BranchingStatement extends Statement {

    public enum BranchingMode {
        /**
         * Teiid specific - only allowed to target loops
         */
        BREAK,
        /**
         * Teiid specific - only allowed to target loops
         */
        CONTINUE,
        /**
         * ANSI - allowed to leave any block 
         */
        LEAVE
    }
    
    private String label;

    private BranchingMode mode = BranchingMode.BREAK;

    public BranchingStatement(int id) {
        super(id);
    }

    public BranchingStatement(TeiidParser p, int id) {
        super(p, id);
    }

    public String getLabel() {
        return label;
    }
    
    public void setLabel(String label) {
        this.label = label;
    }
    
    public void setMode(BranchingMode mode) {
        this.mode = mode;
    }
    
    public BranchingMode getMode() {
        return mode;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((this.label == null) ? 0 : this.label.hashCode());
        result = prime * result + ((this.mode == null) ? 0 : this.mode.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!super.equals(obj)) return false;
        if (getClass() != obj.getClass()) return false;
        BranchingStatement other = (BranchingStatement)obj;
        if (this.label == null) {
            if (other.label != null) return false;
        } else if (!this.label.equals(other.label)) return false;
        if (this.mode != other.mode) return false;
        return true;
    }

    /** Accept the visitor. **/
    @Override
    public void accept(AbstractTeiidParserVisitor visitor, Object data) {
        visitor.visit(this, data);
    }

    @Override
    public BranchingStatement clone() {
        BranchingStatement clone = new BranchingStatement(this.parser, this.id);

        if(getLabel() != null)
            clone.setLabel(getLabel());
        if(getMode() != null)
            clone.setMode(getMode());

        return clone;
    }

}
/* JavaCC - OriginalChecksum=bdaeabb3c22da3651d61cf55bef53168 (do not edit this line) */
