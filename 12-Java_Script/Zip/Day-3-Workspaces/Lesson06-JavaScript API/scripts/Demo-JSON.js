function Person(givenName, givenAge) {
    this.name = givenName;
    this.age = givenAge;
}

// Person.prototype.calculate = function() {
// };

var personObj = new Person("Steven", 23);

// Conversion of JavaScript Object into JSON String
var personJSON = JSON.stringify(personObj);
console.log(personJSON);