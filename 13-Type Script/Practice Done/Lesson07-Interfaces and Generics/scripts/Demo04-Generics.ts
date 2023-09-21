function retrieveArray (items:any[] ) : ant[] {
    return new Array().concat(items);
}

let myNumberArr = retrieveArray([100,200,300,400,500]);

let myStringArr = retrieveArray(['pavan', 'john','Dustin']);

myNumberArr.push(600);
myStringArr.push("Boyapati");

myNumberArr.push("Raghava");
myStringArr.push(700);


function retrieveGenericArray<T> (items:T[] ) : T[] {
    return new Array().concat(items);
}

let myNumberArr1 = retrieveGenericArray<number>([100,200,300,400,500]);

let myStringArr2 = retrieveGenericArray<string>(['pavan', 'john','Dustin']);

myNumberArr1.push(600);
myStringArr2.push("Boyapati");

myNumberArr1.push("Raghava");  //Error bcz it accept number type only
myStringArr2.push(700);        //error bcz it accepts only string type

