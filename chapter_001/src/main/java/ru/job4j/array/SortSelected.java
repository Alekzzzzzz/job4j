package ru.job4j.array;

import java.util.Arrays;

public class SortSelected {

    public static int[] sort(int[] data) {
        for (int i = 0, temp; i < data.length; i++) {

            int min = MinDiapason.findMin(data, i, data.length);

            int index = (int) FindLoop.indexOf(data, min, i, data.length);

            // Swap the values
            temp = data[i];
            data[i] = data[index];
            data[index] = temp;

            System.out.println(Arrays.toString(data));
        }
        return data;
    }
}