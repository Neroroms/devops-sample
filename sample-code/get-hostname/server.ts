import * as os from 'os';
var express = require('express')
var app = express()

app.get("/", (req, res) => {
  var hostName = os.hostname()

  res.send(hostName)
}) 

app.listen(3000, () => {
  console.log("Server start")
})