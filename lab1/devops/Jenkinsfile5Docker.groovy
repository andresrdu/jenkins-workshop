
node{
    stage("init"){
        sh "ls -lta"
        //cleanWs()
    }
    stage("checkout"){
        withCredentials([string(credentialsId:"andresrdu-token1",variable:'token1')]){
            echo "andresrdu-token1 variable ${token1}"

            tokentmp = token1.split('\\|')
            tok11 = tokentmp[0]
            tok12 = tokentmp[1]

            echo "andresrdu-token1 array ${tok11} ---- ${tok12}"
            sh "echo 'andresrdu-token1 ${tok11} ---- ${tok12}' >> token1.txt"

            sh "ls -lart;pwd;cat token1.txt"
            
        }
        withCredentials([string(credentialsId:"andresrdu-token2",variable:'token2')]){
            echo "andresrdu-token2 variable ${token2}"

            tokentmp2 = token2.split('\\|')
            tok21 = tokentmp2[0]
            tok22 = tokentmp2[1]

            echo "andresrdu-token2 array ${tok21} ---- ${tok22}"
            sh "echo 'andresrdu-token2 ${tok21} ---- ${tok22}' >> token2.txt"

            sh "ls -lart;pwd;cat token2.txt"
            
        }
    }
// docker run -it <name image>:tag terraform -version
//terraform init
//terraform apply
//terraform -version

    // stage("deploy"){
    //     docker.image("hashicorp/terraform:0.12.12").withRun("-version"){
    //         container -> sh "docker logs ${container.id}"
    //     }
    // }
}


/*

docker pull hashicorp/terraform:0.12.12

*/