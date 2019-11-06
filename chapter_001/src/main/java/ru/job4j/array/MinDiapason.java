package ru.job4j.array;

public class MinDiapason {
    public static int findMin(int[] array, int start, int finish) {
        if (start < finish) {
            int min = array[start];
            for (int i = start; i < finish; i++) {
                if (array[i] < min) {
                    min = array[i];
                }
            }
            return min;
        } else {
            throw new RuntimeException("Invalid Range");
        }
    }
}