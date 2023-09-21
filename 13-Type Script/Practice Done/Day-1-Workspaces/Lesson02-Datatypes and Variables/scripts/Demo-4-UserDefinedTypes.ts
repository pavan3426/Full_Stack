// Arrays in TS
var studentsScoresInMaths: number[] = [98,91,88,82];

var studentsScoresInMathsAnotherWay: Array<number> = [98,91,88,82]; 

// Tuple DataTypes [ Includes Two Set of Values of Different DataTypes ]
let a: [string, number];

a = ["Rahul", 99 ];

class Employee {
    empId: number;
    empName: string;

    constructor(givenEmpId: number, givenEmpName: string ) {
        this.empId = givenEmpId;
        this.empName = givenEmpName;
    }

    displayDetails():void {
        console.log("Employee Details ");
        console.log("Emp ID   : " + this.empId);
        console.log("Emp Name : " + this.empName);
    }

}

 new Employee(1,"Pavan").displayDetails();

interface Shape {
    draw(): any;
}

class Circle implements Shape {
    
    draw() {
        console.log("Drawing a Circle ... ");
    }
}


enum Season {
    Summer, Autumn, Rainy, Winter
}

let seasonEnumRef: Season;

console.log("Season" + Season.Summer);