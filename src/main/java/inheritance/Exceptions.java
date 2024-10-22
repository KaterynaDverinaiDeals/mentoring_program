package inheritance;

class InvalidCallerNameException extends Exception {
    public InvalidCallerNameException(String message) {
        super(message);
    }
}