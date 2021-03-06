package com.zipcodewilmington.person;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 2/12/18.
 */
public class TestPerson {
    @Test
    public void testDefaultConstructor() {
        // Given
        String expectedName = "";
        Integer expectedAge = Integer.MAX_VALUE;

        // When
        Person person = new Person();

        // Then
        String actualName = person.getName();
        Integer actualAge = person.getAge();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAge, actualAge);
    }

    @Test
    public void testConstructorWithName() {
        // Given
        String expected = "Leon";

        // When
        Person person = new Person(expected);

        // Then
        String actual = person.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructorWithAge() {
        // Given
        Integer expected = 5;

        // When
        Person person = new Person(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testConstructorWithNameAndAge() {
        // Given
        Integer expectedAge = 5;
        String expectedName = "Leon";

        // When
        Person person = new Person(expectedName, expectedAge);

        // Then
        Integer actualAge = person.getAge();
        String actualName = person.getName();

        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void testSetName() {
        // Given
        Person person = new Person();
        String expected = "Leon";

        // When
        person.setName(expected);
        String actual = person.getName();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetAge() {
        // Given
        Person person = new Person();
        Integer expected = 5;

        // When
        person.setAge(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetGender() {
        // Given
        Person person = new Person();
        String expected = "Female";

        // When
        person.setGender(expected);
        String actual = person.getGender();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetMaritalStatus() {
        // Given
        Person person = new Person();
        String expected = "Single";

        // When
        person.setMaritalStatus(expected);
        String actual = person.getMaritalStatus();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetOccupation() {
        // Given
        Person person = new Person();
        String expected = "Student";

        // When
        person.setOccupation(expected);
        String actual = person.getOccupation();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetHeight() {
        // Given
        Person person = new Person();
        String expected = "5' 9\"\"";

        // When
        person.setHeight(expected);
        String actual = person.getHeight();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetLiving() {
        // Given
        Person person = new Person();
        boolean expected = false;

        // When
        person.setAlive(expected);
        boolean actual = person.isAlive();

        // Then
        Assert.assertEquals(expected, actual);
    }
}
