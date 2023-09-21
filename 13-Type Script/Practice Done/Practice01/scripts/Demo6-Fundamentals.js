var examType = "Final-exam";
var marks = [93, 96, 88];
var avgMarks = averageMarks(marks);
function averageMarks(marks) {
    var sum = 0;
    for (var i = 0; i < marks.length; i++) {
        sum += marks[i];
    }
    return sum / 3;
}
function getGrades(avgMarks, examType) {
    if (avgMarks >= 90 && examType == "Final-exam") {
        return "A+";
    }
    else if (avgMarks >= 89) {
        return "A+";
    }
    else if (avgMarks >= 75) {
        return "A";
    }
    else if (avgMarks >= 60) {
        return "B";
    }
    else {
        return "Failed, Try again!";
    }
}
console.log("Your grade is :- " + getGrades(avgMarks, examType));
