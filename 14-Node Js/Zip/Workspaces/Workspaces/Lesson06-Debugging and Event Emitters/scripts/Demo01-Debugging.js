var fs = require('fs');
fs.readFile('Data.txt', 'utf8', function(err, fd) {
    debugger;
    if(err) {
        throw err;
    }
    else {
        console.log(fd);
    }
});