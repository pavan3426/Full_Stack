var givenNumber = new Number(10000000000.2325);

console.log(givenNumber);

var convertedResult = givenNumber.toLocaleString("en-US",{
    style :"currency",
    currency:"USD",
    maximumFractionDigits : 2
});
console.log(convertedResult);
