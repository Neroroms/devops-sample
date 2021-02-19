import groovy.json.JsonSlurper
import groovy.json.JsonOutput

String apiUrl = "http://172.20.0.100/json-please"

def connect = new URL(apiUrl).openConnection()

connect.setRequestProperty("Content-Type", "application/json")
connect.setRequestMethod("GET")
connect.connect()

if(connect.responseCode == 200) {
  def res = connect.content.text
  def resMap = new JsonSlurper().parseText(res)

  
  return resMap.simpleArray 

}