let normalString : string = "Hello World";

replacedString(normalString);

function replacedString(normalString:string){
    if(normalString.length < 3){
        console.log(normalString);
    }
    else{
        let lastThreeCharacters=normalString.slice(-3);
        console.log(lastThreeCharacters+ normalString + lastThreeCharacters);

    }
}