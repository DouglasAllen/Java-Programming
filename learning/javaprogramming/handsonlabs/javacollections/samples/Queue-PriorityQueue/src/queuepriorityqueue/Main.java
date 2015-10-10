
/*
License for Java 1.5 'Tiger': A Developer's Notebook
     (O'Reilly) example package
 
Java 1.5 'Tiger': A Developer's Notebook (O'Reilly)
by Brett McLaughlin and David Flanagan.
ISBN: 0-596-00738-8
 
You can use the examples and the source code any way you want, but
please include a reference to where it comes from if you use it in
your own products or services. Also note that this software is
provided by the author "as is", with no expressed or implied warranties.
In no event shall the author be liable for any direct or indirect
damages arising in any way out of the use of this software.
 */

package queuepriorityqueue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    
    public static void main(String[] args) {
        
        // Create PriorityQueue object
        PriorityQueue<Integer> pq =
                new PriorityQueue<Integer>(20,
                new Comparator<Integer>() {
            public int compare(Integer i, Integer j) {
                int result = i%2 - j%2;
                if (result == 0)
                    result = i-j;
                return result;
            }
        }
        );
        
        // Fill up with data, in an odd order
        for (int i=0; i<20; i++) {
            pq.offer(20-i);
        }
        
        // Print out and check ordering
        for (int i=0; i<20; i++) {
            System.out.println(pq.poll());
        }
    }
}


