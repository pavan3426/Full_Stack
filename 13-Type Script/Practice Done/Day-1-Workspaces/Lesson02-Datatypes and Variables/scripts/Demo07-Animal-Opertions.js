var animalName = "Elephant";
var newAnimalName = "Tiger";
// Perform Union Operations
function showDetails(nature) {
    // Enum Usage
    var animalNature;
    (function (animalNature) {
        animalNature[animalNature["SOFT"] = 0] = "SOFT";
        animalNature[animalNature["CRUEL"] = 1] = "CRUEL";
        animalNature[animalNature["AFRAIDOFUS"] = 2] = "AFRAIDOFUS";
    })(animalNature || (animalNature = {}));
    if (typeof (nature) === 'string') {
        console.log("Nature is : " + animalNature.CRUEL);
    }
    else if (typeof (nature) === 'boolean') {
        console.log("Nature is : " + animalNature.AFRAIDOFUS);
    }
}
showDetails("Cruel");
showDetails(true);
