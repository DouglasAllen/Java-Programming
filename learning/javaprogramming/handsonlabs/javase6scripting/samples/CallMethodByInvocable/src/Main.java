
import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class Main {
    
    public static void main(String[] args) throws Exception {
        
        ScriptEngineManager engineMgr = new ScriptEngineManager();
        ScriptEngine engine = engineMgr.getEngineByName("ECMAScript");
        
        engine.eval("function sayHello() {" +
                "  println('Hello, world!');" +
                "}");
        Invocable invocableEngine = (Invocable) engine;
        invocableEngine.invokeFunction("sayHello");
        
    }
    
}
