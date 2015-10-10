/*
 * CalcModelEvent.java
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
 */
public class CalcModelEvent extends EventObject {
    
    /** Creates a new instance of CalcModelEvent */
    public CalcModelEvent(Object source, Number number) {
        super(source);
        this.number = number;
    }
    
    public Number getNumber() {
        return number;
    }
    
    private Number number;
    
}
