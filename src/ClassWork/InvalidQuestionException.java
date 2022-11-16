package ClassWork;

public class InvalidQuestionException extends RuntimeException {

    public InvalidQuestionException() {
    }

    public InvalidQuestionException(String message) {
        super(message);
    }

    public InvalidQuestionException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidQuestionException(Throwable cause) {
        super(cause);
    }


}
