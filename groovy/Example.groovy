
// ------ main

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

def fizzbuzz(x) { println "$x fizzbuzz" }
def fizz(x) { println "$x fizz" }
def buzz(x) { println "$x buzz" }
