class Parent {
    void displayParent() {
        System.out.println("This is the parent class");
    }
}
class Child extends Parent {
    void displayChild() {
        System.out.println("This is the child class");
    }
}
public class Main {
    public static void main(String[] args) {
        Child childObj = new Child();
        childObj.displayParent();
        childObj.displayChild();
    }
}
