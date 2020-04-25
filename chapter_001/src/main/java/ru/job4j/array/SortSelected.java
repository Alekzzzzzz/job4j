package ru.job4j.array;

import java.util.Arrays;

public class SortSelected {
    /**
     *Сортируем массив выборкой
     *
     * @param data
     * @return
     */
    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int min = MinDiapason.findMin(data, i, data.length);
            int index =  FindLoop.indexOf(data, min, i, data.length);
            int temp = data[i];
            data[i] = data[index];
            data[index] = temp;
            System.out.println(Arrays.toString(data));
        }
        return data;
    }
}