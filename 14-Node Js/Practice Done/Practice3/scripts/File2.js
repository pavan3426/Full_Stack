var http = require('http');
const fs =require('fs');

http.createServer(function(req,res){
    const dir='./DataFile.txt';
    fs.access(dir,function(err,fs){
        if(err){
            console.log("Some error in accessing the permission..");

        }
        else{
            console.log()
        }
    })
}).listen(3000);