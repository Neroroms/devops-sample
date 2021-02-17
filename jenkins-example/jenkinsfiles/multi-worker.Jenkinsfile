node("worker-1") {
  checkout([$class: 'GitSCM', branches: [[name: '*/main']], 
    doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], 
    userRemoteConfigs: [[url: 'https://github.com/Neroroms/print-log-app.git']]])
}

node("dind") {
  sh "ls"
}