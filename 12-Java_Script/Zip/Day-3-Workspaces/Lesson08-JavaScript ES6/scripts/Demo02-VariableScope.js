function declareVariable() {
    if(true) {
        var x = "Declared in the Block of Code";
        let y = "Declared in the Block of Code";
    }

    console.log(x); // Can Be Accessed Since its Method Variable Scope
    // console.log(y); // Can't Access Since its Block Variable Scope
}

declareVariable();