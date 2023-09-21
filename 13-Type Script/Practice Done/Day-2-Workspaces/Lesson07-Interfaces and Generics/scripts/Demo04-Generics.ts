// Without Generics
function retrieveArray(items: any[]) : any[] {
    return new Array().concat(items);
}

let myNumberArr = retrieveArray([100,200,300,400]);

let myStringArr = retrieveArray(['Rahul', 'Smith', 'Imran']);

myNumberArr.push(500);
myStringArr.push('Raghav');

myNumberArr.push("Saif");
myStringArr.push(23);


function retrieveGenericsArray<T>(items: T[]) : T[] {
    return new Array().concat(items);
}

let myNumberArr1 = retrieveGenericsArray<number>([100,200,300,400]);

let myStringArr1 = retrieveGenericsArray<string>(['Rahul', 'Smith', 'Imran']);

myNumberArr1.push(500);
myStringArr1.push('Raghav');

myNumberArr1.push("Saif");
myStringArr1.push(23);