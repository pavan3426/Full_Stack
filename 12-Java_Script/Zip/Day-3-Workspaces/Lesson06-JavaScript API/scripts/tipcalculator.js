// Registering the Load Event on the Browser Window
window.addEventListener("load", function(){
    
    /* Tip Calucation */
    var calculateTipButton = document.getElementById("tipButton");
    // On the Button Now We Need Register a Listener 
    calculateTipButton.addEventListener("click", function(){
       
       var tipTotalBillElement = document.getElementById("tipTotalBill");
       var tipNumberOfPeopleElement = document.getElementById("tipNumberOfPeople");
       var tipOutputElement = document.getElementById("tipOutput");

       var billTotal = parseFloat(tipTotalBillElement.value);
       var people = parseFloat(tipNumberOfPeopleElement.value);

       // Total Bill Amount with Tip
       var totalWithTip = billTotal + (billTotal * 0.1);

       // Divide Total
       var dividedTotal = totalWithTip / people;
       if(isNaN(dividedTotal)) {
           tipOutputElement.innerHTML = "Please Enter Numbers";
       }
       else if(isFinite(dividedTotal)) {
           tipOutputElement.innerHTML = "Each of You Will Pay : " + dividedTotal;
       }
       else {
           tipOutputElement.innerHTML = "Can't Divide a Number By Zero";
       }
    }); // End of Tip Calculation Function 
});