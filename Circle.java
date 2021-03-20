public class Circle extends Geometry {

    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public void showFigureType() {
        System.out.println("Type: circle");
    }

    public String getData() {
        return "Radius: " + radius;
    }

    public String getCircuit() {
        return "Circuit: " + (2*3.14*radius);
    }

}
