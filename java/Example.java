
// requires JDK 10+
public class Example {
    static void fizz(int x) {
        System.out.println(x + " fizz");
    }
    static void buzz(int x) {
        System.out.println(x + " buzz");
    }
    static void fizzbuzz(int x) {
        System.out.println(x + " fizzbuzz");
    }
    public static void main(String... args) {
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
