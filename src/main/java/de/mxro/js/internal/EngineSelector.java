package de.mxro.js.internal;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class EngineSelector {

    private static ScriptEngine engine = null;

    /**
     * Not synchronized, so possibly more than one engine is initialized.
     * 
     * @return
     */
    public static ScriptEngine getEngine() {
        if (engine != null) {
            return engine;
        }
        final ScriptEngineManager engineManager = new ScriptEngineManager();
        engine = engineManager.getEngineByName("nashorn");
        return engine;
    }

}
