function alphabeticOrder(str){
    var array = str.split("");
    array.sort();
    var sortedStr = array.join("");
    return sortedStr
}

var str="webmaster"
console.log(alphabeticOrder(str));