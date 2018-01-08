[![Build Status](https://travis-ci.org/mxro/js-api.svg?branch=master)](https://travis-ci.org/mxro/js-api)

**Important** This project has moved to [javadelight/delight-js-exec-api](https://github.com/javadelight/delight-js-exec-api)

# JS API

[JS API](https://github.com/mxro/js-api) offers a beautiful way to call JavaScript from Java.

## Usage

```java
final Double sum = Js.eval("1 + 1;");

System.out.println(sum);

final Object text = Js.eval("'123' + '456'");

System.out.println(text);
```

## Maven Dependency

```xml
<dependency>
    <groupId>de.mxro.js</groupId>
	<artifactId>js-api</artifactId>
	<version>[latest version]</version>
</dependency>
```

Find latest version [here](http://modules.appjangle.com/js-api/latest/project-summary.html).

Add repository if required:

```xml
<repositories>
	<repository>
		<id>Appjangle Releases</id>
		<url>http://maven.appjangle.com/appjangle/releases</url>
	</repository>
</repositories>
```

## Further Resources

- [JavaDocs](http://modules.appjangle.com/js-api/latest/apidocs/)
- [Project Reports](http://modules.appjangle.com/js-api/latest/project-reports.html)

