package package1;

public class Circle implements Area, TotalArea {
    private int radius;

    public Circle(int radius)  {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return (radius * radius * Math.PI);
    }

    @Override
    public double sumArea() {
        return getArea();
    }
}
