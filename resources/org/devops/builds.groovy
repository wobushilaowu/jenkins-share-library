package org.devops

def Build(buildTools,buildType){
    switch(buildType) {
        case "maven":
            sh "${buildTools}["maven"]/bin/mvn clean package"
            break
        case "golang": 
            sh "${buildTools}["golang"]/bin/go build main.go"
            break
        default:
            println("buildtype ==>[maven|golang]")
            break
    }
}