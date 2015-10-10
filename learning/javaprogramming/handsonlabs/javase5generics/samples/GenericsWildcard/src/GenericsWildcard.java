import java.util.ArrayList;
import java.util.Collection;

public class GenericsWildcard {
    
    static void printCollection(Collection<?> c){
        for (Object o: c)
            System.out.println(o);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList<Integer> a = new ArrayList<Integer>(10);
        printCollection(a);
        ArrayList<Long> l = new ArrayList<Long>(10); 
        printCollection(l);
        ArrayList<String> s = new ArrayList<String>(10);
        printCollection(s);
    }
    
}