function doSomething(givenValue){
    value = givenValue || 'Default Value';
    console.log(value);
}
doSomething();
doSomething(null);
doSomething("Hello");
doSomething(true);
doSomething(false);