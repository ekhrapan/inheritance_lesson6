package academy.belhard.example3.impl;

import academy.belhard.example3.api.AreaCalculator;
import academy.belhard.example3.api.PerimeterCalculator;

public class Rectangle implements AreaCalculator, PerimeterCalculator {
    private double dimension1;
    private double dimension2;

    public Rectangle(int dimension1, int dimension2) {
        this.dimension1 = dimension1;
        this.dimension2 = dimension2;
    }

    @Override
    public double area() {
        return dimension1 * dimension2;
    }

    @Override
    public double perimeter() {
        return (dimension1 + dimension2) * 2;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "dimension1=" + dimension1 +
                ", dimension2=" + dimension2 +
                ", perimeter=" + perimeter() +
                ", area=" + area() +
                '}';
    }

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
