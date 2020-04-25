package ru.job4j.calculator;

/**
 * Fit
 * @author Alexander Gaponenko (Proton1987@yandex.ru)
 * @version $Id$
 * Программа расчета идеального веса.
 */
public class Fit {

    /**
     * Высчитываем идеальный вес используя данные роста
     * @param height Рост.
     * @return идеальный вес.
     */
    public double manWeight(double height ) {
        return (height - 100) * 1.15;
    }

    /**
     * Идеальный вес для женщины используя данные роста
     * @param height Рост.
     * @return идеальный вес.
     */
    public double womanWeight(double height ) {
        return (height - 110) * 1.15;
    }
}
