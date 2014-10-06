package de.mxro.js.internal;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class EngineSelector {

    private static ScriptEngine engine = null;

    public static ScriptEngine getEngine() {
        final ScriptEngineManager engineManager = new ScriptEngineManager();
        final ScriptEngine engine = engineManager.getEngineByName("nashorn");
        return engine;
    }

}
