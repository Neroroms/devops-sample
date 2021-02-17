node("worker") {
  stage("This is stage") {
    print new Date()
  }

  stage("Multiple step in single stage") {
    sh "echo 'hello world' > text.txt"
    sh "cat text.txt"
  }
}