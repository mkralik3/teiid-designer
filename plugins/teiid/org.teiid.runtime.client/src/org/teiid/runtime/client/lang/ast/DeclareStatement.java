/* Generated By:JJTree: Do not edit this line. DeclareStatement.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=true,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package org.teiid.runtime.client.lang.ast;

import org.teiid.runtime.client.lang.parser.TeiidParser;
import org.teiid.runtime.client.lang.parser.AbstractTeiidParserVisitor;

public class DeclareStatement extends AssignmentStatement {

    // type of the variable
    private String varType;
    
    public DeclareStatement(int id) {
        super(id);
    }

    public DeclareStatement(TeiidParser p, int id) {
        super(p, id);
    }

    /**
     * Get the type of this variable declared in this statement.
     * @return A string giving the variable type
     */
    public String getVariableType() {
        return varType;
    }
    
    /**
     * Set the type of this variable declared in this statement.
     * @param varType A string giving the variable type
     */
    public void setVariableType(String varType) {
        this.varType = varType;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((this.varType == null) ? 0 : this.varType.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!super.equals(obj)) return false;
        if (getClass() != obj.getClass()) return false;
        DeclareStatement other = (DeclareStatement)obj;
        if (this.varType == null) {
            if (other.varType != null) return false;
        } else if (!this.varType.equals(other.varType)) return false;
        return true;
    }

    /** Accept the visitor. **/
    @Override
    public void accept(AbstractTeiidParserVisitor visitor, Object data) {
        visitor.visit(this, data);
    }

    @Override
    public DeclareStatement clone() {
        DeclareStatement clone = new DeclareStatement(this.parser, this.id);

        if(getVariableType() != null)
            clone.setVariableType(getVariableType());
        if(getExpression() != null)
            clone.setExpression(getExpression().clone());
        if(getCommand() != null)
            clone.setCommand(getCommand().clone());
        if(getVariable() != null)
            clone.setVariable(getVariable().clone());
        if(getValue() != null)
            clone.setValue(getValue().clone());

        return clone;
    }

}
/* JavaCC - OriginalChecksum=b8ea9db34b18b50cd3c1a83bc3fa40cd (do not edit this line) */
