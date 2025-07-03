public class conditionalOperator{
public static void main(String[] args) {
        System.out.println("\n--- Conditional (Ternary) Operator ---");
        int daysInFebruary = 29;
        String result;
        // ternary operator
        result = (daysInFebruary == 28) ? "Not a leap year" : "Leap year";
        System.out.println(result);
    }
}
