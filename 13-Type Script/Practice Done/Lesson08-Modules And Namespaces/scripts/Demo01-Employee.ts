class  Employee {

    private bonus: number;

    constructor (private empNo: number, private empName :string, private salary:number){

        this.bonus = this.salary*0.1;

    }
    
    // this function shows a new syntax with databinding concepts

    displayDetails(){
      
         return `Employee Details [Emp No : ${this.empNo}  Emp Name : ${this.empName}  

            Salary : ${this.salary}  Bonus : ${this.bonus}]`;

    }  

}  

 var empRef1 = new Employee(1001,"krishna",200000200);
 console.log(empRef1.displayDetails);