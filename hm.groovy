pipeline {
    agent any

    stages {
        stage('Текущее состояние жестких дисков') {
            steps {
                sh 'df -h'
            }
        }
    }
}
