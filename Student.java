public class Student extends Person implements Comparable<Student> {
    // Maximum and minimum grade
    public final double maxGrade = 100.00;
    public final double minGrade = 0.00;

    // Fields
    private String course;
    private double mark;

    /**
     * Instantiates a student object.
     *
     * @param ID     Student Full Name
     * @param name   Course Code
     * @param course Student ID
     * @param mark   Student Mark
     */
    public Student(final int ID, final String name, final String course, final double mark) {
        super(ID, name); // Inheritance
        this.course = course;
        this.mark = mark;

        return;
    }

    /**
     * Compares students values too see the order to put in output file
     * 
     * @param person person to be compared by
     * 
     *               return a returns a interger to show if the perosn is larger or
     *               smaller or the same
     */
    public int compareTo(final Student person) {
        int a = Integer.compare(this.ID, person.ID);

        if (a == 0) {
            a = this.course.compareTo(person.course);
        }

        return a;

    }
    /*
     * this functions formatts the student object so that it can print into the
     * output file
     */

    public String toString() {

        return String.format("%-10s | %-20s | %-11s |%.1f", getID(), getName(), course, mark);
    }

    /**
     * Getter for Course attribute.
     *
     * @return Course
     */
    public String getCourse() {
        return this.course;
    }

    /**
     * Getter for mark attribute.
     *
     * @return mark
     */
    public double getMark() {
        return this.mark;
    }

}