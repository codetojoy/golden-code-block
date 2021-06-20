
// requires JDK 10+
public class Example {
    static void fizz() {
        System.out.println("fizz");
    }
    static void buzz() {
        System.out.println("buzz");
    }
    static void fizzbuzz() {
        System.out.println("fizzbuzz");
    }
    static void emit(int x) {
        System.out.println(x);
    }
    public static void main(String... args) {
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
    }
}
