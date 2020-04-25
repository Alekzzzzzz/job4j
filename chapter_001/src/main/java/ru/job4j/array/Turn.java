package ru.job4j.array;

public class Turn {
    /**
     * Меняем противоположные элементы массива
     *
     * @param array
     * @return
     */
    public int[] back(int[] array) {
        int tmp;
        int data;
        for (int i = 0; i < array.length / 2; i++) {
            tmp = array[i];
            data = array.length - i - 1;
            array[i] = array[data];
            array[data] = tmp;
        }
        return array;
    }
}