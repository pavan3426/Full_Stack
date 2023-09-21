var side1 = 5, side2 = 6, side3 = 7;
function findArea(side1, side2, side3) {
    var s = (side1 + side2 + side3) / 2;
    var area = Math.sqrt(s * ((s - side1) * (s - side2) * (s - side3)));
    return area;
}
console.log("Area of triangle is :- " + findArea(side1, side2, side3));
