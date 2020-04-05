pipeline {
stages {
    stage('Install'){
      sh ''
  }
    agent {
      docker {
        image 'maven:3-alpine'
        args '-v /root/.m2:/root/.m2'
      }
    }

      stage('Build') {
      steps {
      sh 'mvn -B -DskipTests clean package jetty:run'
       }
      }
     }
}