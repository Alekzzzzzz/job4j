package ru.job4j.converter;

/**
 * Корвертор валюты.
 * @author Alexander Gaponenko (Proton1987@yandex.ru)
 * @version $Id$
 *
 */
public class Converter {

    /**
     * Конвертируем рубли в евро.
     * @param value рубли.
     * @return Евро.
     */
    public int rubleToEuro(int value) {
        return value / 70;
    }

    /**
     * Конвертируем рубли в доллары.
     * @param value рубли.
     * @return Доллары
     */
    public int rubleToDollar(int value) {
        return value / 60;
    }

    /**
     * Конвертируем евро в рубли.
     * @param value евро.
     * @return Евро.
     */
    public int euroToruble(int value) {
        return value * 70;
    }
    /**
     * Конвертируем доллары в рубли.
     * @param value доллары
     * @return Доллары
     */
    public int dollarToruble(int value) {
        return value * 60;
    }
}