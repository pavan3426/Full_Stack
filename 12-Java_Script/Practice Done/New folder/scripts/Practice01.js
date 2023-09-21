// Function to calculate the area of a triangle
function triangleArea(a, b, c) {
    // Using Heron's formula to calculate the area
    var s = (a + b + c) / 2; // Calculate the semi-perimeter
    var area = Math.sqrt(s * (s - a) * (s - b) * (s - c)); // Calculate the area
    return area;
  }
  
  // Test case with side lengths 5, 6, and 7
  var side1 = 5;
  var side2 = 6;
  var side3 = 7;
  
  var triangleArea = triangleArea(side1, side2, side3);
  console.log("The area of the triangle is: " + triangleArea);
  