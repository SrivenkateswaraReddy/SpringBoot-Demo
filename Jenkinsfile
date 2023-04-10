pipeline {
  agent any
  stages {
    stage('Maven-Build') {
      steps {
        readYaml(file: 'jenkis.yml', maxAliasesForCollections: 2, text: 'Reading from YML')
      }
    }

  }
  environment {
    Java = '00'
  }
}