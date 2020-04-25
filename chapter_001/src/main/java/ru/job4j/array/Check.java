package ru.job4j.array;

public class Check {
    /**
     * Сравниваем значенияэлементов массива между собой поочередно
     *
     * @param data
     * @return result
     */
    public boolean mono(boolean[] data) {
        boolean result = true;
        for (int i = 0; i < data.length - 1; i++) {
            if (data[i] != data[i + 1]) {
                result = false;
                break;
            }
        }
        return result;
    }
}