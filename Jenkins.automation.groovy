pipeline {
    agent any


    stages {
        stage("Print Details"){
            steps {
                   echo "${env.BUILD_URL}"
                    echo "${env.JENKINS_HOME}"
                    // Run Maven on a Unix agent.
            }
            
        }
         stage("Execute Python"){
            steps {
				  echo "Workspace location is : "+"${env.WORKSPACE}"
                   sh """
				   python3 test1.py
				   python3 test1.py
				   python3 test1.py
				   """
				   sleep 30
        }
    }
}
}
