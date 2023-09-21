var http = require('http');
var server = http.createServer(function (req, res) {

    if(req.url == '/data') {
        res.writeHead(200, {'Content-type' : 'application/json'});
        res.write(JSON.stringify({message: "Hello World"}));
        res.end();
    }
    
});
server.listen(3000);
console.log("Server Started and Listening on Port 3000 ");