def env = 'dev'
def value = '12'

node()
{
         def line = ''
         checkout scm
         checkout([$class: 'GitSCM', branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[credentialsId: 'github', url: 'https://github.com/aniruddha87/jenkinsfile.git']]])
    sh """
   cat company.txt
   cat company.txt | while read line; do
    # reading each line
    echo $line
    echo "the vaalue is : \"$value\" "
  done
    """
}
