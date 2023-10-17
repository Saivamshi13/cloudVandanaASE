const original = [-11, 34, 2, 33, 76, -100];

original.sort(function(a, b) {
  return b - a;
});

console.log(original);