var normalString = "Hello World";
replacedString(normalString);
function replacedString(normalString) {
    if (normalString.length < 3) {
        console.log(normalString);
    }
    else {
        var lastThreeCharacters = normalString.slice(-3);
        console.log(lastThreeCharacters + normalString + lastThreeCharacters);
    }
}
