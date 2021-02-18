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
  
}