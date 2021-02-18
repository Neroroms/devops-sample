node("ubuntu-worker") {
  stage("Print param") {
    print "string param: ${STRING_PARAM}"
    print "boolean param: ${BOOLEAN_PARAM}"
    print "multi line param: ${MULTI_LINE_PARAM}"
    print "choice param: ${CHOICE_PARAM}"
  }

  stage("Check param type") {
    print "string param: ${STRING_PARAM.getClass()}"
    print "boolean param: ${BOOLEAN_PARAM.getClass()}"
    print "multi line param: ${MULTI_LINE_PARAM.getClass()}"
    print "choice param: ${CHOICE_PARAM.getClass()}"
  }

  stage("Multi line param separate") {
    def multiParam = MULTI_LINE_PARAM.split("\\r?\\n")

    multiParam.each{ data ->
      print data
    }
  }

  stage("Show env") {
    sh "env"
  }

  stage("Before add env") {
    try {
      sh "env | grep madness"
    }
    catch (err) {
      print err
    }
  }

  stage("Add env") {
    env.madness = "This is SPATA!!!!!!!!!!!!!!!!!"
  }

  stage("Print env") {
    sh "env | grep madness"
  }
}