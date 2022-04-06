package Java.Homework11.Exceptions;

public class NoNegativeHeightException extends Exception{
    public NoNegativeHeightException(String errorMessage) {
        super(errorMessage);
    }

    public NoNegativeHeightException() {
        super();
    }
}
