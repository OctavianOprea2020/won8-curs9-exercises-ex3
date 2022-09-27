package curs9.homework09.ex3;

import java.util.ArrayList;
import java.util.List;

public class Exercise3 {

    private static void printList(List<Person> myPersonList) {
        for (int i = 0; i < myPersonList.size(); i++) {
            System.out.println(myPersonList.get(i).getName() + "," + myPersonList.get(i).getAge() + "," + myPersonList.get(i).getPosition());
        }
    }

    public static void addNewPreson(Company company, Person person) {
        System.out.print("Trying to add a new person: ");
        person.printPerson();
        if (!company.employ(person)) {
            System.out.println("Couldn't add the new person because is manager and there is already a manager in the company.");
        }
        else {
            List<Person> myPersonList;
            myPersonList = company.getPersonList();
            System.out.println("The new person was added successfully.");
            printList(myPersonList);
        }
    }

    public static void main(String[] args) {

        List<Person> personList = new ArrayList<Person>();

        personList.add(new Person("John", 20, "carpenter"));
        personList.add(new Person("Smith", 30, "plumber"));
        personList.add(new Person("Mario", 25, "carpenter"));
        personList.add(new Person("Chris", 44, "welder"));
        personList.add(new Person("Luca", 35, "manager"));
        personList.add(new Person("Ted", 50, "plumber"));

        System.out.println("(0)");
        System.out.println("Initialize the list of persons:");
        for (Person p: personList) {
            System.out.println("Name: " + p.getName() + ", Age: " + p.getAge() + ", Position: " + p.getPosition());
        }

        Company company = new Company(personList);
        List<Person> myPersonList;

        System.out.println();
        System.out.println("Display the list of persons:");
        myPersonList = company.getPersonList();
        printList(myPersonList);

        // (1)
        System.out.println();
        System.out.println("(1)");
        System.out.println("Manager:");
        System.out.println(company.getManager().getName() + "," + company.getManager().getAge() + "," + company.getManager().getPosition());

        // (2)
        String profession = "carpenter";
        System.out.println();
        System.out.println("(2)");
        System.out.println(profession + ":");
        myPersonList = company.getPersons(profession);
        printList(myPersonList);

        // (3)
        int age = 25;
        System.out.println();
        System.out.println("(3)");
        System.out.println("Persons older than " + age + ":");
        myPersonList = company.getPersonsOlder(age);
        printList(myPersonList);

        // (4)
        String filter = "ri";
        System.out.println();
        System.out.println("(4)");
        System.out.println("Persons filtered using '" + filter + "':");
        myPersonList = company.getPerson(filter);
        printList(myPersonList);

        // (5)
        System.out.println();
        // (5a)
        System.out.println("(5a)");
        Person newPerson = new Person("Douglas", 52, "carpenter");
        addNewPreson(company, newPerson);
        // (5b)
        System.out.println("(5b)");
        newPerson = new Person("Scott", 60, "manager");
        addNewPreson(company, newPerson);
    }
}
