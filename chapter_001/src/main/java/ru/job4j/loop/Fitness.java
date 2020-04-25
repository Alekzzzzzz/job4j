package ru.job4j.loop;

public class Fitness {

    /**
     * вычесляем за сколько месяцев иван догонит ника
     * @param ivan
     * @param nik
     * @return
     */
    public int calc(int ivan, int nik) {
        int month = 0;
        while (ivan  < nik ){
         ivan *= 3;
         nik *= 2;
         month += 1;
        }
        return month;
    }
}