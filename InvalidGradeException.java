/*
 * this file create an excepton for invalid grades
 */

public class InvalidGradeException extends Exception {

    public InvalidGradeException(String message) {
        super(message);
    }

    public static InvalidGradeException forInvalidGrade() {
        return new InvalidGradeException("Your grade must be between 0 and 100");
    }

}