package modules;

public class Employee extends Person{ //employee inherits from person
    private double salary;
    private String position;
    public Employee() { //default constructor with no parameters
        super();
    }
    //parametrized constructor with 4 parameters - name, surname, position and salary
    public Employee(String name, String surname, String position, double salary) {
        setName(name);
        setSurname(surname);
        setPosition(position);
        setSalary(salary);
    }
    //getters for employee for additional fields position and salary
    public double getSalary() {
        return salary;
    }
    public String getPosition(){
        return position;
    }
    //String containing information about the role, name and surname

    @Override
    public String toString() {
        return "Employee: " + super.toString();
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public double getPaymentAmount() {
        return this.getSalary();
    }
}