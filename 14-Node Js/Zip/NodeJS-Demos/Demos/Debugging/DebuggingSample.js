var fs = require('fs');

fs.readFile('Data.txt', 'UTF8', function(err,data){
        debugger;
        if(err) throw err;
        
        console.log(data);
}); 