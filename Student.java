public class Student {
    // Maximum and minimum grade
    public final double maxGrade = 100.00;
    public final double minGrade = 0.00;

    // Fields
    private int ID;
    private String name;
    private String Course;
    private double mark;

    /**
     * Instantiates a student object.
     *
     * @param Name   Student Full Name
     * @param Course Course Code
     * @param ID     Student ID
     * @param mark   Student Mark
     */
    public Student(final int ID, final String name, final String Course, final double mark) {
        this.ID = ID;
        this.name = name;
        this.Course = Course;
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
            a = this.Course.compareTo(person.Course);
        }

        return a;

    }

    /**
     * Getter for ID attribute.
     *
     * @return ID
     */
    public int getID() {
        return this.ID;
    }

    /**
     * Getter for Name attribute.
     * S
     * 
     * @return Name
     */
    public String getName() {
        return this.name;
    }

    /**
     * Getter for Course attribute.
     *
     * @return Course
     */
    public String getCourse() {
        return this.Course;
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