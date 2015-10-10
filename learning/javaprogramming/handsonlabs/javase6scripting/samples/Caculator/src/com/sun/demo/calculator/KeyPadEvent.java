/*
 * KeyPadEvent.java
 *
 * Copyright 2006 Sun Microsystems, Inc. ALL RIGHTS RESERVED Use of 
 * this software is authorized pursuant to the terms of the license 
 * found at http://developers.sun.com/berkeley_license.html .
 *
 */

package com.sun.demo.calculator;

import java.util.EventObject;

/**
 *
 * @author John O'Conner
 *
 */
public class KeyPadEvent extends EventObject {
    
    public KeyPadEvent(Object source, Key key) {
        super(source);
        this.selectedKey = key;
    }
    
    public Key getSelectedKey() {
        return selectedKey;
    }
    
    private Key selectedKey;
}
