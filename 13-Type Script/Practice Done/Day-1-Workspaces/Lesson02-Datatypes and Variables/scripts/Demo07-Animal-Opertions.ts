let animalName: string = "Elephant";

// Type Aliases
type animalNameType = string;
let newAnimalName : animalNameType = "Tiger";

// Perform Union Operations
function showDetails(nature: string | boolean) {

    // Enum Usage
    enum animalNature {
        SOFT, CRUEL, AFRAIDOFUS
    }

    if(typeof(nature) === 'string') {
        console.log("Nature is : " + animalNature.CRUEL);
    }
    else if(typeof(nature) === 'boolean') {
        console.log("Nature is : " + animalNature.AFRAIDOFUS);
    }
}

showDetails("Cruel");
showDetails(true);