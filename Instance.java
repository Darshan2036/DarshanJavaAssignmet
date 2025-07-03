public class Instance {
    public static void main(String[] args) {
        Integer num = 100;
        boolean result;

        result = num instanceof Integer;
        System.out.println("Is num an instance of Integer? " + result);
    }
}
