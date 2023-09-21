var fs = require('fs');
fs.copyFileSync('DataFile.txt', 'CopiedFileUsingFS.txt');
console.log("File Copied..");