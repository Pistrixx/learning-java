public class Square implements Comparable<Square> {

    private int length;
    private int number;
    private static int counter;

    public Square(int length) {
        this.length = length;
        number = counter++;
    }

    public int getArea() {
        return length*length;
    }

    @Override
    public String toString() {
        return "(" + number + ")" + getArea();
    }

    @Override
    public int compareTo(Square o) {
        //return getArea() - o.getArea();
        return o.getArea() - getArea();
    }
}
