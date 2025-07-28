package com.workintech.developers;

public class MidDeveloper extends Employee{

    public MidDeveloper(long id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void Work() {
        System.out.println(getName() + " Mid developer starts to working.");
    }
}