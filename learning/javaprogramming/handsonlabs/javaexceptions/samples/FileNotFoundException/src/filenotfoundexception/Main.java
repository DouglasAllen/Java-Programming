package filenotfoundexception;
import java.io.*;

public class Main {
    
    public static void concatenate(String fileName) {
        RandomAccessFile raf = null;
        String line = null;

        try {
            raf = new RandomAccessFile(fileName, "r");
            while ((line = raf.readLine()) != null) {
                System.out.println(line);
            }
            return;
        } catch(FileNotFoundException fnf) {
            System.err.println("File: " + fileName + " not found.");
        } catch(Exception e) {
            System.err.println(e.toString());
        } finally {
            if (raf != null) {
                try {
                    raf.close();
                } catch(IOException io) {
                }
            }
            System.out.println("finally block is called");
                    
        }
        
    }

    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) 
            Main.concatenate(args[i]);
    }
}













