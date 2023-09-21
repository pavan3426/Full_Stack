var http = require('http');

var server = http.createServer(function(req, res){
    res.head(200, {'Content-Type' : 'text/html'});
    res.end("Hello From Server ... ");
});
server.listen(7777);