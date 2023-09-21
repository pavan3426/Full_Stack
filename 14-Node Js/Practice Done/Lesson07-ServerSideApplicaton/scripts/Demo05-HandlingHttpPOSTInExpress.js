var express = require('express');
var bodyParser = require('body-parser');
var app = express();

app.use(bodyParser.urlencoded({extended: false}));

app.get('/', function(req, res){
    res.sendFile('F:\\Training\\IQ Gateway\\2023\\14-Node JS\\Workspaces\\Lesson07-ServerSideApplications\\Form.html');
});

app.post('/submit-data', function(req, res){
    var name = req.body.firstName + " " + req.body.lastName;
    res.send(name + ' Submitted the Request ');
});

app.put('/update-data', function(req, res){
    res.send('PUT Request');
});

app.delete('/delete-data', function(req, res){
    res.send('DELETE Request');
});


var server = app.listen(5000, function(){
    console.log(' Node JS Server is Running ');
});