class FirstJavaCode
{

          public static void main(String[] args) {
    
    int num1 = 10;
    int num2 = 20 ;
                   
    Main obj = new Main();
    int result = obj.addNumbers(num1, num2);
    System.out.println("Sum is: " + result);
    }                   
    
  public int addNumbers(int a, int b) {
    int sum = a + b;
    return sum;
  }

}
