/*
 * NameHandler.java
 *
 * Created on September 12, 2006, 3:45 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package org.me.hello;

/**
 *
 * @author sang
 */
public class NameHandler {
    
    private String username;
    
    /** Creates a new instance of NameHandler */
    public NameHandler() {
        setUsername(null);
       
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
    public int addnumber(int x, int y){
         return x+y;
    }
}
