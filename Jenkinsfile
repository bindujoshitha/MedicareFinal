pipeline {
    agent any

    stages {
        stage('Git') {
            steps {
				git "https://github.com/bindujoshitha/medicare.git"
            }         
            }
        stage( 'Build') {
            steps {
				bat ".\mvnw clean compile"
            }
			
			}
		stage('Test') {
            steps {
				bat ".\mvnw test"
            }
            post {
                always{
                    junit '**/target/surefire-reports/TEST-*.xml'
                    archiveArtifacts 'target/*.jar'
                }
            }
        }
    }
}
