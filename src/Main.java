public class Main {
    public static void main(String[] args) {
        Square s1 = new Square(5);
        System.out.println("Square area is " + s1.getArea() + " m2.");

        System.out.println("Circle area is " + (new Circle(3)).getArea() + " m2.");

        System.out.println("Triangle area is " + (new Triangle(4)).getArea() + " m2.");
    }
}