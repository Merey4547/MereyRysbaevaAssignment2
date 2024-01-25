package modules;

public class Student extends Person {//student inherits from person
    private double gpa; //other than attributs of a person, a student has a gpa
    public Student() { //default constructor with no arguments
        super();
    }
    //default constructor with 3 arguments name, surname, gpa
    public Student(String name, String surname, double gpa) {
        setName(name);
        setSurname(surname);
        setGpa(gpa);
    }

    @Override
    public double getPaymentAmount() { //calculates stipend of a student based on gpa
        if (gpa > 2.67) return 36660.0; //stipend for students with high gpa
        return 0; //no stipend for students with low gpa
    }

    //String containing information about the role, name and surname
    @Override
    public String toString() {
        return "Student" + ": " + super.toString();
    }

    //getter for gpa
    public String getGpa(String gpa) {
        return gpa;
    }

    //setter for gpa
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

}