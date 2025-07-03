public class StringFunction {
    public static void main(String[] args) {
        String str = "Welcome to Java";

        System.out.println("Length: " + str.length());
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());
        System.out.println("Substring (0,7): " + str.substring(0, 7));
        System.out.println("Replace 'Java' with 'Programming': " + str.replace("Java", "Programming"));
        System.out.println("Contains 'come': " + str.contains("come"));
        System.out.println("Char at 4: " + str.charAt(4));
        System.out.println("Index of 'to': " + str.indexOf("to"));
    }
}
