#!/usr/bin/env groovy

pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                sh 'make'
            }
        }
        stage('Deploy') {
            steps {
                sh 'mvn clean package -Dmaven.test.skip=true docker:build -DpushImage'
            }
        }
    }
}