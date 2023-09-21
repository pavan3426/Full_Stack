var http = require('http');
var server = http.createServer(function (req, res) {

    if(req.url == '/') {
        res.writeHead(200, {'Content-type' : 'text/html'});
        res.write('<html><body><h2> This a Home Page </h2> </body> </html>');
        res.end();
    }
    else if(req.url == '/student') {
        res.writeHead(200, {'Content-type' : 'text/html'});
        res.write('<html><body><h2> This a Student Page </h2> </body> </html>');
        res.end();
    }
    else if(req.url == '/admin') {
        res.writeHead(200, {'Content-type' : 'text/html'});
        res.write('<html><body><h2> This a Admin Page </h2> </body> </html>');
        res.end();
    }
    else {
        res.end('Invalid Request !');
    }
});
server.listen(3000);
console.log("Server Started and Listening on Port 3000 ");