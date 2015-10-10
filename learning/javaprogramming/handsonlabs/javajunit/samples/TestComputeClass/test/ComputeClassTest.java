import junit.framework.*;
/*
 * ComputeClassTest.java
 * JUnit based test
 *
 * Created on March 2, 2007, 5:01 PM
 */

/**
 *
 * @author sang
 */
public class ComputeClassTest extends TestCase {
    
    public ComputeClassTest(String testName) {
        super(testName);
    }

    protected void setUp() throws Exception {
    }

    protected void tearDown() throws Exception {
    }

    /**
     * Test of add method, of class ComputeClass.
     */
    public void testAdd() {
        System.out.println("add");
        
        int x = 0;
        int y = 0;
        ComputeClass instance = new ComputeClass();
        
        int expResult = 0;
        int result = instance.add(x, y);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of multiply method, of class ComputeClass.
     */
    public void testMultiply() {
        System.out.println("multiply");
        
        int x = 0;
        int y = 0;
        ComputeClass instance = new ComputeClass();
        
        int expResult = 0;
        int result = instance.multiply(x, y);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of subtract method, of class ComputeClass.
     */
    public void testSubtract() {
        System.out.println("subtract");
        
        int x = 0;
        int y = 0;
        ComputeClass instance = new ComputeClass();
        
        int expResult = 0;
        int result = instance.subtract(x, y);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
