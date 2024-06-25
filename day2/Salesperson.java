package com.merve.day2;

public class Salesperson extends Employee{
    private double commisionPercentage;

    public Salesperson (String name,double salary,int age,double commisionPercentage){
        super(name,salary,age);
        this.commisionPercentage=commisionPercentage;
    }

    public double getCommisionPercentage(){
        return commisionPercentage;
    }
    public void raiseCommission(){
        if(this.commisionPercentage<.30){
            this.commisionPercentage=this.commisionPercentage*2;
        }
    }
}
//ToDo:raiseCommision mainde çağirma (void kısmı!)