package academy.belhard.example3;

import academy.belhard.example3.api.AreaCalculator;
import academy.belhard.example3.api.PerimeterCalculator;
import academy.belhard.example3.impl.Rectangle;
import academy.belhard.example3.impl.RightTriangle;

public class FigurableApp {

    public static void main(String[] args) {
        AreaCalculator rightTriangle = new RightTriangle(3, 4);
        System.out.println("Площадь = " + rightTriangle.area());

        PerimeterCalculator rectangle = new Rectangle(3, 4);
        System.out.println("Периметр = " + rectangle.perimeter());
    }
}
