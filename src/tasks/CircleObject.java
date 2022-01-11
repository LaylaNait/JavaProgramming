package tasks;

public class CircleObject {
    public static void main(String[] args) {


        Circle circle1 = new Circle(2.3,3.14);
        System.out.println(circle1.getRadius());
        System.out.println(circle1.calcArea());
        System.out.println(circle1.calcPerimeter());


    }
}
