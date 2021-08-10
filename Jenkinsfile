pipeline{

    agent any

    stages {

        stage('Clean and Compile') { 
            steps {

                bat "mvn clean compile"
            }
        }
       
		stage('Junit5 Test') { 
            steps {

                bat "mvn verify"
            }
        }
        
        stage('Maven Build') { 
            steps {
                bat "mvn install"
            }
        }

        stage ('Cucumber Reports') {

            steps {
                cucumber buildStatus: "UNSTABLE",
                    fileIncludePattern: "**/cucumber.json",
                    jsonReportDirectory: 'target'

            }

        }

    }

}