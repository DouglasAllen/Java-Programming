/*
 * KeyPadListener.java
 *
 * Copyright 2006 Sun Microsystems, Inc. ALL RIGHTS RESERVED Use of 
 * this software is authorized pursuant to the terms of the license 
 * found at http://developers.sun.com/berkeley_license.html .
 *
 */

package com.sun.demo.calculator;

/**
 *
 * @author John O'Conner
 */
public interface KeyPadListener {
    
    public void keySelected(KeyPadEvent evt);
}
