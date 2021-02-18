def numbers = 1..10000

def startDate = new Date()

for (number in numbers) {
  String iHaveResponseService = "http://172.20.0.100/json-please"
  def connection = new URL(iHaveResponseService).openConnection()

  connection.setRequestProperty("Content-Type", "application/json")
  connection.setRequestMethod("GET")
  connection.connect()

  println connection.content.text
}

def endDate = new Date()

println "Start: ${startDate}, End: ${endDate}"