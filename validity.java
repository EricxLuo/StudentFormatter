
public class validity {

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
        int i;
        for (i = 0; i < 5; i++) {
            if (!Character.isDigit(Course.charAt(i)) || Character.isAlphabetic(Course.charAt(i))) {
                throw InvalidCourseException.forInvalidCourse();
            }
        }
        if (i != 5) {
            throw InvalidCourseException.forInvalidCourse();
        }
    }

    public static void validName(String name) throws InvalidNameException {
        int i;
        boolean space = false;

        for (i = 0; i < name.length(); i++) {
            if (name.charAt(i) == ' ') {
                space = true;
            } else if (space) {
                throw InvalidNameException.forInvalidName();
            }

            else if (!Character.isAlphabetic(name.charAt(i))) {
                throw InvalidNameException.forInvalidName();
            }
        }
    }

}