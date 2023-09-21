interface Shape{
    draw();
    erase();
    describe();

}
class Circle implements Shape{
    draw() {
        console.log("Drawing a Circle...")
    }

    erase() {
        console.log("circle erased")
    }
    describe() {
        console.log("This is a circle Shape...")
    }

}


