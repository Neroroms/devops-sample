def jobs = [:]
def printNumber = [1,2,3,4,5,6,7,8,9,10]

node("ubuntu-worker") {
  stage("Prepare paralle") {
    printNumber.each{ number -> 
      jobs[number.toString()] = {
        print number
      }
    }
  }

  stage("Run parallel") {
    parallel(jobs)
  }
}