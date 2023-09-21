const mySentence = "the quick brown fox";
const words = mySentence.split(" ");
var out=""
for (let i = 0; i < words.length; i++) {
    out += words[i][0].toUpperCase() + words[i].substr(1)+" ";
}
console.log(out);
