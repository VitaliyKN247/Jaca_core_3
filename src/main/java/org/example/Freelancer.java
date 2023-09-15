package org.example;

import java.util.Scanner;

public class Freelancer extends Employee {
    double hourly_payment = 20.8;  // почасовая оплата

    /**
     * конструктор
     * @param name
     * @param surname
     * @param age
     */
    public Freelancer(String name, String surname, int age) {
        super(name, surname, age);
        id = count++;
        paymentCalculation(hourly_payment);
    }

    /**
     * перегруженный метод toString
     * @return
     */
    @Override
    public String toString() {
        return "Freelancer: " +
                "id= " + id +
                ", name= '" + name + '\'' +
                ", surname= '" + surname + '\'' +
                ", age= " + age +
                ", hourly_payment= " + hourly_payment;
    }

    /**
     * метод по рассчету зп по часам
     * @param hourly_payment
     */
    public void paymentCalculation(double hourly_payment){
        int hour;
        double salary_freelancer;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите кол-во часов сотрудника" + name + ": ");
        hour = scanner.nextInt();
        salary_freelancer = hourly_payment * hour;
        salary_freelancer = salary_freelancer * 100;
        salary_freelancer = Math.round(salary_freelancer);
        salary_freelancer = salary_freelancer / 100;

        System.out.println("ЗП фрилансера " + name + " = " + salary_freelancer);
    }

    /**
     * метод по округлению заработной платы до 2 чисел после запятой
     */
    public static void salary_rounding(double result){
        result = result * 100;
        result = Math.round(result);
        result = result / 100;
    }


}
