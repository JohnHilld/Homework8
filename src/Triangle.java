public class Triangle implements Area {
    private int side;

    public Triangle(int sideLength)  {
        side = sideLength;
    }

    public double getArea() {
        return (side * side * 0.4330127);
    }
}
