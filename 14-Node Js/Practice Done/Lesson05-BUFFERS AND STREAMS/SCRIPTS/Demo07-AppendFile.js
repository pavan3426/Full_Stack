var fs = require('fs');

fs.appendFile('Data1.txt', ' This is new content ', (err,fd)=>{
    if(err){
        throw err;
    }
    else{
        console.log("Appending  is completed !");
    }
    // console.log(fd.toLocaleString());
});