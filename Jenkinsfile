pipeline{
  agent any
  
  stages{
    
    stage('Gradle build'){
      steps{
        dir("/var/lib/jenkins/workspace/tingeso-BackEnd/TingesoEntrega2"){
          sh 'chmod +x ./gradlew'
          sh './gradlew build'
        }
      }
    }

    stage('JUnit'){
      steps{
        catchError(buildResult: 'SUCCESS', stageResult: 'FAILURE'){
          dir("/var/lib/jenkins/workspace/tingeso-BackEnd/TingesoEntrega2"){
            sh './gradlew test'
          }
        }
      }  
    }

    stage('Docker Build'){
      steps{
        //dir("/var/lib/jenkins/workspace/backendTingeso/TingesoEntrega2"){
        //  sh 'sudo usermod -s -a -G docker $USER'
        //  sh 'docker build . -t grupo5back'
        echo 'Docker Build'
        } 
      }

    stage('Login'){
      steps{
        //sh 'echo $DOCKERHUB_CREDENTIALS_PSW | docker login -u $DOCKERHUB_CREDENTIALS_USR --password-stdin'
        echo 'Login'
      }
    }

    stage('Docker Hub'){
      steps{
        //dir("/var/lib/jenkins/workspace/backendTingeso/TingesoEntrega2"){
        //  sh 'docker push grupo5back'
        //}
        echo 'Docker hub stage' 
      }
    }
  }
}
