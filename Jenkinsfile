pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                checkout scm
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

        stage('Build') {
            steps {
                script {
                    // Comandos para construir el proyecto (usando Maven en este caso)
                    bat 'mvn clean install'
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
    }
}
