var oldString = "Java Training is going on";
var position = 6;
var newString = positionRemoval(oldString, position);
function positionRemoval(oldString, position) {
    if (position < 0 || position > oldString.length) {
        console.log("Your old String is :- " + oldString);
        console.log("Your new String is :- " + oldString);
    }
    else {
        console.log("Your old String is :- " + oldString);
        console.log("Your new String is :- " + oldString.slice(0, position) + oldString.slice(position + 1));
    }
}
