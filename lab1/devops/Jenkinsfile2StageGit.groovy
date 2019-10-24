
node{
    withEnv(["ENV_CLIENTID=1234-123-123"]){
        stage("init"){
            echo "${ENV_CLIENTID}"
            sh 'printenv'
        }
    }

    stage("checkout"){
        println '=======TODO========'
        
        git(
            branch : "master",
            credentialsId: "andresrdu-github",
            url:"https://github.com/andresrdu/aks-rbac-example"
        )

        sh "ls -lta"


    }
}