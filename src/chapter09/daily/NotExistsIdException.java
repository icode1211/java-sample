package chapter09.daily;

public class NotExistsIdException extends Exception {
    public NotExistsIdException() {

    }
    public NotExistsIdException(String message) {
        super(message);
    }
}
