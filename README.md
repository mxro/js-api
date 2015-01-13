# JS API

An beautiful way to call JavaScript from Java.

## Usage

```java
final Double sum = Js.eval("1 + 1;");

System.out.println(sum);

final Object text = Js.eval("'123' + '456'");

System.out.println(text);
```



