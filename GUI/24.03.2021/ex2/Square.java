public class Square implements Figure {

    int length;

    public Square(int length) throws TooBig {
        this.length = length;

        if(length > max)
            throw new TooBig("Square is too big!");
    }
}


class TooBig extends Exception {
    public TooBig(String msg) {
        super(msg);
    }
}
