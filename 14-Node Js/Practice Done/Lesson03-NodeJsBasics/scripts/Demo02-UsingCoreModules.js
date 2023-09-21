var http = require("module");

// import {http} from 'http';

var server = http.createServer(function(req,res){
    res.head(200,{'Content-Type' : 'text/html'});
    res.end("Hello From Server ...");
});
server.listen(7788);
