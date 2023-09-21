 var cources = [ "JavaScript", "TypeScript", "NodeJS","React","Angular","vue","OJET"];
 var students = [10,14,12,26,34,94];

 console.log(students);

//  SingleTon Object 

var course ={
    name : "JavaScript Essentials",
    students : 9,
    frequency: "daily"
};

//Accessing Array Elements
console.log(cources[0] + "\t" + students[0] +"\t" + cources[3] + "\t"+ students[3]) ;

//Accessing the Object Attributes

console.log("Course Details ");
console.log(course.name + "\t"+ course.students + "\t" + course.frequency);
