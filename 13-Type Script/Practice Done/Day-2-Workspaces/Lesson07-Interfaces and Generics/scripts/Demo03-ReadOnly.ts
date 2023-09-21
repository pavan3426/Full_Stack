class Employee {
    readonly empNo: number;
    empName: string;

    constructor(givenEmpNo: number, givenEmpName: string) {
        this.empNo = givenEmpNo;
        this.empName = givenEmpName;
    }

}

let empRef1 = new Employee(1001, "Rahul");
empRef1.empNo  = 1002;
empRef1.empName = "Smith";


interface MovieDet {
    readonly movId: number;
    title: string;
    rating: string;
}

let MovRef1: MovieDet = {
    movId: 1,
    title: "KGF Chapter-2",
    rating: 'Average'
}

MovRef1.movId = 2;