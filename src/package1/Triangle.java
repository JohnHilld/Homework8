package package1;

public class Triangle implements Area, TotalArea {
    private int side;

    public Triangle(int sideLength)  {
        side = sideLength;
    }

    @Override
    public double getArea() {
        return (side * side * Math.sqrt(3)/4);
    }

    @Override
    public double sumArea() {
        return getArea();
    }
}
