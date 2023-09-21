//  -----Control Flow----------- 

// Que01


var num1= 30;
var num2 = 60;

console.log("Greater number is "+ GreaterNumber(num1,num2));
function GreaterNumber(num1,num2){
    if(num1>num2){
        return num1;
    }
    else{
        return num2;
    }
}

// Que02

var num1 = 9;
var num2 = 2;
var num3 = 7;
if (num1 >= num2 && num1 >= num3) {
  if (num2 >= num3) {
    console.log("Sorted order: " + num1 + ", " + num2 + ", " + num3);
  } else {
    console.log("Sorted order: " + num1 + ", " + num3 + ", " + num2);
  }
} else if (num2 >= num1 && num2 >= num3) {
  if (num1 >= num3) {
    console.log("Sorted order: " + num2 + ", " + num1 + ", " + num3);
  } else {
    console.log("Sorted order: " + num2 + ", " + num3 + ", " + num1);
  }
} else {
  if (num1 >= num2) {
 console.log("Sorted order: " + num3 + ", " + num1 + ", " + num2);
  } else {
    console.log("Sorted order: " + num3 + ", " + num2 + ", " + num1);
  }
}


// Que03 

// function evenOrOdd(){
for(var i=0 ; i<=15; i++){
    if(i%2==0){
        console.log("\" "+i + " is even \"");
    }
    else{
        console.log("\" "+i + " is odd\"");
    }
}
// }

// evenOrOdd();


// Que04


var students = [
    { name: "David", marks: 80 },
    { name: "Vinoth", marks: 77 },
    { name: "Divya", marks: 88 },
    { name: "Ishitha", marks: 95 },
    { name: "Thomas", marks: 68 }
  ];

  var result = "";
  for (var i = 0; i < students.length; i++) {
    var student = students[i];
    var grade = "";
    if (student.marks < 60) {
      grade = "F";
    } else if (student.marks < 70) {
      grade = "D";
    } else if (student.marks < 80) {
      grade = "C";
    } else if (student.marks < 90) {
      grade = "B";
    } else {
      grade = "A";
    }
    result += student.name + ": " + grade + "\n";
  }
  console.log("Grades:\n" + result);
