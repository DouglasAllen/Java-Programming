/*
 * HashSetDemo.java
 *
 * Created on July 11, 2006, 6:02 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package hashsetdemo;

import java.util.HashSet;

/**
 *
 * @author sang
 */
public class HashSetDemo {
    
    /** Creates a new instance of HashSetDemo */
    public HashSetDemo() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Create HashSet object
        HashSet hs = new HashSet(5, 0.5f);
        System.out.println(hs.add("one"));
        System.out.println(hs.add("two"));
        System.out.println(hs.add("three"));
        System.out.println(hs.add("four"));
        System.out.println(hs.add("five"));
        
        // Print out the HashSet object
        System.out.println(hs);
        
        // Add a duplicate item to the HashSet
        Boolean b = hs.add("one");
        System.out.println("Duplicate item allowed = " + b);
        System.out.println(hs);
        
        
    }
    
}
