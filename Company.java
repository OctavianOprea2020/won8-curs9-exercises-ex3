package curs9.homework09.ex3;

import java.util.ArrayList;
import java.util.List;

public class Company {
    public Company(List<Person> personList) {
        this.personList = personList;
    }

    public List<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(List<Person> personList) {
        this.personList = personList;
    }

    List<Person> personList = new ArrayList<Person>();
    public Person getManager() {
        Person person = new Person();

        for (int i = 0; i < getPersonList().size(); i++) {
            if (getPersonList().get(i).getPosition() == "manager") {
                person = getPersonList().get(i);
                break; // there is only one "manager"
            }
        }

        return person;
    }

    public List<Person> getPersons(String profession) {
        Person person = new Person();
        List<Person> persons = new ArrayList<>();

        for (int i = 0; i < getPersonList().size(); i++) {
            if (getPersonList().get(i).getPosition() == profession) {
                person = getPersonList().get(i);
                persons.add(person);
            }
        }

        return persons;
    }

    public List<Person> getPersonsOlder(int age) {
        Person person = new Person();
        List<Person> persons = new ArrayList<>();

        for (int i = 0; i < getPersonList().size(); i++) {
            if (getPersonList().get(i).getAge() > age) {
                person = getPersonList().get(i);
                persons.add(person);
            }
        }

        return persons;
    }
    public List<Person> getPerson(String filterName) {
        Person person = new Person();
        List<Person> persons = new ArrayList<>();

        for (int i = 0; i < getPersonList().size(); i++) {
            if (getPersonList().get(i).getName().contains(filterName)) {
                person = getPersonList().get(i);
                persons.add(person);
            }
        }

        return persons;
    }

    public boolean hasManager() {
        for (int i = 0; i < getPersonList().size(); i++) {
            if (getPersonList().get(i).getPosition() == "manager") {
                return true;
            }
        }

        return false;
    }
    public boolean employ(Person person) {
        if (person.isPosition("manager") && hasManager()) // trying to add a "manager" and there is already one?
            return false;

        List<Person> persons = getPersonList();
        persons.add(person);
        setPersonList(persons);
        return true;
    }
}

