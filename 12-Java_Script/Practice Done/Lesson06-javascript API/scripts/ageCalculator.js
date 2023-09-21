window.addEventListener("load",function(){

    var ageButtonElement = document.getElementById("ageButton");

    // Registering the Event on button click

    ageButtonElement.addEventListener("click",function(){
        var ageInputElement =document.getElementById("ageInput");
        var ageOutputElement = document.getElementById("ageOutput");

        var ageTextValue = ageInputElement.value;

        // Any thing entered in the text field is in String
       
        var age= parseInt(ageTextValue,10);

        var result ="";

        if(isNaN(age)){
            result = "Input a Number Pls...";
        }
        else{
            result= ((100-age)+"Years Before You Hit a Century")
        }
        console.log(result);
        ageOutputElement.innerHTML = result;

    })
})