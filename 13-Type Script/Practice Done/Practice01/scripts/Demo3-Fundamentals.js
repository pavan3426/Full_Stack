var number1 = 6, number2 = 7;
function numberSum(number1, number2) {
    if (number1 == number2) {
        return 3 * (number1 + number2);
    }
    else {
        return 2 * (number1 + number2);
    }
}
console.log("Sum Of Numbers is " + numberSum(number1, number2));
