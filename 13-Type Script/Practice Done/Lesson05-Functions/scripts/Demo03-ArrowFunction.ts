let addNumbers = (...args :Array<number>) => {
    var sum=0;
    for(let i of args){
        sum += i;
    }
    console.log("Resuls is :-"+ sum);
}

addNumbers(10,20,30,40);