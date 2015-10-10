public abstract class GUIFactory {
    
    public static GUIFactory getFactory() {
        
        if (System.getProperty("os.name").startsWith("Windows")){
            return(new WinFactory());
        } else {
            return(new OSXFactory());
        }
    }
    public abstract Button createButton();
}
