using System;

namespace csharp
{
    class Program
    {
        static void fizz() { Console.WriteLine("fizz"); }
        static void buzz() { Console.WriteLine("buzz"); }
        static void fizzbuzz() { Console.WriteLine("fizzbuzz"); }
        static void emit(int x) { Console.WriteLine(x); }

        static void Main(string[] args)
        {
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
}
