public class Triangle extends Geometry {

    int a;
    int b;
    int c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public void showFigureType() {
        System.out.println("Type: triangle");
    }

    public String getData() {
        return "a: " + a + ", b: " + b + ", c: " + c;
    }

    public String getCircuit() {
        return "Circuit: " + (a+b+c);
    }

}
