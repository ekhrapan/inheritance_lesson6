package academy.belhard.example3.example2;

public class FigurableApp {

    public static void main(String[] args) {
        Figurable rightTriangle = new RightTriangle(3, 4);
        System.out.println(rightTriangle);

        Figurable rectangle = new Rectangle(3, 4);
        System.out.println(rectangle);
    }
}
