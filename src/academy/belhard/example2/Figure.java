package academy.belhard.example2;

public abstract class Figure {
    protected double dimension1;
    protected double dimension2;

    public Figure(int dimension1, int dimension2) {
        this.dimension1 = dimension1;
        this.dimension2 = dimension2;
    }

    public abstract double area();

    public abstract double perimeter();

    public double getDimension1() {
        return dimension1;
    }

    public void setDimension1(double dimension1) {
        this.dimension1 = dimension1;
    }

    public double getDimension2() {
        return dimension2;
    }

    public void setDimension2(double dimension2) {
        this.dimension2 = dimension2;
    }
}
