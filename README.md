# golden-code-block

Both Java and Groovy adopted the `var` keyword in recent years, so
I wondered if there is a "golden" code block that works across several
languages.

Consider this:

```
// ----- common block
var x = 1;
while (x <= 100) {
    var div3 = (x % 3 == 0);
    var div5 = (x % 5 == 0);
    if (div3 && div5) {
        fizzbuzz();
    } else if (div3) {
        fizz();
    } else if (div5) {
        buzz();
    } else {
        emit(x);
    }
    x += 1;
}
// -------------- 
```

How many languages can use this code, unaltered?

* Here's a [list](./list.md)
