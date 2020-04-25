package ru.job4j.loop;

/**
 * PrimeNumner
 * @author Alexander Gaponenko (Proton1987@yandex.ru)
 */

public class PrimeNumber {
    /**
     * вычисляем количество простых чисел
     *
     * @param finish число на вход
     * @return возвращаем количество простых чисел
     */
    public int calc(int finish) {
        boolean b = true;
        int count = 0;
        for (int i = 2; i <= finish; i++){
            for (int j = 2; j < i; j++){
                if (i % j  == 0){
                    b = false;
                    break;
                }
            }
            if (b){
                count += 1;
            }
            else {
                b = true;
            }
        }
        return count;
    }
}