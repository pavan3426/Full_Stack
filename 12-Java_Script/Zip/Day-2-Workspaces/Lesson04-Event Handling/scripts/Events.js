function showSpeakersBanner() {
    alert("You Have Clicked on Section-1");
}

window.addEventListener("load", function(){

    var section2Element = document.getElementById("section-2");

    section2Element.addEventListener("click", function(){
        alert("You have Clicked on Section -2 ");
    }, false);

});