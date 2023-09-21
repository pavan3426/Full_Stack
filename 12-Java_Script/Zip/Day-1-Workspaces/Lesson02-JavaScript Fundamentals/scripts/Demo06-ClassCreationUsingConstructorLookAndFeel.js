function displayDetails() {
    console.log("Movie Details ");
    console.log("ID     : " + this.id);
    console.log("Title  : " + this.title);
    console.log("Rating : " + this.rating);   
}

// We are Creating a Class By the Name Movie 
function Movie(givenId, givenTitle, givenRating) {
    // We are Declaring Instance Variables and Initialized 
    this.id = givenId;
    this.title = givenTitle;
    this.rating = givenRating;

    // Associating Functions With a Class 
    this.Details = displayDetails;
}

var mov1 = new Movie(1001, "Vikram", "Fantabulous");
mov1.Details();

var mov2 = new Movie(1002, "Kantara", "Awesome");
mov2.Details();
