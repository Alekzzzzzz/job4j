package ru.job4j.loop;
/**
 * Factorial
 * @author Alexander Gaponenko (Proton1987@yandex.ru)
 * Программа факториал чисел
 */
public class Factorial {
    /**
     *
     * @param n вводимое число
     * @return факториал числа
     */
    public int calc(int n) {
        int result = 1;
        for (int i = 1;i <= n;i++){
            result *= i ;
        }
        return result;
    }
}