class Employee{
    private bonus : number;
    constructor(private empNo:number, private empName: String, private salary:number){
        this.bonus=this.salary *0.1;

    }
    displayDetails(){
        return `Employee details [Emp No :${this.empNo} Emp Name : ${this.empName}
                                    Salary : ${this.salary} Bonus Given : ${this.bonus}]`;
    }
}

var empRef1 = new Employee (1001,"Rahul",100000);
console.log(empRef1.displayDetails());

var empRef2 = new Employee (1002,"Pavan",100000);
console.log(empRef2.displayDetails());