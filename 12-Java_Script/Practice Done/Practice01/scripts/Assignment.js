var student = {
    name: "David Rayy",
    sclass: "VI",
    rollno: 12
  };
  
  
  
  console.log(student.name+ ", "+student.sclass+" ,"+student.rollno);
  
  
  console.log("Object before deleting the 'rollno' property:");
  console.log(student);
  
  delete student.rollno;
  
  console.log("Object after deleting the 'rollno' property:");
  console.log(student);