/*
 * NameHandlerTest.java
 * JUnit based test
 *
 * Created on September 12, 2006, 3:52 PM
 */

package org.me.hello;

import junit.framework.*;

/**
 *
 * @author sang
 */
public class NameHandlerTest extends TestCase {
    
    public NameHandlerTest(String testName) {
        super(testName);
    }

    protected void setUp() throws Exception {
    }

    protected void tearDown() throws Exception {
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(NameHandlerTest.class);
        
        return suite;
    }

    /**
     * Test of getUsername method, of class org.me.hello.NameHandler.
     */
    public void testGetUsername() {
        System.out.println("getUsername");
        
        NameHandler instance = new NameHandler();
        
        String expResult = "";
        String result = instance.getUsername();
        //assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setUsername method, of class org.me.hello.NameHandler.
     */
    public void testSetUsername() {
        System.out.println("setUsername");
        
        String username = "";
        NameHandler instance = new NameHandler();
        
        instance.setUsername(username);
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of addnumber method, of class org.me.hello.NameHandler.
     */
    public void testAddnumber() {
        System.out.println("addnumber");
        
        int x = 5;
        int y = 7;
        NameHandler instance = new NameHandler();
        
        int expResult = 12;
        int result = instance.addnumber(x, y);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
