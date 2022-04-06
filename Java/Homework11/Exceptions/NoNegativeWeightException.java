package Java.Homework11.Exceptions;

public class NoNegativeWeightException extends Exception{
    public NoNegativeWeightException(String errorMessage) {
        super(errorMessage);
    }

    public NoNegativeWeightException() {
        super();
    }
}
