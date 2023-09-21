function displayDetails(){
    console.log("Movie Details :-");
    console.log("ID     :"+this.id);
    console.log("Title  :"+this.title);
    console.log("Rating :"+this.rating);
}


// We are Creating a class by the Name Movie
function Movie(givenId,giventitle,givenRating){

    // We are declaring Instance Variables And Initialized
    this.id=givenId;
    this.title=giventitle;
    this.rating=givenRating;

    // Associating Function with a class
    this.displayDetails=displayDetails;

}

var mov1 = new Movie (1001, "vikram", "Fantabulous");
mov1.displayDetails();

var mov2= new Movie(1002,"RRR","Awesome");
mov2.displayDetails();

console.log(typeof mov1);