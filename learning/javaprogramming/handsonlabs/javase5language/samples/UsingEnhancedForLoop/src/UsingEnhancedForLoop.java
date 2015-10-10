import java.util.*;

public class UsingEnhancedForLoop {
    
    public static void main( String[] args ) {
        
        Vector<Object> v = new Vector<Object>();
        v.add( new String( "Hello World" ) );
        v.add( new Integer( 10 ) );
        v.add( new Double( 11.0 ) );
        v.add( new Long( 12 ) );
        
        for ( Object o : v ) {
            System.out.println( " Vector element is: " + o );
        }
        
        
        String [] s = {
            "Java 2",
            "Platform",
            "Standard",
            "Edition",
            "1.5",
            "is",
            "the",
            "latest",
            "release",
            "of",
            "the",
            "Java",
            "Platform" };
        
        for ( String i : s ) {
            System.out.println( " String Array element is: " + i );
        }
        
    }
}