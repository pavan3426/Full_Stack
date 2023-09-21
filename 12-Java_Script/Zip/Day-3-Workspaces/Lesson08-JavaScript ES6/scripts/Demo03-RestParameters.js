function doAdd(...args) {
    let sum = 0;
    for(let i of args) {
        sum += i;
    }

    console.log("Sum : " + sum);
}

doAdd(10,20);
doAdd(100,300,400,500,600,700);
doAdd(23,24,25,26);
