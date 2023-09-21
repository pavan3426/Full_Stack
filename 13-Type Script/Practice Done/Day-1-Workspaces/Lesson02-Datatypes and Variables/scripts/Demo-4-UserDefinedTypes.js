// Arrays in TS
var studentsScoresInMaths = [98, 91, 88, 82];
var studentsScoresInMathsAnotherWay = [98, 91, 88, 82];
// Tuple DataTypes [ Includes Two Set of Values of Different DataTypes ]
var a;
a = ["Rahul", 99];
var Employee = /** @class */ (function () {
    function Employee(givenEmpId, givenEmpName) {
        this.empId = givenEmpId;
        this.empName = givenEmpName;
    }
    Employee.prototype.displayDetails = function () {
        console.log("Employee Details ");
        console.log("Emp ID   : " + this.empId);
        console.log("Emp Name : " + this.empName);
    };
    return Employee;
}());
var Circle = /** @class */ (function () {
    function Circle() {
    }
    Circle.prototype.draw = function () {
        console.log("Drawing a Circle ... ");
    };
    return Circle;
}());
var Season;
(function (Season) {
    Season[Season["Summer"] = 0] = "Summer";
    Season[Season["Autumn"] = 1] = "Autumn";
    Season[Season["Rainy"] = 2] = "Rainy";
    Season[Season["Winter"] = 3] = "Winter";
})(Season || (Season = {}));
var seasonEnumRef;
console.log(Season.Summer);
