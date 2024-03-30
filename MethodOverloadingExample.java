public class MethodOverloadingExample {
  public static void add(int a, int b) {
    System.out.println("Adding two integers: " + (a + b));
  }
  public static void add(double a, double b) {
    System.out.println("Adding two doubles: " + (a + b));
  }
  public static void main(String[] args) {
    add(5, 3); 
    add(3.14, 2.7); 
  }
}
