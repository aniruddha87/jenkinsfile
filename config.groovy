def generatevalu()
{
    return [
      def 'value': '14',
      def 'env': 'vit'
     ]
}
return [
  generatevalu: this&generatevalu
]
