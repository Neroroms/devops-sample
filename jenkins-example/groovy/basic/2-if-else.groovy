String helloWorld = "hello-world"

// Boolean isTrue = true
// Boolean isTrue = "true"
// def isTrue = "true"
// def isTrue = true
// def isTrue = "false"
// def isTrue = false

if (helloWorld == "hello-world") {
  println helloWorld
}
else {
  println "Not hello-world"
}

if (isTrue == "true") {
  println "isTrue is string"
}
else if (isTrue == true) {
  println "isTrue is true"
}
else {
  println "then what???"
}