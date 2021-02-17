//Plugin pipeline utility step
node("node-worker") {
  def json

  stage("Checkout project") {
    checkout(
      [$class: 'GitSCM', branches: [[name: '*/main']], 
      doGenerateSubmoduleConfigurations: false, 
      extensions: [], submoduleCfg: [], 
      userRemoteConfigs: [[credentialsId: 'sb2', url: 'git@github.com:Neroroms/devops-sample.git']]])
  }

  stage("Read Json file") {
    json = readJSON(file: "jenkins-example/jenkinsfiles/json-example/example.json")

    print json
  }

  stage("Read json key and value") {
    json.each{ key, value ->
      print "Key: ${key}"
      print "Value: ${value}"
    }
  }

  stage("Get object3.listData") {
    def obj3ListData = json.object3.listData

    print obj3ListData

    print "data 1: ${obj3ListData[0]}"
    print "data 2: ${obj3ListData[1]}"
    print "data 3: ${obj3ListData[2]}"

  }
}