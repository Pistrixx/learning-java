public class Main {

    public static void main(String[] args) {

        Circle circle = new Circle(123);
        Triangle triangle = new Triangle(3, 4, 5);

        circle.showFigureType();
        System.out.println(circle.getData());
        System.out.println(circle.getCircuit());

        System.out.println("============");

        triangle.showFigureType();
        System.out.println(triangle.getData());
        System.out.println(triangle.getCircuit());

    }

}
