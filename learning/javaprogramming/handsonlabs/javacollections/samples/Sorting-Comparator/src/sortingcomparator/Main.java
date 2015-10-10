
package sortingcomparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;


public class Main {
    
    public static void main(String[] args) {
        
        // Create an ArrayList object and add items to it.
        ArrayList a1 = new ArrayList();
        a1.add("Boston");
        a1.add("New York");
        a1.add("Seoul");
        a1.add("Tokyo");
        a1.add("London");
        a1.add("Bangkok");
        System.out.println("Before sorting = " + a1);
        
        // Get String Comparator object and sort the list
        Comparator comp = Comparators.stringComparator();
        Collections.sort(a1, comp);
        
        // Display the sorted list
        System.out.println("Sorted list using String Comparator = " + a1);
        
        // Create an ArrayList object and add items to it.
        ArrayList a2 = new ArrayList();
        a2.add(new Integer(33));
        a2.add(new Integer(17));
        a2.add(new Integer(45));
        a2.add(new Integer(100));
        a2.add(new Integer(3));
        System.out.println("Before sorting = " + a2);
        
        // Get Integer Comparator object and sort the list
        Comparator comp2 = Comparators.integerComparator();
        Collections.sort(a2, comp2);
        
        // Display the sorted list
        System.out.println("Sorted list using Integer Comparator = " + a2);
    }
}


