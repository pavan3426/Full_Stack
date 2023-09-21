class InventoryItem {

    constructor(givenCondition, givenPrice) {
        this.condition = givenCondition;
        this.price = givenPrice;
    }

    sayHello() {
        console.log("Hello From Inventory Item ... ");
    }

}

class Movie extends InventoryItem {

    constructor(givenId, givenTitle, givenRating, givenCondition, givenPrice) {
        // Declare and Initialize the Instance Variables
        super(givenCondition, givenPrice);
        this.id = givenId;
        this.title = givenTitle;
        this.rating = givenRating;
    }

    displayDetails() {
        console.log("Movie Details ");
        console.log("ID     : " + this.id);
        console.log("Title  : " + this.title);
        console.log("Rating : " + this.rating);
        console.log("Condition : " + this.condition);
        console.log("Price  : " + this.price);
    }

    sayHello() {
        console.log("Hello From Movie ... ");
    }

}

var mov1Ref = new Movie(1001,"Vikram", "Fantabulous", "Available", "Paid Subscription");
mov1Ref.displayDetails();
mov1Ref.sayHello();

