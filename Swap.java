public class Swap {
  public static void swap(int a, int b) {
    int temp = a;
    a = b;
    b = temp;
  }
  public static void main(String[] args) {
    int x = 10;
    int y = 20;
    System.out.println("Before swapping: x = " + x + ", y = " + y);
    swap(x, y);
    System.out.println("After swapping: x = " + x + ", y = " + y);
  }
}
