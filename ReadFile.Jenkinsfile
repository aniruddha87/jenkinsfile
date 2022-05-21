def env = 'dev'
def value = '12'
def version = readTrusted 'config.groovy'

node()
{
       
    checkout scm
    checkout([$class: 'GitSCM', branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[credentialsId: 'github', url: 'https://github.com/aniruddha87/jenkinsfile.git']]])
    sh '''
         cat company.txt
         cat company.txt | while read line; do
                  # reading each line
                  echo $line
         done
         
         echo "the vaalue is : "${value}" "
         echo "the vaalue is : ${env} "
    '''
    
    version = config.generatevalu
         ([
              value: "${value}"
              env_value: "${env}"
         ])
}
