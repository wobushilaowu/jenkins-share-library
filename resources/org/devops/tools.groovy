package org.devops

def Getcode(branch,gitHttpURL,credentialsId) {
    checkout([
        $class: 'GITSCM',branchees: [[name: "${branch}"]],
        extensions: [],
        userRemoteConfigs: [[
            credentialsId: "${credentialsId}",
            url: "${gitHttpURL}"
        ]]
    ])
}