public class Calculator {

  public static void main(String[] args) {
    int num1, num2, sum, difference, product;

    System.out.print("Enter first number: ");
    Scanner scanner = new Scanner(System.in);
    num1 = scanner.nextInt();

    System.out.print("Enter second number: ");
    num2 = scanner.nextInt();

    sum = num1 + num2;
    difference = num1 - num2;
    product = num1 * num2;

    System.out.println("Sum: " + sum);
    System.out.println("Difference: " + difference);
    System.out.println("Product: "  + product);
  }
}
