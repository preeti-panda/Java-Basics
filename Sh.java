class Sh{
    protected String color;
    public Shape(String color) {
        this.color = color;
    }
    public double calculateArea() {
        return 0.0;
    }
    public void displayInfo() {
        System.out.println("Shape color: " + color);
    }
}
class Circle extends Shape {
    private double radius;
    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
class Rectangle extends Shape {
    private double length;
    private double width;
    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }
    public double calculateArea() {
        return length * width;
    }
}
public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle("Red", 5.0);
        circle.displayInfo();
        System.out.println("Circle area: " + circle.calculateArea());
        Rectangle rectangle = new Rectangle("Blue", 4.0, 6.0);
        rectangle.displayInfo();
        System.out.println("Rectangle area: " + rectangle.calculateArea());
    }
}
