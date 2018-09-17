pipeline{
    agent any
    stages{
        stage('Build'){
            steps{
                bat 'mvn clean package' // for windows
                // sh 'mvn clean package' // for linux machines
                bat "docker build . -t tomcatwebapp:${env.BUILD_ID}"
                // . looks for dockerfile in the current location
                // -t tagged as tomcatwebapp build number - auto increment jenkins build number
            }
        }
    }
}