package academy.belhard.example2;

public class FiguresApp {

    public static void main(String[] args) {
        Figure rightTriangle = new RightTriangle(3, 4);
        System.out.println(rightTriangle);

        Figure rectangle = new Rectangle(3, 4);
        System.out.println(rectangle);
    }
}
