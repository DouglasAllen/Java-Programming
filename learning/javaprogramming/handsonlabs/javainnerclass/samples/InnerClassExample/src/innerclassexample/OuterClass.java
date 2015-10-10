
package innerclassexample;

public class OuterClass {
    
    // Define a variable in the outer class
    int data = 5;
    
    // Define an inner class
    class InnerClass {
        int data2 = 10;
        void method() {
            System.out.println("data from OuterClass = " + data);
            System.out.println("data2 from InnerClass = " + data2);
        }
    }
}
