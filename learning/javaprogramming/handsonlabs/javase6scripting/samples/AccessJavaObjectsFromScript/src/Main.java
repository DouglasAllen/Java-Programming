


import java.util.ArrayList;
import java.util.List;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class Main {
    
    public static void main(String[] args) throws Exception {
        
        // Create Java objects
        List<String> namesList = new ArrayList<String>();
        namesList.add("Jill");
        namesList.add("Bob");
        namesList.add("Laureen");
        namesList.add("Ed");
        
        System.out.println("Executing in Java environment...");
        for (String name: namesList) {
            System.out.println(name);
        }
        
        ScriptEngineManager engineMgr = new ScriptEngineManager();
        ScriptEngine jsEngine = engineMgr.getEngineByName("ECMAScript");
        
        // Create a Binding object that creates name-value pair
        // between scripting object and Java object.
        jsEngine.put("namesListKey", namesList);
        System.out.println("Executing in script environment...");
        
        jsEngine.eval("var x;" +
                "var names = namesListKey.toArray();" +
                "for(x in names) {" +
                "  println(names[x]);" +
                "}" +
                "namesListKey.add(\"Dana\");");
    
    }
    
}
