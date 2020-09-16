package ru.homenko.lesson5;

public class Employer {

    private String firstName;
    private String secondName;
    private Integer age;

    private String email;
    private String phone;
    private String position;

    private Integer salary;

    public Employer (
            String firstName,
            String secondName,
            Integer age,
            String email,
            String phone,
            String position,
            Integer salary)
    {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;

        this.email = email;
        this.phone = phone;
        this.position = position;

        this.salary = salary;
    }

    public String getEmployerInfo()
    {
        return "Name: " + this.firstName + " " + this.secondName + "; Position: " + this.position + "; Age: " + this.age;
    }

    public Integer getEmployerAge()
    {
        return this.age;
    }
}
