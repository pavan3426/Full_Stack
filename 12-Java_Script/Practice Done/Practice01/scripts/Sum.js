
var num1=4;

var num2 =4;

function addingNumbers(num1, num2){
    if(num1==num2){
      return  3 * (num1+ num2);
    }
    else {
        return num1+ num2;
    }
}

var sum = addingNumbers(num1,num2);
console.log("Sum of two numbers is :- " +sum);
