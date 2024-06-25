package com.merve.day2;

public class main {
    public static void main(String[] args) {
       Engineer engineer=new Engineer("Sally",80000,34);
        Salesperson salesperson=new Salesperson("Matt",65000,32,.25);

       engineer.getAnnualBonus();
        salesperson.raiseSalary();
        salesperson.getCommisionPercentage();

        System.out.println("engineer.salary:"+engineer.salary);
        System.out.println("engineer.getAnnualBonus:"+engineer.getAnnualBonus());
        System.out.println("salesperson.salary:"+salesperson.salary);
        System.out.println(" salesperson.getCommisionPercentage:"+ salesperson.getCommisionPercentage());
    }
}
