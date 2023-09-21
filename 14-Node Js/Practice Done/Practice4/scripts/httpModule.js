const http = require('http');
const fs= require('fs');

var server = http.createServer(function(req,res){
    if(req.url == '/'){
        fs.readFile('index.html', (error,data)=>{
            if(error){
                res.writeHead(404,{'Context-Text':'text/plain'});
                res.end('404 Not Found');
            }
            else{
                res.writeHead(200,{'Context-Text':'text/html'});
                res.end(data);
            }
        })
    }
    
    else if(req.url =='/foo'){
        fs.readFile('foo.html', (error,data)=>{
            if(error){
                res.writeHead(404,{'Context-Text':'text/plain'});
                res.end('404 Not Found');
            }
            else{
                res.writeHead(200,{'Context-Text':'text/html'});
                res.end(data);
            }
        })
    }
}).listen(3344);
console.log("Server start running on port 3344");

