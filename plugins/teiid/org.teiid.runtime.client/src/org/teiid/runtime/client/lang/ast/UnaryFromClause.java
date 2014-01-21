/* Generated By:JJTree: Do not edit this line. UnaryFromClause.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=true,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package org.teiid.runtime.client.lang.ast;

import org.teiid.runtime.client.lang.parser.TeiidParser;
import org.teiid.runtime.client.lang.parser.AbstractTeiidParserVisitor;

public class UnaryFromClause extends FromClause {

    private GroupSymbol groupSymbol;
    
    private Command expandedCommand;
    
    public UnaryFromClause(int id) {
        super(id);
    }

    public UnaryFromClause(TeiidParser p, int id) {
        super(p, id);
    }

    /**
     * @return the groupSymbol
     */
    public GroupSymbol getGroupSymbol() {
        return groupSymbol;
    }

    /**
     * @param groupSymbol the groupSymbol to set
     */
    public void setGroupSymbol(GroupSymbol groupSymbol) {
        this.groupSymbol = groupSymbol;
    }

    /**
     * @return the expandedCommand
     */
    public Command getExpandedCommand() {
        return expandedCommand;
    }

    /**
     * @param expandedCommand the expandedCommand to set
     */
    public void setExpandedCommand(Command expandedCommand) {
        this.expandedCommand = expandedCommand;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((this.expandedCommand == null) ? 0 : this.expandedCommand.hashCode());
        result = prime * result + ((this.groupSymbol == null) ? 0 : this.groupSymbol.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!super.equals(obj)) return false;
        if (getClass() != obj.getClass()) return false;
        UnaryFromClause other = (UnaryFromClause)obj;
        if (this.expandedCommand == null) {
            if (other.expandedCommand != null) return false;
        } else if (!this.expandedCommand.equals(other.expandedCommand)) return false;
        if (this.groupSymbol == null) {
            if (other.groupSymbol != null) return false;
        } else if (!this.groupSymbol.equals(other.groupSymbol)) return false;
        return true;
    }

    /** Accept the visitor. **/
    @Override
    public void accept(AbstractTeiidParserVisitor visitor, Object data) {
        visitor.visit(this, data);
    }

    @Override
    public UnaryFromClause clone() {
        UnaryFromClause clone = new UnaryFromClause(this.parser, this.id);

        if(getGroupSymbol() != null)
            clone.setGroupSymbol(getGroupSymbol().clone());
        if(getExpandedCommand() != null)
            clone.setExpandedCommand(getExpandedCommand().clone());
        clone.setOptional(isOptional());
        clone.setMakeInd(isMakeInd());
        clone.setNoUnnest(isNoUnnest());
        clone.setMakeDep(isMakeDep());
        clone.setMakeNotDep(isMakeNotDep());
        clone.setPreserve(isPreserve());

        return clone;
    }

}
/* JavaCC - OriginalChecksum=363ebf15eecd5ebdaa922627c2a7905d (do not edit this line) */
