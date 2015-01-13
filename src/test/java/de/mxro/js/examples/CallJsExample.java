package de.mxro.js.examples;

import de.mxro.js.Js;

public class CallJsExample {

    public static void main(final String[] args) {

        final Double sum = Js.eval("1 + 1;");

        System.out.println(sum);

        final Object object = Js.eval("{}");

        System.out.println(object);

    }

}
