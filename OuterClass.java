public class OuterClass {
    // Nested interface
    public interface InnerInterface {
        void show();
    }

    public static void main(String[] args) {
        // Implementing the nested interface
        class MyClass implements InnerInterface {
            public void show() {
                System.out.println("Hello from nested interface!");
            }
        }

        // Creating an instance of MyClass
        MyClass myObj = new MyClass();
        myObj.show();
    }
}
