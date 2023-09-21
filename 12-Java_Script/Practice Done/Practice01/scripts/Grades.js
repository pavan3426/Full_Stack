var marks = 89;

function getGrade(marks, termExam){
    if(termExam=="Final-exam" && marks >=90){
       return "A+"
    }
    else if(termExam=="Mid-exam" && marks >=89){
        return "A+"
     }
     else{
        return false;
     }

}

console.log(getGrade(90, "Final-exam"));
console.log(getGrade(88, "Mid-exam"));
console.log(getGrade(90, "Mid-exam"));


