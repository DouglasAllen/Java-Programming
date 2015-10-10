import java.lang.annotation.*;

public class RuntimeAnnotation {
    
    AnnotatedClass ac;
    
    public RuntimeAnnotation() {
        ac = new AnnotatedClass();
    }
    
    public void printAnnotations() {
        Class c = ac.getClass();
        Annotation[] annotations = c.getAnnotations();
        int numberOfAnnotations = annotations.length;
        System.out.println("Class " + c.getName() + " has " +
                numberOfAnnotations + " annotations");
        
        for (int i = 0 ; i < numberOfAnnotations; i++) {
            System.out.println("Annotation " + i + ": " + annotations[i] +
                    ", type" + annotations[i].annotationType().getName());
        }
    }
    
    public static void main(String[] args) {
        RuntimeAnnotation ar = new RuntimeAnnotation();
        ar.printAnnotations();
    }
}