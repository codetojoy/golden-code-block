using System;
					
public class Program
{
	static void fizz(int x) { Console.WriteLine("{0} fizz", x); }
	static void buzz(int x) { Console.WriteLine("{0} buzz", x); }
	static void fizzbuzz(int x) { Console.WriteLine("{0} fizzbuzz", x); }
												
	public static void Main()
	{
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
