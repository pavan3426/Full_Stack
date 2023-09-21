// Arrays inTS
var studentsScoresInMaths : number[] = [86,97,94,93];

var studentMarksInAnotherWay : Array<number> =[94,99,98,92];

// Tuple DataTypes[Includes Two set of values of Diffenrent DataTypes]

let a: [string,number];

a = ["Pavan",98];

class Employee{
    empId : number;
    empName : string;

    constructor(givenEmpId: number, givenEmpName : string ) {
        this.empId = givenEmpId;
        this.empName = givenEmpName;
       
    }

    
    displayDetails():void {
        console.log("Employee Detaiuls:- ");
        console.log("Emp Id : " + this.empId);
        console.log("EmpName : "+ this.empName);

    }
}

interface Shape{
    draw() : any;
}

class Circle implements Shape{

    draw():any {
        console.log("Circle drawn using draw metnod ");
    }

}

enum Season{
    Summer,Atumn, Rainy, Winter
}

let seasonEnumRef : Season;

console.log(Season.Summer);

