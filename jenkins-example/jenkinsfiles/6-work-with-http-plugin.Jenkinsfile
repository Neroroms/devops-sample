//Http request plugin
node("ubuntu-worker") {
  def response, content

  stage("Get response") {
    response = httpRequest(
      acceptType: "APPLICATION_JSON", 
      contentType: "APPLICATION_JSON", 
      url: "http://172.20.0.100/json-please", wrapAsMultipart: false)

    print "Status: ${response.status}"
    print "Content: ${response.content}"
  }
  
  stage("Chage response.content to json") {
    content = readJSON(text: response.content)

    print content
  }
}