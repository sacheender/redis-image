pipeline {
    agent any


    stages {
        stage('Build') {
            steps {
                // Get some code from a GitHub repository
                git 'https://github.com/sacheender/redis-image.git'

             
               // sh "mvn -Dmaven.test.failure.ignore=true clean package"

                // To run Maven on a Windows agent, use
                // bat "mvn -Dmaven.test.failure.ignore=true clean package"
            }
        }
        stage("Print Details"){
            steps {
                   echo "${env.BUILD_url}"
                    echo "${env.JENKINS_HOME}"
                    // Run Maven on a Unix agent.
            }
            
        }
         stage("Execute Pythong"){
            steps {
                   echo "Workspace location is : "+"${env.WORKSPACE}"
                   sh 'python3 test1.py'
                    sh 'python3 test1.py'
                     sh 'python3 test1.py'
                      sh 'python3 test1.py'
                 
            }
            
        }
    }
}
