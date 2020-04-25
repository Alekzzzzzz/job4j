package ru.job4j.loop;

public class Mortgage {

    /**
     * вычесляем сколько лет платить ипотеку
     * @param amount
     * @param monhly
     * @param percent
     * @return
     */
    public int year(int amount, int monhly,double percent){
        int year = 0;
        while (year < 1){
            year = (int) ((amount / 100 * percent) + amount);
            year = year / monhly / 12;
            year += 1;
         }
        return  year;
    }
}
