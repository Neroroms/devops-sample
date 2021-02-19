import groovy.json.JsonSlurper
import groovy.json.JsonOutput

def obj = [
  "name": "unknown",
  "age": "top-secret",
  "knowledge": [
    "nothing",
    "but",
    "nothing"
  ]
]

println obj
//Map to json
def jsonObj = JsonOutput.toJson(obj)

println jsonObj

String jsonString = """{"name": "Dune", "age": "It's over ninethousand"}"""

//String to json
def jsonObjFromStr = new JsonSlurper().parseText(jsonString)

println jsonObjFromStr