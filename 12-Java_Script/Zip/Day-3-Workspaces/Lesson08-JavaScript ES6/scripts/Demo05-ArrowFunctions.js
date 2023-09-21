// 3 Parts of Arrow Functions

/*
    1. Parameters
    2. Fat Arrow Notation
    3. Body Statements
*/

// Without Arrow Functions
function doAdd(...args) {
    let sum = 0;
    for(let i of args) {
        sum += i;
    }
    console.log("Sum : " + sum);
}

// Using Arrow Functions
var doAddition = (...args) => {
    let sum = 0;
    for(let i of args) {
        sum += i;
    }

    console.log("Sum : " + sum);
}