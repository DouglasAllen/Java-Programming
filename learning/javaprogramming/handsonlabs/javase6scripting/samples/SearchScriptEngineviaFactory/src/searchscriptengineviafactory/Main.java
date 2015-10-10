
package searchscriptengineviafactory;

import java.util.List;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineFactory;
import javax.script.ScriptEngineManager;

public class Main {
    
    public static void main(String[] args) {
        ScriptEngineManager mgr = new ScriptEngineManager();
        List<ScriptEngineFactory> scriptFactories =
                mgr.getEngineFactories();
        
        for (ScriptEngineFactory factory: scriptFactories) {
            String langName = factory.getLanguageName();
            String langVersion = factory.getLanguageVersion();
            if (langName.equals("ECMAScript") &&
                    langVersion.equals("1.6")) {
                ScriptEngine engine = factory.getScriptEngine();
                System.out.println("ECMAScript 1.6 script engine is found.");
                break;
            }
        }
    }
    
}
