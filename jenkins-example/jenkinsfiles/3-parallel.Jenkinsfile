node("ubuntu-worker") {
  stage("Print sequence") {
    parallel(
      "Print 1-10": {
        for (number in [1,2,3,4,5,6,7,8,9,10]) {
          print number
        }
      },

      "Print 10 abc": {
        for(i = 0 ; i < 10 ; i++) {
          print "abc"
        }
      }
    )
  }
}