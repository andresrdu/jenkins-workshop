
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
        }
    }
}

/*
password2019|andresrdu@hotmail.com|12345

*/