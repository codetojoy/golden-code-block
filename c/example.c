
#include <stdio.h>

#define var int

void fizz() { printf("fizz\n"); }
void buzz() { printf("buzz\n"); }
void fizzbuzz() { printf("fizzbuzz\n"); }
void emit(var x) {  printf("%d\n",x); }
 
int main(int argc, char **argv) {
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
