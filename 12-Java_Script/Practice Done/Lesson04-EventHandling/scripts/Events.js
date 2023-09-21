function showSpeakersBanner(){
    alert("You Have Clickes on Section-1");
}

    window.addEventListener("load", function() {
        var section2Element =this.document.getElementById("section-2");
       
        section2Element.addEventListener("click", function() {
            alert("you have Clicked on section-2" );
        } , false );

    });
