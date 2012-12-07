/*
 * JBoss, Home of Professional Open Source.
*
* See the LEGAL.txt file distributed with this work for information regarding copyright ownership and licensing.
*
* See the AUTHORS.txt file distributed with this work for a full listing of individual contributors.
*/
package org.teiid.designer.query;

import org.teiid.designer.query.sql.ILanguageVisitor;
import org.teiid.designer.query.sql.lang.ILanguageObject;

/**
 *
 */
public abstract class AbstractLanguageVisitor implements ILanguageVisitor {
    
    @Override
    public void visit(ILanguageObject languageObject) {
    }
    
}
