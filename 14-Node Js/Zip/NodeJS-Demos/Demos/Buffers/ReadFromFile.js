var fs = require('fs');

fs.readFile('Data.txt', function(err, data)
{
    if(err)
        throw err;

    console.log(data);
} );