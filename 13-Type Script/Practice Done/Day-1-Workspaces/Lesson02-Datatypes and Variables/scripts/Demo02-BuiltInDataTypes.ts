// Number Specific DataTypes
var ageLimit: number = 21;
var colorCode: number = 0x3434;
var octalCode: number =0o234;
var binaryCode: number = 0b111011;


// String Specific DataTypes
let empName: string = "Rahul";
let empDept: string = "Admin";

console.log(empName);
console.log(empDept);


// Boolean Type
let isAMovie: boolean = true;

console.log(isAMovie);


// Void Usage
function sayHello(): void {
    console.log("Hello Everyone ... ");
}

sayHello();
// Null Type and Undefined Type
let tempNumber: void  = undefined;

console.log(tempNumber);

tempNumber = null;

console.log(tempNumber);

//tempNumber = 123;

// Any Type of Data 
var value1: any = "Hello";
    value1 = 234;
    value1= true;

    console.log(value1);
    
// BigInt DataTypes
// let big1: bigint = BigInt(100); // BigInt Function
//let big2: bigint = 100n;
// console.log(big1 + "\t");