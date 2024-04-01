class Shapee {
  public void area() {
    System.out.println("Area calculation for generic shape");
  }
}
class Rectangle extends Shape {
  int length;
  int breadth;

  public Rectangle(int length, int breadth) {
    this.length = length;
    this.breadth = breadth;
  }
  public void area() {
    System.out.println("Rectangle area: " + length * length);
  }
}
public class Main {
  public static void main(String[] args) {
    Shape shape = new Rectangle(5, 4);
    shape.area(); 
  }
}
