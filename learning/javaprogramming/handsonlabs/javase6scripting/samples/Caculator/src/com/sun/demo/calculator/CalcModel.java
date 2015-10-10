/*
 * CalcModel.java
 *
 * Copyright 2006 Sun Microsystems, Inc. ALL RIGHTS RESERVED Use of 
 * this software is authorized pursuant to the terms of the license 
 * found at http://developers.sun.com/berkeley_license.html .
 *
 */

package com.sun.demo.calculator;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import javax.script.Invocable;
import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
import javax.script.ScriptException;
import javax.script.Invocable;
import javax.swing.JOptionPane;


/**
 *
 * @author John O'Conner
 */
public class CalcModel implements OperationListener {
  
  /** Creates a new instance of CalcModel */
  public CalcModel() {
    listeners = new ArrayList<CalcModelEventListener>();
    numStack = new Stack<Number>();
    initScriptEngines();
    
  }
  
  
  private void initScriptEngines() {
    engineManager = new ScriptEngineManager();
    invocableEngines = new Invocable[scriptNames.length];
    for(int x=0; x < invocableEngines.length; ++x) {
      InputStream is = this.getClass().getResourceAsStream(scriptNames[x]);
      if(is == null) {
        continue;
      }
      try {
        Reader reader= new InputStreamReader(is);
        ScriptEngine engine = engineManager.getEngineByName("ECMAScript");
        engine.eval(reader);
        invocableEngines[x] = (Invocable) engine;
      } catch (ScriptException ex) {
        System.out.printf("There is an error in script: %s\n", scriptNames[x]);
      }
    }
  }
  
  private void fireCalcModelEvent(Number number) {
    CalcModelEvent evt = new CalcModelEvent(this,number);
    for(CalcModelEventListener listener: listeners) {
      listener.updateTotal(evt);
    }
  }
  
  public void addCalcModelEventListener(CalcModelEventListener listener) {
    listeners.add(listener);
  }
  
  public void removeCalcModelEventListener(CalcModelEventListener listener) {
    listeners.remove(listener);
  }
  
  public Number getResultOfLastOperation() {
    Number top = null;
    if (!numStack.empty()) {
      top = numStack.peek();
    }
    return top;
  }
  
  public void performOperation(OperationEvent evt) {
    Operation operation = evt.getOperation();
    Number number = evt.getNumber();
    
    double result = Double.NaN;
    double op1 = Double.NaN;
    double op2 = Double.NaN;
    switch(operation) {
      
      case ADD:
        if (number != null) {
          numStack.push(number);
        }
        if (numStack.size() >= 2) {
          op2 = numStack.pop().doubleValue();
          op1 = numStack.pop().doubleValue();
          result = op1 + op2;
          numStack.push(result);
        }
        fireCalcModelEvent(result);
        break;
      case SUBSTRACT:
        if (number != null) {
          numStack.push(number);
        }
        
        if (numStack.size() >= 2) {
          op2 = numStack.pop().doubleValue();
          op1 = numStack.pop().doubleValue();
          result = op1 - op2;
          numStack.push(result);
        }
        fireCalcModelEvent(result);
        break;
      case MULTIPLY:
        if (number != null) {
          numStack.push(number);
        }
        if (numStack.size() >= 2) {
          op2 = numStack.pop().doubleValue();
          op1 = numStack.pop().doubleValue();
          result = op1 * op2;
          numStack.push(result);
        }
        fireCalcModelEvent(result);
        break;
      case DIVIDE:
        if (number != null) {
          numStack.push(number);
        }
        if (numStack.size() >= 2) {
          op2 = numStack.pop().doubleValue();
          op1 = numStack.pop().doubleValue();
          result = op1 / op2;
          numStack.push(result);
        }
        fireCalcModelEvent(result);
        break;
        
      case PEEK:
        break;
      case POP:
        break;
      case PUSH:
        numStack.push(number);
        break;
      case CLEAR:
        numStack.clear();
        break;
        
      case F1:
        result = executeUserFunction(0);
        fireCalcModelEvent(result);
        break;
      case F2:
        result = executeUserFunction(1);
        fireCalcModelEvent(result);
        break;
      case F3:
        result = executeUserFunction(2);
        fireCalcModelEvent(result);
        break;
      case F4:
        result = executeUserFunction(3);
        fireCalcModelEvent(result);
        break;
        
    }
    lastResult = numStack.empty() ? null: numStack.peek();
  }
  
  
  private Double executeUserFunction(int funcNumber) {
    Double result = null;
    
    try {
      Invocable invocableEngine = invocableEngines[funcNumber];
      if (invocableEngine != null) {
        result = (Double) invocableEngine.invokeFunction("calculate", numStack);
      }
    } catch (ScriptException ex) {
      System.out.println("Error in script");
    } catch (NoSuchMethodException ex) {
      System.out.println("Script does not contain 'calculate' function.");
    } catch (NullPointerException npe) {
      System.out.println("Script does not exist.");
    } 
    return result;
  }
  
  private Stack<Number> numStack;
  private List<CalcModelEventListener> listeners;
  private Number lastResult;
  private ScriptEngineManager engineManager;
  private Invocable[] invocableEngines;
  private String[] scriptNames = {"/scripts/F1.js", "/scripts/F2.js",
  "/scripts/F3.js", "/scripts/F4.js" };
  
  
  
}
