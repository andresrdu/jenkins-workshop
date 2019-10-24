
node{
    withEnv(["ENV_CLIENTID=1234-123-123"]){
        stage("init"){
            echo "${ENV_CLIENTID}"
        }
    }

    stage("checkout"){
        println 'TODO'
    }
}