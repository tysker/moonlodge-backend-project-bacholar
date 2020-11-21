pipeline {
    agent {
        docker {
            image 'maven:3-alpine'
            args '-v /root/.m2:/root/.m2'
        }
    }
    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                sh 'mvn -B -DskipTests clean package'
            }
        }
        stage('Unit Test') {
            steps {
                echo 'Unit Testing..'
                sh 'mvn clean test -P dev'
            }
            post {
                always {
                    junit '/moonlodge_backend/target/surefire-reports/*.xml'
                }
            }
        }
    }
}
