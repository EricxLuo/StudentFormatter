
public class validity {
    /*
     * @param ID ID is the student ID given to us
     *
     */

    public static void validID(final String ID) throws InvalidIDException {
        if (ID == null || ID.isBlank()) {
            throw InvalidIDException.forInvalidLength();
        }

        if (ID.length() != 9) {
            throw InvalidIDException.forInvalidLength();
        }

        try {
            Integer.parseInt(ID);
        } catch (NumberFormatException e) {
            throw InvalidIDException.forNonNumeric();
        }
    }

    public static void validGrade(int grade) throws InvalidGradeException {
        if (grade < 0 || grade > 100) {
            throw InvalidGradeException.forInvalidGrade();
        }
    }
  

    public static void validCourse(String Course) throws InvalidCourseException {

        
        // Check for null or incorrect length
        if (Course == null || Course.length() != 5) {
            throw InvalidCourseException.forInvalidCourse();
        }

        // Check first 2 characters are letters
        for (int i = 0; i < 1; i++) {
            if (!Character.isLetter(Course.charAt(i))) {
                throw InvalidCourseException.forInvalidCourse();
            }
        }

        // Check last 3 characters are digits
        for (int i = 2; i < 4; i++) {
            if (!Character.isDigit(Course.charAt(i))) {
                throw InvalidCourseException.forInvalidCourse();
            }
        }
    }

    public static void validName(String name) throws InvalidNameException {
        int i;
        boolean space = false;

        for (i = 0; i < name.length(); i++) {
            if (name.charAt(i) == ' ') {
                space = true;
            } else if (name.charAt(i) == ' ' && space) {
                throw InvalidNameException.forInvalidName();
            }

            else if (!Character.isAlphabetic(name.charAt(i))) {
                throw InvalidNameException.forInvalidName();
            }
        }
    }

}