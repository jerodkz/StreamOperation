package com.simplon.streamoperation;


//import stream.model.Person;

import java.util.ArrayList;
import java.util.List;

public class StreamOperation {

    private List<Person> persons;

    public StreamOperation(List<Person> persons) {
        this.persons = persons;
    }

    public long countPersonsWithAge(int age) {
    /*    long count = 0;
        for (Person person : persons) {
            if (person.getAge() == age) {
                count++;
            }
        }
        return count;
    */
        return (int) persons.stream()
                .filter(person -> person.getAge() == age).count();
    }

    public long countMarriedPeople() {
    /*    long count = 0;
        for (Person person : persons) {
            if (person.isMarried()) {
                count++;
            }
        }
        return count;
    */
        return (int) persons.stream()
                .filter(person -> person.isMarried() == true).count();

    }

    public List<Person> filterByLanguage(String language) {
        ArrayList<Person> persons = new ArrayList<>();
        for (Person person : this.persons) {
            if (person.getLanguage().equals(language)) {
                persons.add(person);
            }
        }
        return persons;
    }

    public List<Person> toUpperCaseAndSorted() {
        ArrayList<Person> persons = new ArrayList<>();
        for (Person person : this.persons) {
            Person personOther = new Person();
            personOther.setLanguage(person.getLanguage().toUpperCase());
            personOther.setName(person.getName().toUpperCase());
            personOther.setSurname(person.getSurname().toUpperCase());
            personOther.setMarried(person.isMarried());
            persons.add(personOther);
        }
        return persons;

    }


}