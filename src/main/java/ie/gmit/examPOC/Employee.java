package ie.gmit.examPOC;
/*
Author: Padraig Ó Cosgora
Student Number: G00311302
Date: 06/03/2020
Module: Software Engineering & Test Exam 2

This class will define the data and methods within the Employee class.

*/

public class Employee {
    private String title;
    private String name;
    private String pps;
    private String phoneNumber;
    private String employmentType;
    private int age;

    public Employee(String title, String name, String pps, String phoneNumber, String employmentType, int age) {
        setTitle(title);
        setName(name);
        setPps(pps);
        setPhoneNumber(phoneNumber);
        setEmploymentType(employmentType);
        setAge(age);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if(title.toLowerCase().equals("mr") || title.toLowerCase().equals("ms") || title.toLowerCase().equals("mrs"))
            this.title = title;
        else {
            throw new IllegalArgumentException("Invalid title entry!");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() >= 3 && name.length() <= 25 )
            this.name = name;
        else {
            throw new IllegalArgumentException("Invalid name entry! Must be greater than " +
                    "3 characters and less than 25");
        }
    }

    public String getPps() {
        return pps;
    }

    public void setPps(String pps) {
        if (pps.length() == 8)
            this.pps = pps;
        else
            throw new IllegalArgumentException("Invalid PPS entry! Must be 8 digits.");
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber.length() == 9)
            this.phoneNumber = phoneNumber;
        else
            throw new IllegalArgumentException("Invalid number entry! Must be 9 digits.");
    }

    public String getEmploymentType() {
        return employmentType;
    }

    public void setEmploymentType(String employmentType) {
        if(employmentType.toLowerCase().equals("full-time") || employmentType.toLowerCase().equals("part-time") ||
                employmentType.toLowerCase().equals("contract"))
            this.employmentType = employmentType;
        else
            throw new IllegalArgumentException("Invalid Employment type entry! Must be Contract, Full-time or part-time.");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 16)
            this.age = age;
        else
            throw new IllegalArgumentException("Age must be over 16! Too young to work at the company.");
    }
}
