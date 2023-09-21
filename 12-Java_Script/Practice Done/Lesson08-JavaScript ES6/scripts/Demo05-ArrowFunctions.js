function doAdd(...args){
    let sum=0;
    for(let i of args){
        sum += i;
    }
    console.log("Sum  using normal function:- "+ sum);
}

var doAddition = (...args) =>{
    let sum=0;
    for(let i of args){
        sum += i;
    }
    console.log("Sum  using Arrow Function :- "+sum);
}
doAddition(10,20,30);
doAdd(10,20,30,40);
