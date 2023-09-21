function decalareVariable() {
    
    if(true) {
        var x = "Declared Within the Block of Code";
    }

    // This Shows There is No Block Variable Scope in Traditional JS 
    console.log("Value of X  : " + x); 

}

decalareVariable();