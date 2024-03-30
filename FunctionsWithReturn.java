public class FunctionsWithReturn {
  public static void main(String[] args) {
    int num1 = 10;
    int num2 = 20;
    int sum = add(num1, num2);
    int difference = subtract(num2, num1);
    System.out.println("Sum of " + num1 + " and " + num2 + " is: " + sum);
    System.out.println("Difference of " + num2 + " and " + num1 + " is: " + difference);
  }
  public static int add(int a, int b) {
    int result = a + b;
    return result;
  }
  public static int subtract(int a, int b) {
    int result = a - b;
    return result;
  }
}
