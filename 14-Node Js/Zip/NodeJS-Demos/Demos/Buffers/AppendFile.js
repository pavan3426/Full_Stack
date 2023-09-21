var fs = require('fs');

fs.appendFile('Data.txt', 'Hello World', function(err){
    if(err)
        console.log(err);
    else
        console.log(" Append Operation Completed ... ");
});