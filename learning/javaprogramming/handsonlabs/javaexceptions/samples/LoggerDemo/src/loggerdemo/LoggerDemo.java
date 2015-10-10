/*
 * LoggerDemo.java
 *
 * Created on July 16, 2006, 9:57 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package loggerdemo;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sang
 */
public class LoggerDemo {
    
    // A Logger object is used to log messages for a specific system
    // or application component. Loggers are normally named, using a
    // hierarchical dot-separated namespace. Logger names can be arbitrary
    // strings, but they should normally be based on the package name or
    // class name of the logged component. In addition it is possible
    // to create "anonymous" Loggers that are not stored in the Logger
    // namespace.
    private static Logger logger = Logger.getLogger("loggerdemo");
    
    /** Creates a new instance of LoggerDemo */
    public LoggerDemo() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Log a FINE tracing message
        logger.info("doing stuff");
        
        try{
            System.out.println(3/0);
        } catch(Exception e){
            logger.log(Level.SEVERE,"dividing by 0");
        }
        
        logger.info("done");
    }
    
}
