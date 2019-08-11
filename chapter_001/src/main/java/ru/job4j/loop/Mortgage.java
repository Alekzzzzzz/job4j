package ru.job4j.loop;

public class Mortgage {
    public int year(int amount, int monhly,int percent){
        int year = 0;
        while (year >= 12){
            amount = (amount / 100 * percent) + amount;
            year = amount / monhly;
         }year += 1;
        return year;
    }
}
