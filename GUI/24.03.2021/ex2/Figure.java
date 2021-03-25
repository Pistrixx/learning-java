public interface Figure {

    int max = 6;

    default int getArea() {
        return max*max;
    }

    default int getPerimeter() {
        return max*4;
    }

}
