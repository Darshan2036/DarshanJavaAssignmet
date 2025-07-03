class Mathop {
    int add(int a, int b) { return a + b; }
    double add(double a, double b) { return a + b; } // Overloaded

    public static void main(String[] args) { 
        Mathop calc = new Mathop();
        System.out.println("Adding two integers: " + calc.add(7, 3));
        System.out.println("Adding two doubles: " + calc.add(4.5, 2.1));
    }
}
