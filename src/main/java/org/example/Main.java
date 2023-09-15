package org.example;

import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//        Employee worker1 = new Worker("Name 1","Surname 1", 24);
//        System.out.println(worker1);
//        Employee worker2 = new Worker("Name 2","Surname 2", 44);
//        System.out.println(worker2);
//        Employee frelancer1 = new Freelancer("Name 3","Surname 3", 33);
//        System.out.println(frelancer1);

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Worker("Name 1","Surname 1", 24));
        employees.add(new Worker("Name 2","Surname 2", 44));
        employees.add(new Freelancer("Name 3","Surname 3", 33));
        employees.add(new Freelancer("Name 4","Surname 4", 19));
        Employee.printEmployeeList(employees);


    }
}