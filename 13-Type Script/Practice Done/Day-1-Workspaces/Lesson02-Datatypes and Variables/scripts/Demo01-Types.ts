var breakFast:string = "Masala Dosa",
    calories:number = 150,
    tasty:boolean = true;


function Speak(food:string, energy:number):void {
    console.log("Our " + food + " Has " + energy + " Calories");
}

Speak(breakFast, calories);