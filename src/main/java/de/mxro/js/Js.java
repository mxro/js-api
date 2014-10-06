package de.mxro.js;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Js {

    public static Object eval(final String javaScript) {
        final ScriptEngineManager engineManager = new ScriptEngineManager();
        final ScriptEngine engine = engineManager.getEngineByName("nashorn");

        try {
            return engine.eval(javaScript);
        } catch (final ScriptException e) {
            throw new RuntimeException(e);
        }
    }

}
