pipeline {
    agent any


    stages {
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
                   sh 
				   ```
				   python3 test1.py
				   python3 test1.py
				   python3 test1.py
				   ```
				   
            }
            
        }
    }
}
