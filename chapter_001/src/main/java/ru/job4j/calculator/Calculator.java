package ru.job4j.calculator;
/**
 * Calculator.
 * @author Alexander Gaponenko (Proton1987@yandex.ru)
 * @version $Id$
 */
public class Calculator {
    /**
     * На вход принимаем два значения на выходе получаем сумму
     *
     * add
     * @param first - first
     * @param second -second
     * @return first plus second
     */
    public double add(double first, double second) {
        return first + second;
    }

    /**
     * на вход принимаем два значения на выходе получаем разность
     * subtract
     * @param first - first
     * @param second -second
     * @return first plus second
     */
    public double subtract(double first, double second) {
        return first - second;
    }

    /**
     * на вход принимаем два значения на выходе получаем частное
     *
     * div
     * @param first - first
     * @param second - second
     * @return first plus second
     */
    public double div(double first, double second) {
        return first / second;
    }

    /**
     * на вход принимаем два значения на выходе получаем произведение
     * multiple
     * @param first - first
     * @param second - second
     * @return first plus second
     */
    public double multiple(double first, double second) {
        return first * second;
    }

}