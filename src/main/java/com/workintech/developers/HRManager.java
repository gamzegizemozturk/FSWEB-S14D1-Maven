package com.workintech.developers;

import java.util.Arrays;

public class HRManager extends Employee{

    private JuniorDeveloper[] juniorDevelopers;
    private MidDeveloper[] midDevelopers;
    private SeniorDeveloper[] seniorDevelopers;

    public HRManager(long id, String name, double salary) {
        super(id, name, salary);
    }

    public HRManager(long id, String name, double salary,
                     JuniorDeveloper[] juniorDevelopers,
                     MidDeveloper[] midDevelopers,
                     SeniorDeveloper[] seniorDevelopers) {
        this(id, name, salary);
        this.juniorDevelopers = juniorDevelopers;
        this.midDevelopers = midDevelopers;
        this.seniorDevelopers = seniorDevelopers;
    }

    public void addEmployee(int index, JuniorDeveloper juniorDeveloper) {
        try{
            if(juniorDevelopers[index] == null){
                juniorDevelopers[index] = juniorDeveloper;
            }
            else {
                System.out.println("Index is full some record exist!");
            }
        }catch (ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace(); //exception detayı
            System.out.println("Index not found:" + index);

        }
    }

    public void addEmployee(int index, MidDeveloper midDeveloper) {
        try{
            if(midDevelopers[index] == null){
                midDevelopers[index] = midDeveloper;
            }
            else {
                System.out.println("Index is full some record exist!");
            }
        }catch (ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace(); //exception detayı
            System.out.println("Index not found:" + index);

        }
    }

    public void addEmployee(int index, SeniorDeveloper seniorDeveloper) {
        try{
            if(seniorDevelopers[index] == null){
                seniorDevelopers[index] = seniorDeveloper;
            }
            else {
                System.out.println("Index is full some record exist!");
            }
        }catch (ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace(); //exception detayı
            System.out.println("Index not found:" + index);

        }
    }

    @Override
    public void Work() {
        System.out.println(getName() + " HR Manager starts to working.");
    }

    @Override
    public String toString() {
        return "HRManager{" +
                "hrManager=" +  super.toString() +
                ", juniorDevelopers=" + Arrays.toString(juniorDevelopers) +
                ", midDevelopers=" + Arrays.toString(midDevelopers) +
                ", seniorDevelopers=" + Arrays.toString(seniorDevelopers) +
                '}';
    }
}