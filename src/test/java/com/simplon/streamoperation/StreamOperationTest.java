package com.simplon.streamoperation;


import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

import static junit.framework.Assert.assertEquals;


public class StreamOperationTest {

    @Test
    public void countPersonsWithAge_with_five_person() {
        //set
        Person person = new Person("name", "surname", 20, "french", true);
        Person person1 = new Person("name1", "surname1", 20, "english", false);
        Person person2 = new Person("name2", "surname2", 30, "spain", true);
        Person person3 = new Person("name3", "surname3", 40, "french", false);
        List<Person> persons = new ArrayList<>();
        persons.add(person);
        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
        StreamOperation streamOperations = new StreamOperation(persons);
        //test
        long result = streamOperations.countPersonsWithAge(20);
        //assert
        assertEquals(2,result);
    }

    @Test
    public void countMarriedPeople_with_five_person() {
        //set
        Person person = new Person("name", "surname", 20, "french", true);
        Person person1 = new Person("name1", "surname1", 20, "english", false);
        Person person2 = new Person("name2", "surname2", 30, "spain", true);
        Person person3 = new Person("name3", "surname3", 40, "french", false);
        List<Person> persons = new ArrayList<>();
        persons.add(person);
        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
        StreamOperation streamOperations = new StreamOperation(persons);
        //test
        long result = streamOperations.countMarriedPeople();
        //assert
        assertEquals(2,result);
    }

    @Test
    public void filterByLanguage_with_five_person() {
        //set
        Person person = new Person("name", "surname", 20, "french", true);
        Person person1 = new Person("name1", "surname1", 20, "english", false);
        Person person2 = new Person("name2", "surname2", 30, "spain", true);
        Person person3 = new Person("name3", "surname3", 40, "french", false);
        List<Person> persons = new ArrayList<>();
        persons.add(person);
        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
        StreamOperation streamOperations = new StreamOperation(persons);
        //test
        List<Person> result = streamOperations.filterByLanguage("french");
        //assert
        assertEquals(2,result.size());

    }

    @Test
    public void toUpperCaseAndSorted_with_five_person() {
        //set
        Person person = new Person("name", "surname", 20, "french", true);
        Person person1 = new Person("name1", "surname1", 20, "english", false);
        Person person2 = new Person("name2", "surname2", 30, "spain", true);
        Person person3 = new Person("name3", "surname3", 40, "french", false);
        List<Person> persons = new ArrayList<>();
        persons.add(person);
        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
        StreamOperation streamOperations = new StreamOperation(persons);
        //test
        List<Person> result = streamOperations.toUpperCaseAndSorted();
        //assert
        assertEquals("NAME",result.get(0).getName());
        assertEquals("NAME1",result.get(1).getName());
        assertEquals("NAME2",result.get(2).getName());
        assertEquals("NAME3",result.get(3).getName());

    }

}
