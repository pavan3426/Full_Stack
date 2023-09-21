var Employee = /** @class */ (function () {
    function Employee(empNo, empName, salary) {
        this.empNo = empNo;
        this.empName = empName;
        this.salary = salary;
        this.bonus = this.salary * 0.1;
    }
    // this function shows a new syntax with databinding concepts
    Employee.prototype.displayDetails = function () {
        return "Employee Details [Emp No : ".concat(this.empNo, "  Emp Name : ").concat(this.empName, "  \n\n            Salary : ").concat(this.salary, "  Bonus : ").concat(this.bonus, "]");
    };
    return Employee;
}());
var empRef1 = new Employee(1001, "krishna", 200000200);
console.log(empRef1.displayDetails);
