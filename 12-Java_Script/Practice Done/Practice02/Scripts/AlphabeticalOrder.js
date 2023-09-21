function alphabeticOrder(str){
    var array = str.split("");
    array.sort();
    var sortedStr = array.join("");
    return sortedStr
}

var str="boyapati pavan"
console.log(alphabeticOrder(str));