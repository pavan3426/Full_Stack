var num1 = 9;
var num2 = 5;
var num3 = 1;

if (num1 >= num2 && num1 >= num3) {
  if (num2 >= num3) {
    console.log("Sorted order: " + num1 + ", " + num2 + ", " + num3);
  } else {
    console.log("Sorted order: " + num1 + ", " + num3 + ", " + num2);
  }
} else if (num2 >= num1 && num2 >= num3) {
  if (num1 >= num3) {
    console.log("Sorted order: " + num2 + ", " + num1 + ", " + num3);
  } else {
    console.log("Sorted order: " + num2 + ", " + num3 + ", " + num1);
  }
} else {
  if (num1 >= num2) {
 console.log("Sorted order: " + num3 + ", " + num1 + ", " + num2);
  } else {
    console.log("Sorted order: " + num3 + ", " + num2 + ", " + num1);
  }
}