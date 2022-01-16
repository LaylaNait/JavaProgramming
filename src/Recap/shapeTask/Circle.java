package Recap.shapeTask;

public class Circle extends Shape {
    private double radius;
    public static double pi = 3.14;


    public Circle(double radius) {
        super("Circle");
        setRadius(radius);
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return radius* radius* pi;
    }

    @Override
    public double perimeter() {
        return 2*radius*pi;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }

    public Circle(String name, double radius) {
        super(name);



        }
}