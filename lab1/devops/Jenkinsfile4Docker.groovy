
node{
    stage("init"){
        sh "ls -lta"
    }
    stage("checkout"){
        withCredentials([string(credentialsId:"andresrdu-token",variable:'token1')]){
            echo "${token1}"

            tokentmp = token1.split('\\|')
            tok1 = tokentmp[0]
            tok2 = tokentmp[1]
            tok3 = tokentmp[2]

            echo "${tok1} ---- ${tok2} ---- ${tok3}"
            sh " cat ${tok1} ---- ${tok2} ---- ${tok3} > archivo.txt"

            sh "ls -lart;pwd;cat archivo.txt"
            
        }
    }
// docker run -it <name image>:tag terraform -version
//terraform init
//terraform apply
//terraform -version
/*
    stage("deploy"){
        docker.image("hashicorp/terraform:0.12.12").withRun("-version"){
            container -> sh "docker logs ${container.id}"
        }
    }
}


/*

docker pull hashicorp/terraform:0.12.12

*/