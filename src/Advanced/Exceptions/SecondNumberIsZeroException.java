package Advanced.Exceptions;


public class SecondNumberIsZeroException extends ArithmeticException {

    public SecondNumberIsZeroException() {
    }

    public SecondNumberIsZeroException(String s) {
        super(s);
    }
}
