pipeline{
  //agent  {dockerfile true}
  agent any

  environment{
    DOCKERHUB_CREDENTIALS = credentials('id-dockerhub')
    //SONAR_TOKEN = credentials('id-sonarcloud')
  }

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

  stage('SonarQube analysis') {
    steps{
      dir("/var/lib/jenkins/workspace/tingeso-BackEnd/TingesoEntrega2"){
        withSonarQubeEnv('sonarcloud') { // Will pick the global server connection you have configured
          sh 'chmod +x ./gradlew'
          sh './gradlew sonarqube'
        }
      }
    }
  }

    stage('Docker Build'){
      steps{
        dir("/var/lib/jenkins/workspace/tingeso-BackEnd/TingesoEntrega2"){
        // sudo usermod -a -G docker jenkins
        // reboot
        sh 'docker build -t lnkyn/tingesoback:latest .'
        } 
      }
    }

    stage('Login'){
      steps{
        sh 'echo $DOCKERHUB_CREDENTIALS_PSW | docker login -u $DOCKERHUB_CREDENTIALS_USR --password-stdin'
      }
    }

    stage('Docker Hub'){
      steps{
        dir("/var/lib/jenkins/workspace/tingeso-BackEnd/TingesoEntrega2"){
          sh 'docker push lnkyn/tingesoback:latest'
        }
        echo 'Docker hub stage' 
      }
    }
  }
}
