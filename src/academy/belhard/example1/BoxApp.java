package academy.belhard.example1;

public class BoxApp {

    public static void main(String[] args) {
        Box usualBox = new Box(3, 4, 5);
        System.out.println(usualBox);

        BoxWeight boxWeight = new BoxWeight(3, 4, 5, 100);
        System.out.println(boxWeight);

        BoxColored boxColored = new BoxColored(3, 4, 5, BoxColor.RED);
        System.out.println(boxColored);
    }
}
