var fs = require('fs');
var rs = fs.createReadStream('./Sample.txt');
rs.on('open', function () {
  console.log('The file is open');
});