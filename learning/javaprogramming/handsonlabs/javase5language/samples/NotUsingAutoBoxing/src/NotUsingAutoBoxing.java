
public class NotUsingAutoBoxing{
    
    // Suppose the internal variables are in Wrapper types
    Integer iObj;
    Float fObj;
    Long lObj;
    Double dObj;
    
    public NotUsingAutoBoxing() {
        
    }
    
    public static void main( String[] args ) {
        
        NotUsingAutoBoxing a = new NotUsingAutoBoxing();
        
        // You have to create instances of Wrapper classes first
        // before you save them into the internal variables. This
        // is called boxing.
        a.iObj = new Integer( 22 );
        a.fObj = new Float( 22.0 );
        a.lObj = new Long( 22L );
        a.dObj = new Double( 22 );
        
        // In the following code, you are unboxing in order to
        // get primitive types.
        System.out.println( " int Value of iObj is: " + a.iObj.intValue() );
        System.out.println( " float Value of iObj is: " + a.fObj.floatValue() );
        System.out.println( " long Value of iObj is: " + a.lObj.longValue() );
        System.out.println( " double Value of iObj is: " + a.dObj.doubleValue() );
        
        
    }
}