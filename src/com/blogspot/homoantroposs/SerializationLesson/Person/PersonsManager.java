package com.blogspot.homoantroposs.SerializationLesson.Person;

import com.blogspot.homoantroposs.SerializationLesson.Facilities.Quizzer;
import com.blogspot.homoantroposs.Utilites.DatesPeriodsCounter;

import java.time.LocalDate;

public class PersonsManager {

    private PersonsManager () {}

    static public Person creatPerson () {
        System.out.println("Прізвище:");
        String surName = Quizzer.askName();
        System.out.println("Ім'я:");
        String name = Quizzer.askName();
        LocalDate dOb = Quizzer.askDob();
        Integer age = DatesPeriodsCounter.ageCount(dOb);
        Person person = new Person (surName, name, dOb, age);
        return person;
    }

}
