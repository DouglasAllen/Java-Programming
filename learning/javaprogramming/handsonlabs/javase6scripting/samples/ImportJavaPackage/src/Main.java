
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class Main {
    
    public static void main(String[] args) throws Exception {
        ScriptEngineManager engineMgr = new ScriptEngineManager();
        ScriptEngine jsEngine = engineMgr.getEngineByName("ECMAScript");
        
        jsEngine.eval("importPackage(javax.swing);" +
                "var optionPane = " +
                "  JOptionPane.showMessageDialog(null, 'Hello, world!');");
        
    }
    
}
