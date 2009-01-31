/*
 * Copyright 2009 the original author or authors.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.codenarc.rule.basic

import org.codehaus.groovy.ast.stmt.WhileStatement
import org.codenarc.rule.AbstractAstVisitor
import org.codenarc.rule.AbstractAstVisitorRule
import org.codehaus.groovy.ast.stmt.EmptyStatement


/**
 * Rule that checks for empty while statements
 *
 * @author Chris Mair
 * @version $Revision$ - $Date$
 */
class EmptyWhileStatementRule extends AbstractAstVisitorRule {
    String name = 'EmptyWhileStatement'
    int priority = 2
    Class astVisitorClass = EmptyWhileStatementAstVisitor
}

class EmptyWhileStatementAstVisitor extends AbstractAstVisitor  {
    void visitWhileLoop(WhileStatement whileStatement) {
        if (isEmptyBlock(whileStatement.loopBlock)) {
            addViolation(whileStatement)
        }
        super.visitWhileLoop(whileStatement)
    }

}