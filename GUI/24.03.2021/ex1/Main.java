import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Square s1 = new Square(5);
        Square s2 = new Square(8);
        Square s3 = new Square(2);
        Square s4 = new Square(9);
        Square s5 = new Square(7);

        Square[] squares = {s1, s2, s3, s4, s5};

        for(Square s : squares)
            System.out.println(s);

        System.out.println();

        Arrays.sort(squares); //sortowanie zgodnie z metoda compareTo

        for(Square s : squares)
            System.out.println(s);

    }
}
