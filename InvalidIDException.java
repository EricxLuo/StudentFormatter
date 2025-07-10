public class InvalidIDException extends Exception {

    public InvalidIDException(String message) {
        super(message);
    }

    public static InvalidIDException forInvalidLength() {
        return new InvalidIDException("You need exactly 9 digits for a proper ID and cannot be blank");
    }

    public static InvalidIDException forNonNumeric() {
        return new InvalidIDException("ID must contain only numeric digits");
    }
}