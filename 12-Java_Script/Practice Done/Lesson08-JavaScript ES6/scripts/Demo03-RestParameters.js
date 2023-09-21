function doAdd(...args){
    let sum=0;
    // let res="";  //for String
    for(let i of args){
        sum += i;
        // res += i;
    }
    console.log("Sum :- "+ sum);
    // console.log("Results :-"+res);
    

}
doAdd(10,20);
doAdd(100,300,400,500,600);
doAdd(23,24,25,26);

// doAdd("Pavan ", "Kumar");  //For Strings
