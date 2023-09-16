package package1;

public class Shape {

    private double sumOfAllAreas;

    public TotalArea createShape(String form, int len) {
        if (form == null || form.isEmpty() || len <= 0) {
            throw new IllegalArgumentException("Not allowed parameters [" + form + "] and [" + len + "].");
        }
        switch (form) {
            case "Tri":
                Triangle tri = new Triangle(len);
                sumOfAllAreas += tri.sumArea();
                return tri;
            case "Cir":
                Circle cir = new Circle(len);
                sumOfAllAreas += cir.sumArea();
                return cir;
            case "Squ":
                Square squ = new Square(len);
                sumOfAllAreas += squ.sumArea();
                return squ;
            default:
                return null;
        }
    }

    public double getSumOfAllAreas() {
        return sumOfAllAreas;
    }
}
