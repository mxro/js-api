package de.mxro.js.examples;

import de.mxro.js.Js;

public class CallJsExample {

    public static void main(final String[] args) {

        final Object res = Js.eval("return 1 + 1; ");

        System.out.println(res);

    }

}
