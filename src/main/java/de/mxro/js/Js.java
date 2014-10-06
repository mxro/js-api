package de.mxro.js;

import javax.script.ScriptException;

import de.mxro.js.internal.EngineSelector;

public class Js {

    public static Object eval(final String javaScript) {

        try {
            return EngineSelector.getEngine().eval(javaScript);
        } catch (final ScriptException e) {
            throw new RuntimeException(e);
        }
    }

}
