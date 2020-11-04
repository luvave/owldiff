/*
 * Copyright (c) 2012 Czech Technical University in Prague.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser Public License v2.1
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/old-licenses/lgpl-2.1.html
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 */
package cz.cvut.kbss.owldiff.syntax;

public enum SyntaxEnum {
    MANCHESTER(new ManchesterSyntax()), MANCHESTER_ORIGINAL(new ManchesterSyntaxOriginal()), DL(new DLSyntax());

    Syntax s;

    SyntaxEnum(Syntax s) {
        this.s = s;
    }

    public Syntax getSyntax() {
        return s;
    }
};
