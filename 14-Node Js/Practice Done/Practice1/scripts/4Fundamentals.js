var number1=25;
var number2 = 25;
console.log(checknumbers(number1,number2));
function checknumbers(number1,number2){
 if(number1 ==50 || number2 ==50){
    return true;
 }
 else if(number1+number2 ==50){
    return true;

 }
 else {
    return false;
 }
}