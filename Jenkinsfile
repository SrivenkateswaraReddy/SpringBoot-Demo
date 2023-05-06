pipeline {
    agent any

    stages {
        stage('Git checkout scm') {
            steps {
                git branch: 'main', url: 'https://github.com/SrivenkateswaraReddy/SpringBoot-Demo.git'
            }
        }
        stage('Build') {
            steps {
                sh 'mvn clean install'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }
        stage('Deploy') {
            steps {
                sh 'mvn deploy'
            }
        }
    }
}
