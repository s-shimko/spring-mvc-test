pipeline {
    agent {
      docker {
        image 'maven:3-alpine'
        args '-v /root/.m2:/root/.m2'
      }
    }
    stages {
      stage('SCM Checkout') {
        git 'https://github.com/s-shimko/spring-mvc-test'
      }
      stage('Build') {
      steps {
      sh 'mvn -B -DskipTests clean package'
       }
      }
     }
}