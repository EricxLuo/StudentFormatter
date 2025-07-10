public class InvalidCourseException extends Exception {

    public InvalidCourseException(String message) {
        super(message);
    }

    public static InvalidCourseException forInvalidCourse() {
        return new InvalidCourseException("Your Course must be 5 characters and only can be letters and numbers");
    }
}