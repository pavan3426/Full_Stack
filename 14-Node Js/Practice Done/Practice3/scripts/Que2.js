var http = require('http');

http.createServer(function(req,res){
   
    
    res.writeHead(200,{'Content-Type':'text/html'});

    res.write('<h1> Welcome </h1><br>');
    var dateObject = new Date();
    res.end('The current date and time on server is : '+ dateObject +'</h1>');
}).listen(3000);
console.log("Server Started ... ");