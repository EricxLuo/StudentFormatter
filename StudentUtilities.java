public class StudentUtilities {

    /**
     * Runs the read functions and combines the two arrays together into a Student
     * Object
     * 
     * @param course
     * @param text
     * 
     * @return student
     */
    public static Student combineAll(final String course, final String text) {

        String[] c = combine(course, text);
        Student student = new Student(
                Integer.parseInt(c[0]),
                c[6],
                c[1],
                finalGrade(Integer.parseInt(c[2]), Integer.parseInt(c[3]), Integer.parseInt(c[4]),
                        Integer.parseInt(c[5])));

        return student;

    }

    public static double finalGrade(int t1, int t2, int t3, int exam) {
        Double mark = 0.0;
        mark = (t1 * 0.2) + (t2 * 0.2) + (t3 * 0.2) + (exam * 0.4);
        return mark;

    }

    /**
     * Reads a line of CourseFile.txt and puts into array a
     * 
     * @param course
     * @return a
     * 
     */
    public static String[] readCourseLine(final String course) {
        String[] a = course.split(",");
        return a;
    }

    /**
     * Reads a line of NameFile.txt and puts into array a
     * 
     * @param text
     * @return b
     * 
     */
    public static String[] readNameLine(final String text) {
        String[] b = text.split(",");
        return b;

    }

    /**
     * Checks both files student names and will combine if they match
     * 
     * @param text
     * @return student
     * 
     */
    public static String[] combine(final String course, final String text) {
        String[] a = readCourseLine(course);
        String[] b = readNameLine(text);
        String[] combined = new String[7];

        if (a[0].equals(b[0])) {
            for (int i = 0; i < a.length; i++) {

                combined[i] = a[i].trim();
            }
            combined[6] = b[1].trim();
        }
        return combined;
    }

}