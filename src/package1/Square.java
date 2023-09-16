package package1;

public class Square implements Area, TotalArea {
    private int side;

    public Square(int sideLength)  {
        side = sideLength;
    }

    @Override
    public double getArea() {
        return (side * side);
    }

    @Override
    public double sumArea() {
        return getArea();
    }
}
