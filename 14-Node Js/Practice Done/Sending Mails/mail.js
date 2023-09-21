var nodeMailer = require('nodemailer');

var transporter = nodeMailer.createTransport({
    service:'gmail',
    auth:{
        user:'boyapatipavankumar980@gmail.com',
        pass:'P@v@n1419421'
    }
})
var options = {
    from: 'boyapatipavankumar980@gmail.com',
    to :'redminotefourmymobile981@gmail.com',
    subject :'Testing mail',
    text :'sending mail via node js'
}
transporter.sendMail(options,(err,info)=>{
    if(err){
        console.log(err);
    }
    else{
        console.log('Email is Sent Successfully' + info.response);
    }
})