package de.mxro.js;

import javax.script.ScriptEngine;
import javax.script.ScriptException;

import de.mxro.js.internal.EngineSelector;

public class Js {

    /**
     * Evaluates the supplied string as JavaScript script and returns the result
     * value.
     * 
     * @param javaScript
     * @return
     * @see {@link ScriptEngine#eval(String)}
     */
    public static Object eval(final String javaScript) {

        try {
            return EngineSelector.getEngine().eval(javaScript);
        } catch (final ScriptException e) {
            throw new RuntimeException(e);
        }
    }

}
