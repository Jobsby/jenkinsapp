var express = require('express');
var app = express();

app.get('/', function (req, res) {
  res.send('Hallo Matze, Kollege!');
});


var portEnv = (process.env.PORT || 3000);
 
var server = app.listen(portEnv, function () {
  var host = server.address().address;
  var port = server.address().port;

  console.log('Example app listening at http://%s:%s', host, port);
});
