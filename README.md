# golden-code-block

Both Java and Groovy adopted the `var` keyword in recent years, so
I wondered if there is a "golden" code block that works across several
languages.

Consider this:

```
// ----- common block
var x = 1;
while (x <= 30) {
    var div3 = (x % 3 == 0);
    var div5 = (x % 5 == 0);
    if (div3 && div5) {
        fizzbuzz(x);
    } else if (div3) {
        fizz(x);
    } else if (div5) {
        buzz(x);
    }
    x += 1;
}
// -------------- 
```

How many languages can use this code, unaltered?

* [Dart](./dart/example.dart)
* [Groovy](./groovy/Example.groovy)
* [Java](./java/Example.java)
* [Javascript](./javascript/example.js)
* [Kotlin](./kotlin/Example.kt)
* [Scala](./scala/Example.scala)
* [Typescript](./typescript/example.ts)
