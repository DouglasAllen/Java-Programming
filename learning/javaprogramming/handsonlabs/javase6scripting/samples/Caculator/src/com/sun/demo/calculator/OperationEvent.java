/*
 * OperationEvent.java
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
public class OperationEvent extends EventObject{
    
    public OperationEvent(Object source, Operation operation){
        this(source, operation, null);
    }
    
    /**
     * Creates a new instance of OperationEvent
     */
    public OperationEvent(Object source, Operation operation, Number number)  {
        super(source);
        this.operation = operation;
        this.number = number;
    }

    public Operation getOperation() {
        return operation;
    }
    
    public Number getNumber() {
        return number;
    }
    
    
    private Number number;
    private Operation operation;
}
