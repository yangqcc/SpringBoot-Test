#!/usr/bin/env groovy

pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                sh 'docker login -u 那再也回去的曾经 -p 08163442666yqc registry.cn-hangzhou.aliyuncs.com'
                sh 'mvn clean package -Dmaven.test.skip=true docker:build'
                sh 'docker tag yangqc/springboot-test registry.cn-hangzhou.aliyuncs.com/yangqc_test/test:1.0'
                sh 'docker push registry.cn-hangzhou.aliyuncs.com/yangqc_test/test:1.0'
            }
        }
    }
    post {
            always {
                echo 'This will always run'
            }
            success {
                echo 'This will run only if successful'
            }
            failure {
                echo 'This will run only if failed'
            }
            unstable {
                echo 'This will run only if the run was marked as unstable'
            }
            changed {
                echo 'This will run only if the state of the Pipeline has changed'
                echo 'For example, if the Pipeline was previously failing but is now successful'
            }
        }
}