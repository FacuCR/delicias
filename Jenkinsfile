pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build') {
            steps {
                script {
                    // Comandos para construir el proyecto (usando Maven en este caso)
                    bat 'mvn clean install'
                }
            }
        }

        stage('Test') {
            steps {
                script {
                    // Comandos para ejecutar pruebas unitarias (usando Maven en este caso)
                    bat 'mvn test'
                }
            }
        }

//         stage('Deploy') {
//             steps {
//                 script {
//                     bat "mvn jar:jar deploy:deploy"
//                 }
//             }
//         }

        stage('SonarQube Analysis') {
            steps {
                script {
                    // Comandos para ejecutar análisis de SonarQube (usando Maven en este caso)
                    bat 'mvn sonar:sonar'
                }
            }
        }
    }
}
