package package1;

public class Main {
    public static void main(String[] args) {
        Shape sh = new Shape();

        Triangle t1 = (Triangle) sh.createShape("Tri", 4);
        System.out.println("Triangle area is " + t1.getArea() + " m².");

        Square s1 = (Square) sh.createShape("Squ", 5);
        System.out.println("Square area is " + s1.getArea() + " m².");

        Circle c1 = (Circle) sh.createShape("Cir", 3);
        System.out.println("Circle area is " + c1.getArea() + " m².");

        System.out.println("Total area of all shapes is " + sh.getSumOfAllAreas() + " m².");

        System.out.println("-------------------------------------------------");
        Triangle t2 = (Triangle) sh.createShape("Tri", 7);
        System.out.println("Triangle area is " + t2.getArea() + " m².");

        System.out.println("Total area of all shapes is " + sh.getSumOfAllAreas() + " m².");

    }
}