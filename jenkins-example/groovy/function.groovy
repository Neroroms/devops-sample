def checkVariableType(def unknown) {
  println unknown.getClass()
}

def checkVariableType(def unknown, Boolean printValue) {
  println unknown.getClass()

  if (printValue == true) {
    println unknown
  }
}

def checkVariableType(def unknown, String justString) {
  println unknown.getClass()

  if (justString.length() > 0) {
    println justString
  }
}

checkVariableType("hello world")
checkVariableType("hello world", true)
checkVariableType("hello world", "I'm string")