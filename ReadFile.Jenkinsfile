def env = 'dev'
def value = '12'

node()
{
         def line = ''
    sh """
   
   cat company.txt | while read line; do
    # reading each line
    echo $line
    echo "the vaalue is : \"$value\" "
  done
    """
}
