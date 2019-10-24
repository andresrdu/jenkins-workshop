
node{
    withEnv(["ENV_CLIENTID=1234-123-123"]){
        stage("init"){
            echo "${ENV_CLIENTID}"
            sh 'printenv'
            cleanWs()
        }
    }

    stage("checkout"){
        println '=======TODO========'
        
        sh "mkdir source"
        dir("source") {
            git(
                branch : "master",
                credentialsId: "andresrdu-github",
                url:"https://github.com/andresrdu/aks-rbac-example"
            )
        }
        
        sh "pwd"
        sh "ls -lta && cd source && ls -lta"


    }
}