public class recursiveFactorialDemo{
public static void main(String[] args) {
        System.out.println("\n--- Factorial (Recursive) ---");
        int result = recursiveFactorial(5);
        System.out.println("Factorial of 5 (recursive) is: " + result);
    }
    
    public static int recursiveFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1; // Base case
        } else {
            return n * recursiveFactorial(n - 1); // Recursive
        }
    }
}
