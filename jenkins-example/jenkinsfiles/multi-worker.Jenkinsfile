node("worker-1") {
  checkout([$class: 'GitSCM', branches: [[name: '*/master']], 
    doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], 
    userRemoteConfigs: [[url: 'https://github.com/Neroroms/print-log-app.git']]])
}

node("dind") {
  sh "ls"
}