package org.example;

import java.util.Scanner;

public class Worker extends Employee {

    double fixed_salary = 80000;  // оклад
//    Scanner scanner = new Scanner(System.in);

    public Worker(String name, String surname, int age) {
        super(name, surname, age);
        id = count++;
    }



    @Override
    public String toString() {
        return "Worker: " +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                "fixed_salary=" + fixed_salary;
    }



}
