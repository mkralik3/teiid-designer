/* Generated By:JJTree: Do not edit this line. Insert.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=true,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package org.teiid.runtime.client.lang.ast;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import org.teiid.runtime.client.lang.parser.AbstractTeiidParserVisitor;
import org.teiid.runtime.client.lang.parser.TeiidParser;

public class Insert extends Command {

    /** Identifies the group to be udpdated. */
    private GroupSymbol group;

    private List<ElementSymbol> variables = new LinkedList<ElementSymbol>();

    private List<Expression> values = new LinkedList<Expression>();
    
    private QueryCommand queryExpression;

    private Criteria constraint;
    
    private boolean merge;
    
    public Insert(int id) {
        super(id);
    }

    public Insert(TeiidParser p, int id) {
        super(p, id);
    }

    /**
     * Returns the group being inserted into
     * @return Group being inserted into
     */
    public GroupSymbol getGroup() {
        return group;
    }

    /**
     * Set the group for this insert statement
     * @param group Group to be inserted into
     */
    public void setGroup(GroupSymbol group) {
        this.group = group;
    }
    
    /**
     * Return an ordered List of variables, may be null if no columns were specified
     * @return List of {@link ElementSymbol}
     */
    public List<ElementSymbol> getVariables() {
        return variables;
    }

    /**
     * Add a variable to end of list
     * @param var Variable to add to the list
     */
    public void addVariable(ElementSymbol var) {
        variables.add(var);
    }

    /**
     * Add a collection of variables to end of list
     * @param vars Variables to add to the list - collection of ElementSymbol
     */
    public void addVariables(Collection<ElementSymbol> vars) {
        variables.addAll(vars);
    }

    /**
     * Set a collection of variables that replace the existing variables
     * @param vars Variables to be set on this object (ElementSymbols)
     */
    public void setVariables(Collection<ElementSymbol> vars) {
        this.variables.clear();        
        this.variables.addAll(vars);
    }

    /**
     * Returns a list of values to insert
     * to be inserted.
     * @return List of {@link Expression}s
     */
    public List<Expression> getValues() {
        return this.values;
    }

    /**
     * Sets the values to be inserted.
     * @param values List of {@link Expression}s
     */
    public void setValues(List<Expression> values) {
        this.values.clear();
        this.values.addAll(values);
    }
    

    /**
     * Adds a value to the list of values
     * @param value Expression to be added to the list of values
     */
    public void addValue(Expression value) {
        values.add(value);
    }

    public QueryCommand getQueryExpression() {
        return this.queryExpression;        
    }

    public void setQueryExpression( QueryCommand query ) {
        this.queryExpression = query;        
    }

    public Criteria getConstraint() {
        return constraint;
    }
    
    public void setConstraint(Criteria constraint) {
        this.constraint = constraint;
    }
    
    public boolean isMerge() {
        return merge;
    }
    
    public void setMerge(boolean merge) {
        this.merge = merge;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((this.constraint == null) ? 0 : this.constraint.hashCode());
        result = prime * result + ((this.group == null) ? 0 : this.group.hashCode());
        result = prime * result + (this.merge ? 1231 : 1237);
        result = prime * result + ((this.queryExpression == null) ? 0 : this.queryExpression.hashCode());
        result = prime * result + ((this.values == null) ? 0 : this.values.hashCode());
        result = prime * result + ((this.variables == null) ? 0 : this.variables.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!super.equals(obj)) return false;
        if (getClass() != obj.getClass()) return false;
        Insert other = (Insert)obj;
        if (this.constraint == null) {
            if (other.constraint != null) return false;
        } else if (!this.constraint.equals(other.constraint)) return false;
        if (this.group == null) {
            if (other.group != null) return false;
        } else if (!this.group.equals(other.group)) return false;
        if (this.merge != other.merge) return false;
        if (this.queryExpression == null) {
            if (other.queryExpression != null) return false;
        } else if (!this.queryExpression.equals(other.queryExpression)) return false;
        if (this.values == null) {
            if (other.values != null) return false;
        } else if (!this.values.equals(other.values)) return false;
        if (this.variables == null) {
            if (other.variables != null) return false;
        } else if (!this.variables.equals(other.variables)) return false;
        return true;
    }

    /** Accept the visitor. **/
    @Override
    public void accept(AbstractTeiidParserVisitor visitor, Object data) {
        visitor.visit(this, data);
    }

    @Override
    public Insert clone() {
        Insert clone = new Insert(this.parser, this.id);

        if(getGroup() != null)
            clone.setGroup(getGroup().clone());
        if(getVariables() != null)
            clone.setVariables(cloneList(getVariables()));
        if(getValues() != null)
            clone.setValues(cloneList(getValues()));
        if(getQueryExpression() != null)
            clone.setQueryExpression(getQueryExpression().clone());
        if(getConstraint() != null)
            clone.setConstraint(getConstraint().clone());
        clone.setMerge(isMerge());
        if(getSourceHint() != null)
            clone.setSourceHint(getSourceHint());
        if(getOption() != null)
            clone.setOption(getOption().clone());

        return clone;
    }

}
/* JavaCC - OriginalChecksum=3a8a1c21abb5c92a3cb53631c04d20bb (do not edit this line) */
