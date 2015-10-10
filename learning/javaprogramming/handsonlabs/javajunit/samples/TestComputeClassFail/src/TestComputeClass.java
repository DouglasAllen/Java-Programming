
import junit.framework.*;

public class TestComputeClass extends TestCase {
   
    public TestComputeClass(String name) {
        super(name);
    }
    
     /**
     * Test of add method, of class ComputeClass.
     */
    public void testAdd() {
        System.out.println("add");
        
        int x = 7;
        int y = 5;
        ComputeClass instance = new ComputeClass();
        
        int expResult = 12;
        int result = instance.add(x, y);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of multiply method, of class ComputeClass.
     */
    public void testMultiply() {
        System.out.println("multiply");
        
        int x = 7;
        int y = 5;
        ComputeClass instance = new ComputeClass();
        
        int expResult = 35;
        int result = instance.multiply(x, y);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of subtract method, of class ComputeClass.
     */
    public void testSubtract() {
        System.out.println("subtract");
        
        int x = 7;
        int y = 5;
        ComputeClass instance = new ComputeClass();
        
        int expResult = 2;
        int result = instance.subtract(x, y);
        assertEquals(expResult, result);
        
    }
    
    public static void main(String[] args){
        
        System.out.println("Running the test using junit.textui.TestRunner.run() method...");
        junit.textui.TestRunner.run(TestComputeClass.class);
        
    }
}