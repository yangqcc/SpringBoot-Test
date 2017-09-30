#!/usr/bin/env groovy

pipeline {
    agent any

    stages {
        stage('Deploy') {
            steps {
                sh 'docker login -u 那再也回去的曾经 -p 08163442666yqc registry.cn-hangzhou.aliyuncs.com'
                sh 'mvn clean package -Dmaven.test.skip=true docker:build -DpushImage'
            }
        }
    }
}