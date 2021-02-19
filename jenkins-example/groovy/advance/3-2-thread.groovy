def numbers = 1..10000
def threadGroup = []

def threadPrepareStart = new Date()
numbers.each { number ->
  def thread = new Thread({ 
    String iHaveResponseService = "http://172.20.0.100/json-please"
    def connection = new URL(iHaveResponseService).openConnection()

    connection.setRequestProperty("Content-Type", "application/json")
    connection.setRequestMethod("GET")
    connection.connect()

    println connection.content.text
  })

  threadGroup.push(thread)
}
def threadPrepareStop = new Date()

def startDate = new Date()

threadGroup.each { it.start() }
threadGroup.each { it.join() }

def endDate = new Date()

println "Prepare time. Strat: ${threadPrepareStart}, End: ${threadPrepareStop}"
println "Thread time. Start: ${startDate}, End: ${endDate}"