var Employee = /** @class */ (function () {
    function Employee(empNo, empName, salary) {
        this.empNo = empNo;
        this.empName = empName;
        this.salary = salary;
        this.bonus = this.salary * 0.1;
    }
    Employee.prototype.displayDetails = function () {
        return "Employee details [Emp No :".concat(this.empNo, " Emp Name : ").concat(this.empName, "\n                                    Salary : ").concat(this.salary, " Bonus Given : ").concat(this.bonus, "]");
    };
    return Employee;
}());
var empRef1 = new Employee(1001, "Rahul", 100000);
console.log(empRef1.displayDetails());
var empRef2 = new Employee(1002, "Pavan", 100000);
console.log(empRef2.displayDetails());
