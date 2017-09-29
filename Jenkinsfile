#!/usr/bin/env groovy

def url = "https://git.zwy.com/cityos/subscription_center.git"
def credentialsId = "63512424-2a91-4116-8e14-6086af9d13a1"

pipeline {
    stage 'checkout'
    git url: url, credentialsId: credentialsId

    stage 'build and push image'
    sh "mvn clean package -Dmaven.test.skip=true docker:build -DpushImage"
}
