def configs = evaluate readTrusted('config.groovy')
def env = ''
def value = ''


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
    
      def versions =  configs.generatevalue
         ([
              value: "${value}",
              env: "${env}"
         ])
}
