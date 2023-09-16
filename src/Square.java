public class Square implements Area {
    private int side;

    public Square(int sideLength)  {
        side = sideLength;
    }

    public double getArea() {
        return (side * side);
    }
}
