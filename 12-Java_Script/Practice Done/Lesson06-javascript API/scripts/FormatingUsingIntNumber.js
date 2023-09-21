var givenNumber = new Number(10000000000.2325);

console.log(givenNumber);

var numberFormat = givenNumber.toLocaleString("en-US",{
    style :"currency",
    currency:"USD",
    maximumFractionDigits : 2
});
var convertedResult = numberFormat.format(givenNumber);
console.log(convertedResult);
