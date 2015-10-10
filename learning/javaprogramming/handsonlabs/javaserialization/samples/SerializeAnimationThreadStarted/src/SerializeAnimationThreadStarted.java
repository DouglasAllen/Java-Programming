import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializeAnimationThreadStarted {
    
    public static void main(String[] args) {
        
        // Create an object intance
        PersistentAnimation a = new PersistentAnimation(1);
        
        // Serialize the object
        FileOutputStream fos = null;
        ObjectOutputStream out = null;
        try {
            fos = new FileOutputStream("serializedfile");
            out = new ObjectOutputStream(fos);
            out.writeObject(a);
            out.close();
        } catch(IOException ex) {
            ex.printStackTrace();
        }
        
        // Deserialize the object
        PersistentAnimation b = null;
        FileInputStream fis = null;
        ObjectInputStream in = null;
        try {
            fis = new FileInputStream("serializedfile");
            in = new ObjectInputStream(fis);
            b = (PersistentAnimation)in.readObject();
            in.close();
        } catch(IOException ex) {
            ex.printStackTrace();
        } catch(ClassNotFoundException ex) {
            ex.printStackTrace();
        }       
              
    }
    
}