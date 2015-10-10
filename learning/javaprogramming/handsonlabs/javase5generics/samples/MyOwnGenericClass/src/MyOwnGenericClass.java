import java.util.ArrayList;

public class MyOwnGenericClass {
    
    public static void main(String[] args) {
        
        // Create an instance of Pair <F, S> class.  Let's call it p1.
        Number n1 = new Integer(5);
        String s1 = new String("Sun");
        Pair<Number,String> p1 = new Pair<Number,String>(n1, s1);
        System.out.println("first of p1 (right after creation) = " + p1.getFirst());
        System.out.println("second of p2  (right after creation) = " + p1.getSecond());
        
        // Set internal variables of p1.
        p1.setFirst(new Long(6L));
        p1.setSecond(new String("rises"));
        System.out.println("first of p1(after setting values) = " + p1.getFirst());
        System.out.println("second of p1 (after setting values) = " + p1.getSecond());
        
        // Create an instance of Pair <F, S> class using wildcard type arguments.
        Number n2 = new Integer(15);
        String s2 = new String("again");
        Pair<?, ?> p2 = new Pair<Number, String>(n2, s2);
        System.out.println("first of p2 = " + p2.getFirst());
        System.out.println("second of p2 = " + p2.getSecond());
        
        // Create an instance of Pair <F, S> class using wildcard with bounded type arguments.
        Number n3 = new Integer(25);
        String s3 = new String("and again!");
        Pair<? extends String, ?> p3 = new Pair<String, String>(s3, s3);
        System.out.println("first of p3 = " + p3.getFirst());
        System.out.println("second of p3 = " + p3.getSecond());
        
        // Create an instance of PairExtended<F, S, T> class with concrete type arguments,
        // <Number, String, Integer>
        Number n4 = new Long(3000L);
        String s4 = new String("james");
        Integer i4 = new Integer(7);
        PairExtended<Number, String, Integer> pe4
                = new PairExtended<Number, String, Integer>(n4, s4, i4);
        System.out.println("first of PairExtended = " + pe4.getFirst());
        System.out.println("second of PairExtended = " + pe4.getSecond());
        System.out.println("third of PairExtended = " + pe4.getThird());
        
        // Create an instance of PairExtended<F. S, T> class with
        // with ArrayList<E> as a third type argument.
        ArrayList<Integer> ar4 = new ArrayList<Integer>();       // Right-click this line and select Fix Imports first
        ar4.add(6000);
        ar4.add(7000);
        PairExtended<Number, String, ArrayList<Integer>> pe5
                = new PairExtended<Number, String, ArrayList<Integer>>(n4, s4, ar4);
        System.out.println("first of PairExtended with ArrayList = " + pe5.getFirst());
        System.out.println("second of PairExtended with ArrayList = " + pe5.getSecond());
        System.out.println("third of PairExtended with ArrayList = " + pe5.getThird());
    }
    
}
