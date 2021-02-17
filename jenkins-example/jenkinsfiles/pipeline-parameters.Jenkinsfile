node("worker-1") {
  stage("checkout with worker 1") {
    checkout([$class: 'GitSCM', branches: [[name: GITHUB_BRANCH]], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[credentialsId: 'sb2', url: 'git@github.com:Neroroms/devops-sample.git']]])
  }

  stage("Stash file") {
    stash(includes: '**', name: 'project')
  }

  cleanWs()
}

node("dind") {
  stage("Unstash file") {
    unstash('project')
  }

  stage("Build docker images") {
    dir("jenkins-example/dockerfiles/ubuntu-worker/") {
      sh "docker build -f ubuntu-worker.Dockerfile -t test:latest ."
    }
  }

  cleanWs()
}