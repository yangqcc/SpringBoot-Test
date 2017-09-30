#!/usr/bin/env groovy

pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                sh 'docker login -u 那再也回去的曾经 -p 08163442666yqc registry.cn-hangzhou.aliyuncs.com'
                sh 'mvn clean package -Dmaven.test.skip=true docker:build'
                sh 'docker tag yangqc/springboot-test registry.cn-hangzhou.aliyuncs.com/yangqc_test/test'
                sh 'docker push registry.cn-hangzhou.aliyuncs.com/yangqc_test/test:1.0'
            }
        }
    }
}x