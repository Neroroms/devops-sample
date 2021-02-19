import groovy.json.JsonSlurper
import groovy.json.JsonOutput

String iHaveResponseService = "http://172.20.0.100/json-please"

def connection = new URL(iHaveResponseService).openConnection()

connection.setRequestProperty("Content-Type", "application/json")
connection.setRequestMethod("GET")
connection.connect()

if(connection.responseCode == 200) {
  def res = connection.content.text

  def resMap = new JsonSlurper().parseText(res)

  println resMap

  def resJson = JsonOutput.toJson(resMap)

  println JsonOutput.prettyPrint(resJson)
}
else {
  println "Connection is not 200. (╯°□°）╯︵ ┻━┻"
}