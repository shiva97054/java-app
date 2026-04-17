pipeline {
  agent any

  stages {
    stage('Build') {
      steps {
        sh 'mvn clean package'
      }
    }

    stage('Docker Build') {
      steps {
        sh 'docker build -t yourdockerhub/java-app:v1 .'
      }
    }

    stage('Push Image') {
      steps {
        sh 'docker push yourdockerhub/java-app:v1'
      }
    }

    stage('Deploy') {
      steps {
        sh 'kubectl apply -f deployment.yaml'
      }
    }
  }
}
