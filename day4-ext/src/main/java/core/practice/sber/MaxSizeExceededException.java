package core.practice.sber;

public class MaxSizeExceededException extends RuntimeException {
    public MaxSizeExceededException(String message) {
        super(message);
    }
}