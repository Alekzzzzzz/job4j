package ru.job4j.array;

public class MinDiapason {
    /**
     * Ищем наименьшее значение в диапозоне
     *
     * @param array
     * @param start
     * @param finish
     * @return
     */
    public static int findMin(int[] array, int start, int finish) {
        if (start < finish) {
            int min = array[start];
            for (int i = start; i < finish; i++) {
                if (min > array[i]) {
                    min = array[i];
                }
            }
            return min;
        } else {
            throw new RuntimeException("Invalid Range");
        }
    }
}