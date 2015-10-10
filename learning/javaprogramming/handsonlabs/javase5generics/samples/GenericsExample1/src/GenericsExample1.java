import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GenericsExample {
  
    public static void main(String[] args) {
      
        // Notice the type declaration <Integer> for the variable ai.
        // It specifies that this is not just an arbitrary ArrayList,
        // but a ArrayList of Integer, denoted as ArrayList<Integer>.
      
        ArrayList<Integer> ai = new ArrayList<Integer>(10);
        ai.add(0, new Integer(20));
        ai.add(1, new Long(1234));
        ai.add(2, new String("xyz"));
        ai.add(3, new Object());
        Integer i = ai.get(0);
        String s = ai.get(0);
        Object o = ai.get(0);
      
        List<String> ls = new ArrayList<String>(10);
        ls.add(0, new String("abc"));
        ls.add(1, new Integer(2));
        ls.add(2, new Date());
      
        List<Object> lo = new ArrayList<Object>(10);
        lo.add(0, new Integer(20));
        lo.add(1, new Long(1234));
        lo.add(2, new String("xyz"));
        lo.add(3, new Object());
    }
  
}