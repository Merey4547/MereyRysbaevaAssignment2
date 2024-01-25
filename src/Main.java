import modules.Employee;
import modules.Person;
import modules.Student;
import java.util.ArrayList;
import java.util.Collections;
public class Main {
    public static void main(String[] args) {
        //creating objects employee and student that inherit from person class
        Employee Dana = new Employee("Dana", "Damenova", "Data Analytic", 999999.99);
        Employee Amir = new Employee("Amir", "Abdykarimov", "Backend developer", 99999.96);
        Student Assem = new Student("Assem", "Ushatova", 3.99);
        Student Merey = new Student("Merey", "Bateman", 1.66);
        //creating an arraylist for storing objects
        ArrayList<Person> people = new ArrayList<>();
        //adding people to the arraylist
        people.add(Dana);
        people.add(Amir);
        people.add(Assem);
        people.add(Merey);
        //sorting people by their paid amount of money
        Collections.sort(people);
        //printing obtained sorted people arraylist
        printData(people);
    }

    public static void printData(Iterable<Person> people) {
        for (Person person : people) { //iterating all person objects in people arraylist
            System.out.println(person.toString() + " earns "+ person.getPaymentAmount());
            //getting role, id, name and surname that can be retrieved with toString() method and then their income
        }
    }
}