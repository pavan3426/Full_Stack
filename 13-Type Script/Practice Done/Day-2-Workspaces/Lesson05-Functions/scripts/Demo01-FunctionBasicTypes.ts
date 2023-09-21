// Named Functions
// Without Parameters and Without Return Types
function sayHello() {
    console.log("Hello From Without Parameters and Without Return Types");
}

//With Parameters and With Return Types
function welcomeAll(givenName: string): string {
    return "Hey, " + givenName + " To the World of TypeScript ... ";
}

sayHello();
console.log(welcomeAll("Rahul"));

// Anonymous Functions
// Without Parameters and Without Return Types
var callHello = function() {
    console.log("Hello From Without Parameters and Without Return Types");
}

//With Parameters and With Return Types
var callAll = function(givenName: string): string {
    return "Hey, " + givenName + " To the World of TypeScript ... ";
}

sayHello();
console.log(welcomeAll("Rahul"));