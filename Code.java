class Shape {
    void area() {
        System.out.println("Shape area");
    }
}

class Circle extends Shape {
    void area() {
        System.out.println("Circle area = π * r * r");
    }
}

class Rectangle extends Shape {
    void area() {
        System.out.println("Rectangle area = length * breadth");
    }
}

public class code {
    public static void main(String[] args) {
        Circle c = new Circle();
        Rectangle r = new Rectangle();
        c.area();
        r.area();
    }
}
