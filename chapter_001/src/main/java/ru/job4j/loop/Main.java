package ru.job4j.loop;

public class Main {
    public static void main(String[] args) {
        int summa = 100;
        int plateg = 10;
        int procent = 50;
        int year = 0;
        while (year >= 12){
            summa = (summa / 100 * procent)+ summa;
            year = summa / plateg;
            year = year / 12;

        }
        System.out.println(year);
    }
}

