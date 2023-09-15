package org.example;

import java.util.ArrayList;
import java.util.Random;

public class Employee {



//    public abstract double calculateSalary();


//    public int compareTo(Employee o) {
//        return Double.compare(calculateSalary(), o.calculateSalary());
//        //return calculateSalary() == o.calculateSalary() ? 0 :
//        //        calculateSalary() > o.calculateSalary() ? 1 : -1;
//    }

    /**
     * метод печати коллекции
     * @param employees
     */
    public static void printEmployeeList(ArrayList<? extends Employee> employees){
        for(Employee i : employees){
            System.out.println(i);
        }
    }

    public Employee(String name, String surname, int age, double salary) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
        id = count++;
        minSalary(salary);
    }

    public Employee(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public static void addCount(){
//        id = count++;
    }

    /**
     * проверка на получение минимальной зп
     * @param salary
     */
    public static void minSalary(double salary){
        if (salary < 30000) System.out.println("ЗП должна быть больше");
    }

    /**
     * перегруженный метод toString
     */
    @Override
    public String toString() {
        return "Employee{" +
                "id= " + id +
                " name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }


    //  region Гетеры и сетеры
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public static String[] getNames() {
        return names;
    }

    public static String[] getSurnames() {
        return surnames;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public static void setNames(String[] names) {
        Employee.names = names;
    }

    public static void setSurnames(String[] surnames) {
        Employee.surnames = surnames;
    }

    // endregion

    // region Поля
    static int count = 1; //
    int id;   // id сотрудника
    String name;  // имя
    String surname;  // фамилия
    int age;    // возраст
    double salary;  // заработная плата
    protected static String [] names = new String[] {"Аркадий", "Виктор", "Юрий", "Анатолий", "Евгений", "Сергей"};
    protected static String [] surnames = new String[] {"Нигматулин", "Гехт", "Дедов", "Астапкович", "Спирин", "Махнин", "Алексеев"};
    protected static Random random = new Random();




    // endregion
}
