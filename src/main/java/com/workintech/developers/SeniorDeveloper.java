package com.workintech.developers;

public class SeniorDeveloper extends Employee{

    public SeniorDeveloper(long id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void Work() {
        System.out.println(getName() + " Senior developer starts to working.");
    }
}