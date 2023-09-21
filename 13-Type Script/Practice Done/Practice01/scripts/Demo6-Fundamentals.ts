let examType : string = "Final-exam";
let marks: number[] = [93,96,88];
let avgMarks :number  = averageMarks(marks);

 

function averageMarks(marks: number[] ){
    var sum : number =0;
    for(var i: number = 0; i<marks.length;i++){
        sum += marks[i]; 
        
    }


    return sum/3;
}

function getGrades(avgMarks : number,examType :string){
    if(avgMarks>=90 && examType == "Final-exam"){
        return "A+";
    }
    else if(avgMarks>=89){
        return "A+";
    }
    else if (avgMarks>=75){
        return "A";
    }
    else if (avgMarks>=60){
        return "B";
    }
    else{
        return "Failed, Try again!";
    }
}


console.log("Your grade is :- "+getGrades(avgMarks,examType));


