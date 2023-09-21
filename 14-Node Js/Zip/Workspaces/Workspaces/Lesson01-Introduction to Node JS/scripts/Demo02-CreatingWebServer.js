var http = require('http');

http.createServer(function(req, res){
    res.writeHead(200, {'Content-Type': 'text/html'});
    res.write('<h1>Welcome to the New Era of Developing Applications using Node JS <br>');
    var dateObj = new Date();
    res.end('The Current Date and Time on Server is : ' + dateObj + '</h1>');

}).listen(7777);

console.log("Server Started ... ");