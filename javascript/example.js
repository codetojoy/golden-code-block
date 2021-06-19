function item(x, state) {
  return `<p>${x} ${state}<p>`;
}
function fizz(x) {
  document.getElementById("result").innerHTML += item(x, "fizz");
}
function buzz(x) {
  document.getElementById("result").innerHTML += item(x, "buzz");
}
function fizzbuzz(x) {
  document.getElementById("result").innerHTML += item(x, "fizzbuzz");
}

function example() {
  // ----- common block
  var x = 1;
  while (x <= 30) {
    var div3 = x % 3 == 0;
    var div5 = x % 5 == 0;
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
