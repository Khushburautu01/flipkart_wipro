pipeline {
 
    agent any
 
    tools {
        jdk 'JDK21'
        maven 'Maven3'
    }
 
    stages {
 
        stage('Git Checkout') {
    steps {
        git branch: 'main',
            url: 'https://github.com/Khushburautu01/flipkart_wipro.git'
    }
}
 
        stage('Clean Project') {
            steps {
                bat 'mvn clean'
            }
        }
 
        stage('Run Tests') {
            steps {
                bat 'mvn test'
            }
        }
<<<<<<< HEAD
        stage('Publish Cucumber Report') {
=======
     stage('Publish Cucumber Report') {
>>>>>>> 52a19a72003a886e2e9dd21ae534e95e7f187ac9
    steps {
        publishHTML([
            allowMissing: false,
            alwaysLinkToLastBuild: true,
            keepAll: true,
            reportDir: 'target/cucumber-reports',
            reportFiles: 'cucumber.html',
            reportName: 'Flipkart Cucumber Report'
        ])
    }
}
 
    }
 
   post {

    success {
        echo 'Pipeline Executed Successfully'
    }

    failure {
        echo 'Pipeline Failed'
    }
}
}