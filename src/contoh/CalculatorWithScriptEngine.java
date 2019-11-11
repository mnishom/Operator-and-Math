/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contoh;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 *
 * @author nishom
 */
public class CalculatorWithScriptEngine {

    public static void main(String[] args) {
        try {
            ScriptEngineManager mgr = new ScriptEngineManager();
            ScriptEngine engine = mgr.getEngineByName("JavaScript");
            String res = "5 + 5 * ( 4 / 2 ) - 7 + 1";
            System.out.println(engine.eval(res));
        } catch (ScriptException e) {
            System.err.println(e.getMessage());
        }
    }
}
