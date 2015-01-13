package de.mxro.js;

import javax.script.ScriptEngine;
import javax.script.ScriptException;

import de.mxro.js.internal.EngineSelector;

/**
 * Collection of methods provided by this API.
 * 
 * @author <a href="http://www.mxro.de">Max Rohde</a>
 *
 */
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
