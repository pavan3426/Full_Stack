const dns= require('dns');
dns.lookupService('127.0.0.1', 22, (err,hostName,service)=>{
    console.log(hostName, service);
 
});