package ru.job4j.array;

public class Min {
    /**
     * Ищем наименьшее значение в массиве
     *
     * @param array
     * @return
     */
    public static int findMin(int[] array) {
        int min = array[0];
        for (int index = 0; index < array.length; index++) {
            if (min > array[index]) {
                min = array[index];
            }
        }
        return min;
    }
}