package com.cydeo.bootstrap;

import com.cydeo.model.Student;
import java.util.Arrays;
import java.util.List;

public class DataGenerator {

    public static List<Student> createStudent() {
        List<Student> students = Arrays.asList(
                new Student("Anna", "Storm", 40, "MA"),
                new Student("Nina", "Wild", 25, "NH"),
                new Student("John", "Smith", 18, "CA"),
                new Student("Lisa", "Soul", 30, "FL"),
                new Student("Sam", "Lother", 89, "MA")
                );
        return students;
    }
}
