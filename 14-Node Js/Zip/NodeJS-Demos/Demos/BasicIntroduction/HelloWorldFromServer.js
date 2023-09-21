
var http = require('http');

http.createServer(function (req, res){
        res.writeHead(200, {'Content-Type' : 'text/html'});
        var dobj = new Date();
        console.log(dobj);
        res.write(dobj.toString());
        res.end(' Hello World ' );
}).listen(9090);

console.log(' Node JS Server is Listening to 9090 ');