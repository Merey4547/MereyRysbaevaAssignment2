package modules;

public abstract class Person implements Payable, Comparable<Person> {
    private static int id_gen = 1; //used to generate ids
    private final int id;
    private String name;
    private String surname;
    private String position;
    public Person() { //default constructor with no parameters
        id = id_gen++;
    }
    public Person(String name, String surname){ //parametrized constructor which takes both name and surname
        id = id_gen++;
        this.name = name;
        this.surname = surname;
    }
    //String containing information id, name and surname
    public String toString() {
        return (getId() + ". " + getName() + " " + getSurname());
    }
    //getters for id, name and surname to access information about the object
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    //setters for name and surname to modify information about the object
    public void setName(String name) {
        this.name = name;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    //we don't need a setter for ID because it is incremented automatically using static int id_gen

    @Override
    public double getPaymentAmount() {
        return 0; //unknown salary if it's an object of class person, neither student nor employee
    }

    @Override
    public int compareTo(Person person) { // shows that we compare people by their payment amount during sorting
        return (int) Double.compare(this.getPaymentAmount(), person.getPaymentAmount());
    }
    public String getPosition(){
        return position;
    }
}