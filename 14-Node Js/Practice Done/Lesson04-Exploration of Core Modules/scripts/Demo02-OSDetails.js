const os = require("os");

console.log("OS CPUS \n "+ os.cpus());
console.log("OS ARCH \n "+os.arch());
console.log("OS Network Interfaces \n" ,os.networkInterfaces());
