package Java.Homework11.Exceptions;

public class NoNegativeAgeException extends Exception{
    public NoNegativeAgeException(String errorMessage) {
        super(errorMessage);
    }

    public NoNegativeAgeException() {
        super();
    }
}
