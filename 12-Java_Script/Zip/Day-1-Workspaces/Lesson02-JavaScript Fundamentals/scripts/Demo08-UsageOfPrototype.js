// We are Creating a Class By the Name Movie 
function Movie(givenId, givenTitle, givenRating) {
    // We are Declaring Instance Variables and Initialized 
    this.id = givenId;
    this.title = givenTitle;
    this.rating = givenRating;
}

Movie.prototype.displayDetails = function() {
    console.log("Movie Details ");
    console.log("ID     : " + this.id);
    console.log("Title  : " + this.title);
    console.log("Rating : " + this.rating);   
}

var mov1 = new Movie(1001, "Vikram", "Fantabulous");
mov1.displayDetails();

var mov2 = new Movie(1002, "Kantara", "Awesome");
mov2.displayDetails();

