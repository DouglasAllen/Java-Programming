
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class Main {
    
    public static void main(String[] args) throws Exception {
        
        ScriptEngineManager mgr = new ScriptEngineManager();
        ScriptEngine jsEngine = mgr.getEngineByName("JavaScript");
        
        jsEngine.eval("print('Hello, world!')");
        
    }
    
}
