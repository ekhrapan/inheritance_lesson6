package academy.belhard.example2;

public class RightTriangle extends Figure {
    public RightTriangle(int dimension1, int dimension2) {
        super(dimension1, dimension2);
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
