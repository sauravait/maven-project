pipeline{
    agent any
    stages{
        stage('Build'){
            steps{
                bat 'mvn clean package' // for windows
                // sh 'mvn clean package' // for linux machines
            }
        }
    }
}