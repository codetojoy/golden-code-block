# golden-code-block

Both Java and Groovy adopted the `var` keyword in recent years, so
I wondered if there is a "golden"/polyglot code block that works across several
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

How many languages can use this code, unaltered (with surrounding context, tailored for the language)?

Here's a current [list](./list.md) with working examples. If you find more, please let me know.

re: "That's not how to write FizzBuzz..."

<details>
<summary>click</summary>
<p>Congrats! You do you. This is just about the `var` keyword.</p>
<p>Though a secondary angle to this project is to see how many people comment on FizzBuzz.</p>
<p>I had considered putting a bug in the code block, just to break the Internet.</p>
</details>
