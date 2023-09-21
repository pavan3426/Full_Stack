var givenNumber = new Number(100000000000.2325);
console.log(givenNumber);

var numberFormat = Intl.NumberFormat("en-US", {
    style: "currency",
    currency: "USD",
    maximumFractionDigits: 2
});
console.log(givenNumber);
var convertedResult = numberFormat.format(givenNumber);
console.log(convertedResult);