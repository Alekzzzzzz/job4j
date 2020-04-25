package ru.job4j.condition;

public class Max {
    /**
     * Проверяем что больше левый или правый с помощью тернарного оператора
     *
     * @param left
     * @param right
     * @return
     */
    public int max(int left, int right) {
        return left >= right ? left: right;
    }
}