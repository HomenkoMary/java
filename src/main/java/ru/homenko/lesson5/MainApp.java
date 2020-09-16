package ru.homenko.lesson5;

import sun.plugin.javascript.navig.Array;

public class MainApp {


    public static void main(String[] args)
    {


        Employer[] Employee = new Employer[5];

        Employee[0] = new Employer("Anton", "Khomenko", 41, "xoma99@mail.ru", "+79179525900", "scrum master", 105000);
        Employee[1] = new Employer("Ivan", "Ivanov", 36, "ivan@mail.ru", "+79179525901", "ceo", 305000);
        Employee[2] = new Employer("Petr", "Petrov", 56, "petr@mail.ru", "+79179525902", "cto", 205000);
        Employee[3] = new Employer("Sidor", "Sidorov", 29, "sidor@mail.ru", "+79179525903", "project manager", 105000);
        Employee[4] = new Employer("Mike", "Dudikof", 29, "mike@mail.ru", "+79179525904", "actor", 805000);




        for (int i = 0; i < Employee.length; i++) {
            if (Employee[i].getEmployerAge() > 40){
                System.out.println(Employee[i].getEmployerInfo());
            }
        }
    }





}
