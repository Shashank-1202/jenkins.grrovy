pipeline {
    stages {
        stage ('clone my repo') {
            steps {
                git 'https://github.com/Shashank-1202/Terraform.git'
            }
        stage ('Build') {
            steps {
                sh 'echo build stage run'
            }
        }
        stage ('Test') {
            steps { 
                sh 'echo test stage run'
            }
        }
        stage ('Deploy') {
            steps {
                sh 'echo deploy stage run'
            }
        }
        }
    }
}
