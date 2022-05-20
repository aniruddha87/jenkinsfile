def env = 'dev'
def value = '12'

node()
{
         def line = ''
    sh """
   
   while read line; do
    # reading each line
    echo $line
    echo "the vaalue is : \"$value\" "
  done
    """
}
