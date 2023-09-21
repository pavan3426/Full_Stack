var side1:number = 5, side2 :number = 6, side3 : number = 7;

function findArea(side1:number, side2:number, side3:number){
var s: number = (side1+side2+side3)/2;
var area :number =Math.sqrt ( s* ((s-side1) *(s-side2)*(s-side3)));
return area;
}
console.log("Area of triangle is :- " + findArea(side1,side2,side3) );
