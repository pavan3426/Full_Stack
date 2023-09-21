window.addEventListener("load" , function(){
    var button = document.getElementById("ageButton");
    button.addEventListener("click", function(){
        // Got Hold of the UI Elements
        var ageOutputElement = document.getElementById("ageOutput");
        var ageTextElement = document.getElementById("ageInput");
        var ageTextValue = ageTextElement.value;
        // Conversion 
        var givenAge = parseInt(ageTextValue, 10);
        // alert(givenAge);
        var result ="";
        if(isNaN(givenAge)) {
            result ="Pls Input a Number !";
            ageTextElement.value = ""; // Erasing the Content from Txtfld
        }
        else {
            result = ((100 - givenAge) + " Years Left Before You Turn 100 ! Whoooha ") ;
        }
        console.log(result);
        ageOutputElement.innerHTML = result;
    });
});