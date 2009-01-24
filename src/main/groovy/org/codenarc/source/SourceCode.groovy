/*
 * Copyright 2008 the original author or authors.
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
 package org.codenarc.source

import org.codehaus.groovy.ast.ModuleNode

/**
 * Represents a unit of source code to be analyzed
 *
 * @author Chris Mair
 * @version $Revision$ - $Date$
 */
interface SourceCode {

    /**
     * Get the logical name for this source code. If this object is a file, then the name
     * is the filename, without a path.
     * @return the name for this source; may be null
     */
    String getName()

    /**
     * Get the logical path for this source code. If this object is a file, then the name
     * is the full path in the filesystem.
     * @return the name for this source; may be null
     */
    String getPath()

    /**
     * @return the full text of the source code
     */
    String getText()

    /**
     * @return the List of lines of the source code (with line terminators removed)
     */
    List getLines()

    /**
     * Return the Groovy AST (Abstract Syntax Tree) for this source file
     * @return the ModuleNode representing the AST for this source file
     */
    ModuleNode getAst()
    
}