fizz() {
  print('fizz');
}

buzz() {
  print('buzz');
}

fizzbuzz() {
  print('fizzbuzz');
}

emit(x) {
  print(x);
}

void main() {
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
