
// This is the target class we want to test.
public class ComputeClass {
    
    int add (int x, int y){
        // return (x + y);
        // Simulate a business logic error.
        return (x + y + 1); 
    }
    
    int multiply (int x, int y){
        return (x*y);
    }
    
    int subtract (int x, int y){
        return (x-y);
    }
    
}
