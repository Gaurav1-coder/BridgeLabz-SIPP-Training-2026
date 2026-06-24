abstract class Shape {
    abstract double area();
    abstract double perimeter();
}

class Circle extends Shape {
    private final double radius;
    Circle(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    double area() {
        return 3.14 * radius * radius;
    }
    double perimeter() {
        return 2 * 3.14 * radius;
    }
}
class Rectangle extends Shape {

    double length;
    double width;
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    double area() {
        return length * width;
    }
    double perimeter() {
        return 2 * (length + width);
    }
}
class Triangle extends Shape {
    double base;
    double height;
    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    double area() {
        return 0.5 * base * height;
    }
    double perimeter() {
        return base * 3;   // simple equilateral triangle
    }
}

public class ShapeHierarchy {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5);
        shapes[1] = new Rectangle(10,5);
        shapes[2] = new Triangle(4,6);
        for(Shape s : shapes) {
            System.out.println(
                    "Shape: "
                    + s.getClass().getSimpleName()
            );
            System.out.println(
                    "Area: "
                    + s.area()
            );
            System.out.println(
                    "Perimeter: "
                    + s.perimeter()
            );
            System.out.println("----------------");
        }
        Circle c = new Circle(10);
        System.out.println(
                "Radius: "
                + c.getRadius()
        );
    }
}