function InventoryItem(givenCondition, givenPrice){
    this.condition=givenCondition;
    this.price=givenPrice;

}

InventoryItem.prototype.sayHello = function(){
    console.log("Hello From Inventory Item ");
}

function Movie(){

}

Movie.prototype = new InventoryItem();

var mov1 = new Movie();
mov1.sayHello();
