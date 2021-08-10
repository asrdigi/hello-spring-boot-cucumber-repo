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
        
        

        
         stage('Generate HTML report') {
        			cucumber buildStatus: 'UNSTABLE',
                		reportTitle: 'My report',
                		fileIncludePattern: '**/*.json',
               			trendsLimit: 10,
                		classifications: [
                    		[
                        		'key': 'Browser',
                        		'value': 'Firefox'
                    		]
                		]
              }

           }

        }

    }

}