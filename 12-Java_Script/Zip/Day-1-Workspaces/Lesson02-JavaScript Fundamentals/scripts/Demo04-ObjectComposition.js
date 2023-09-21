
var myObject = {

    name: "Ring",
    diameter: 12,

    // Object Declaration within Another Object
    specs: {
        material: "Wood",
        waterProof: false
    }
};

// Heterogeneous Arrays
var myArray = ["One", "Two", 3, "Four", "Five", 6];
//myArray[20] = "Sixteen";

// Accessing Objects Using Different Ways
console.log("Accessing Via DOT Operator ");
console.log(myObject.name + "\t" + myObject.diameter + "\t" + myObject.specs.material);

console.log("Accessing Via OFF Operator ");
console.log(myObject["name"] + "\t" + myObject["diameter"] + "\t" + myObject["specs"]["material"]);

// Showing Arrays With Dynamicness 
console.log(myArray[0]);
console.log(myArray[20]);
console.log(myArray.length);
