/*
 * Calculator.java
 *
 * Copyright 2006 Sun Microsystems, Inc. ALL RIGHTS RESERVED Use of 
 * this software is authorized pursuant to the terms of the license 
 * found at http://developers.sun.com/berkeley_license.html .
 *
 */


package com.sun.demo.calculator;
import com.sun.demo.calculator.CalcForm;
import java.math.BigDecimal;
import java.util.Stack;
import javax.swing.JFrame;


/**
 *
 * @author John O'Conner 
 */
public class Calculator {
    
    /** Creates a new instance of Calculator */
    public Calculator() {
        form = new CalcForm();
        calcModel = new CalcModel();
        form.pack();
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        form.addOperationListener(calcModel);
        calcModel.addCalcModelEventListener(form);
    }
 
    void run() {
        form.setVisible(true);
    }
    
    public static void main(String[] args) {
        Calculator app = new Calculator();
        app.run();
    }
    
    private CalcForm form;
    private CalcModel calcModel;
}
