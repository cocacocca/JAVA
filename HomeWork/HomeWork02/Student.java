package HomeWork.HomeWork02;

import HomeWork.HomeWork02.HumanPackage.Human;

public class Student extends Human {
    public static void main(String[] args) {
        Human Sam = new Human();

        System.out.println(Sam.stuNum);
        System.out.println(Sam.getPriAge());
        System.out.println(Sam.getProtSalary());
    }
}
