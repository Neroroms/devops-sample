node("worker-1") {
  stage("checkout with worker 1") {
    checkout([$class: 'GitSCM', branches: [[name: '*/main']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[credentialsId: 'sb2', url: 'git@github.com:Neroroms/devops-sample.git']]])
  }

  stage("Stash file") {
    stash(includes: '*', name: 'project')
  }

  cleanWs()
}

node("dind") {
  sh "ls"

  unstash('project')

  sh "ls"

  cleanWs()
}