node("node-worker") {
  stage("Checkout project") {
    checkout(
      [$class: 'GitSCM', branches: [[name: '*/main']], 
      doGenerateSubmoduleConfigurations: false, 
      extensions: [], submoduleCfg: [], 
      userRemoteConfigs: [[credentialsId: 'sb2', url: 'git@github.com:Neroroms/devops-sample.git']]])
  }

  stage("Read Json file") {
    def json = readJSON(file: "json-example/example.json")

    print json
  }
}