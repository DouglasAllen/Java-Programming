/*
 * TreeSetDemo.java
 *
 * Created on July 11, 2006, 6:08 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package treesetdemo;

import java.util.TreeSet;

/**
 *
 * @author sang
 */
public class TreeSetDemo {
    
    /** Creates a new instance of TreeSetDemo */
    public TreeSetDemo() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TreeSet ts = new TreeSet();
        ts.add("one");
        ts.add("two");
        ts.add("three");
        ts.add("four");
        System.out.println(ts);
    }
    
}
