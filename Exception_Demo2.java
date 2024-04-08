class Exception_Demo2 {
    public static void main(String[] args) {
     
        try {
        int numerator = 10;
        int denominator = 0;
        int result = numerator / denominator;
       
            System.out.println("Result: " + result);
        } 
        catch (ArithmeticException ai) {
    System.out.println("any number is not divisibl by zero");
 }
}
}