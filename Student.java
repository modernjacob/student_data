package Project_Portfolio;
public class Student {

    // Initialize private variables
    protected String name;
    private String address;
    private double GPA;

    // Default constructor
    Student (String name, String address, double GPA) {
        this.name = name;
        this.address = address;
        this.GPA = GPA;
    }

    // print method
    public String print() {
        return ("\t" + this.name + "\t\t" + this.address + "\t\t\t" + this.GPA);
    }
     
}