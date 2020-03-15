node{
  stage('SCM Checkout') {
    git 'https://github.com/s-shimko/spring-mvc-test'
  }
  stage('Compile-Package'){
    sh 'ls -la'
    sh 'apt-get update && apt-get install -y maven'
    sh 'mvn package'
  }
}