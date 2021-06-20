
// requires Groovy 3.x
// ------ main

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

def fizzbuzz() { println "fizzbuzz" }
def fizz() { println "fizz" }
def buzz() { println "buzz" }
def emit(x) { println x }
