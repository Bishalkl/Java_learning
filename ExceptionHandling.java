public class ExceptionHandling {


//    method
    static  void checkAge(int age) {
        if(age < 18) {
            throw new ArithmeticException("Access denied - you must be at least 18 years old.");
        } else {
            System.out.println("Access granted - Your are old enough!");
        }
    }
    public static void main(String[] args) {
        checkAge(20); // Set age to 15 (which is below 18...)
    }
}
