
object Example {
    def fizz(x: Int) = {
        println(s"$x fizz")
    }
    def buzz(x: Int) = {
        println(s"$x buzz")
    }
    def fizzbuzz(x: Int) = {
        println(s"$x fizzbuzz")
    }

    def main(args: Array[String]) = {
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
    }
}
