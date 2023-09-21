class Employee {

    private bonus: number;

    constructor(private empNo: number, private empName: string, private salary: number) {
        this.bonus = this.salary * 0.1;
    }

    // This Function Shows a New Syntax with DataBinding Concept
    displayDetails() {
        return `Employee Details [ Emp No : ${this.empNo}  Emp Name : ${this.empName} 
                                Salary : ${this.salary} Bonus Given : ${this.bonus}]`;
    }

}

var empRef1 = new Employee(1001, "Rahul", 100000);
empRef1.displayDetails();

var empRef2 = new Employee(1002, "Smith", 100000);
empRef2.displayDetails();