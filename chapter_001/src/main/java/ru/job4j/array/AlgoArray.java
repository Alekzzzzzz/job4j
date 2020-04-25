package ru.job4j.array;

import ru.job4j.calculator.Fit;

public class AlgoArray {
    /**
     * Сортировка методом пузырька
     */
    public static void main(String[] args) {
        int[] array = new int[]{5, 3, 2, 1, 4};
            int count;
            do {
                count = 0;
                for (int i = 0; i < array.length - 1; i++) {
                    if (array[i] > array[i + 1]) {
                        int temp = array[i];
                        array[i] = array[i + 1];
                        array[i + 1] = temp;
                        count++;
                    }
                }
            }
        while (count > 0);
        for (int num : array) {
            System.out.print(num + ",");
        }
    }
}

