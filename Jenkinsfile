pipeline {
  agent any
  stages {
    stage('Maven-Build') {
      steps {
        readYaml(file: 'mycoolapp/jenkins.yml', maxAliasesForCollections: 2, text: 'Reading from YML')
      }
    }

  }
  environment {
    Java = '00'
  }
}
