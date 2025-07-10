public class InvalidNameException extends Exception {

    public InvalidNameException(String message) {
        super(message);
    }

    public static InvalidNameException forInvalidName() {
        return new InvalidNameException("Your Name Cannot be blank and can only contain one space and letters");

    }
}
