package academy.belhard.example3.example2;

public class RightTriangle implements Figurable {
    private double dimension1;
    private double dimension2;

    public RightTriangle(int dimension1, int dimension2) {
        this.dimension1 = dimension1;
        this.dimension2 = dimension2;
    }

    @Override
    public double area() {
        return dimension1 * dimension2 / 2;
    }

    @Override
    public double perimeter() {
        return dimension1 + dimension2 + hypothesis();
    }

    private double hypothesis() {
        return Math.sqrt(dimension1 * dimension1 + dimension2 * dimension2);
    }

    @Override
    public String toString() {
        return "RightTriangle{" +
                "dimension1=" + dimension1 +
                ", dimension2=" + dimension2 +
                ", hypothesis=" + hypothesis() +
                ", perimeter=" + perimeter() +
                ", area=" + area() +
                '}';
    }
}
