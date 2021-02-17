node("worker-1") {
  checkout([$class: 'GitSCM', branches: [[name: '*/main']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[credentialsId: 'sb2', url: 'git@github.com:Neroroms/devops-sample.git']]])
}

node("dind") {
  sh "ls"
}