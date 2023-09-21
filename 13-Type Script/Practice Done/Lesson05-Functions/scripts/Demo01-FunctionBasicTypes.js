// named functiion
// without parameters and without return type
function sayHello() {
    console.log("Hello  From without parameters and without return type ");
}
// with parameters and return type 
function welcomeAll(givenName) {
    return "Hey, " + givenName + " To the world type Script";
}
sayHello();
console.log(welcomeAll("Pavan "));
// Annonymous functiion
// without parameters and without return type
var sayHello1 = function () {
    console.log("Hello  From Anonymous Function without parameters and without return type ");
};
// with parameters and return type 
var callAll = function (givenName) {
    return "Hey, " + givenName + " Welcome to the world type Script from Anonymous Function";
};
sayHello1();
console.log(callAll("Boyapati "));
