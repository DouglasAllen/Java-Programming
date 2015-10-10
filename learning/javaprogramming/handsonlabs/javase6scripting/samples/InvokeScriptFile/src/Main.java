
import java.io.FileReader;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class Main {
    
    public static void main(String[] args) throws Exception {
        
        ScriptEngineManager engineMgr = new ScriptEngineManager();
        ScriptEngine engine = engineMgr.getEngineByName("ECMAScript");
        
        engine.eval(new FileReader("F1.js"));
        
    }
    
}
