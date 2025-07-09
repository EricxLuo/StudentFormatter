public class Person {

    // initialzes a person object
    public int ID;
    public String name;

    /**
     * Instantiates a student object.
     *
     * @param ID   Student Full Name
     * @param name Course Code
     **/
    public Person(final int ID, final String name) {
        this.ID = ID;
        this.name = name;
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
}
