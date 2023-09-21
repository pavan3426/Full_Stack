var myObject ={
    name :"Ring",
    diameter : 12,
    // Object Delclaration with in Another Object 
    specs: {
        material : "Wood",
        waterProof : false
    }
};

// Heterogenous Arrays 
var myArray = ["One", "Two" , 3 ,"Four" , 'v',6 ];
myArray[20] = "twenty";

// Accessing Object in different Ways

console.log("Accessing via Dot Operator");

console.log(myObject.name +"\t" + myObject.diameter+"\t"+ myObject.specs.material);

console.log("Accessing Via OFF Operator ");
console.log(myObject["name"]+ "\t"+ myObject["diameter"]+"\t"+myObject["specs"]["material"]);

//Showing Arrays with Dynamics
console.log(myArray[0]);
console.log(myArray[20]);

console.log(myArray.length);

