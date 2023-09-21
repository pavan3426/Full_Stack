var fs = require('fs')

fs.unlink('NewData.txt', function(){
    console.log(" Delete Operation Done ... ");
});