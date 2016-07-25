package ua.com.webacademy.beginnerslection6;

import java.io.Serializable;

public class StudentS implements Serializable {
    public String Name;
    public int Age;

    public StudentS(String name, int age) {
        this.Name = name;
        this.Age = age;
    }
}
