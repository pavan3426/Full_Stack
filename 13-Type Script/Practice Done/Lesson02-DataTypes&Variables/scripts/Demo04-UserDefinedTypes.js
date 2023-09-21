// Arrays inTS
var studentsScoresInMaths = [86, 97, 94, 93];
var studentMarksInAnotherWay = [94, 99, 98, 92];
// Tuple DataTypes[Includes Two set of values of Diffenrent DataTypes]
var a;
a = ["Pavan", 98];
var Employee = /** @class */ (function () {
    function Employee(givenEmpId, givenEmpName) {
        this.empId = givenEmpId;
        this.empName = givenEmpName;
    }
    Employee.prototype.displayDetails = function () {
        console.log("Employee Detaiuls:- ");
        console.log("Emp Id : " + this.empId);
        console.log("EmpName : " + this.empName);
    };
    return Employee;
}());
var Circle = /** @class */ (function () {
    function Circle() {
    }
    Circle.prototype.draw = function () {
        console.log("Circle drawn using draw metnod ");
    };
    return Circle;
}());
var Season;
(function (Season) {
    Season[Season["Summer"] = 0] = "Summer";
    Season[Season["Atumn"] = 1] = "Atumn";
    Season[Season["Rainy"] = 2] = "Rainy";
    Season[Season["Winter"] = 3] = "Winter";
})(Season || (Season = {}));
var seasonEnumRef;
console.log(Season.Summer);
