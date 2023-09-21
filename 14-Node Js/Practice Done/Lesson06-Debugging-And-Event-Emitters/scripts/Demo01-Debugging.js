var fs =  require('fs');

fs.readFile('Data.txt','utf8',function(err,fd){
    console.log("Debugging starts..");
    debugger;
    if(err){
        throw err;
    }
    else{
        
        console.log(fd);
    }
});