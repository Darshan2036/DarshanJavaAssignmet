public class factorialDemo{
public static void main(String[] args) {
        System.out.println("\n--- Factorial (Iterative) ---");
        int result = factorial(5);
        System.out.println("Factorial of 5 is: " + result);
    }
    
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }
}
