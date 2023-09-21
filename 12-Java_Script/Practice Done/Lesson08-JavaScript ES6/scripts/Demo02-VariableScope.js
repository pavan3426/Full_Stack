function declareVariable(){
    if(true){
    var x = "Declared in the Block of Code";
    let y = "Declared in the Block of Code";
   
    }
    console.log(x); //can be accessed since its method variable
    console.log(y); //can't accessed since its block variable Scope
}
declareVariable();
