package ru.job4j.array;

public class BarleyBreak {
    /**
     * Инициализируем элементы двойного массива от 1 до 9
     *
     * @param args
     */
    public static void main(String[] args) {
        int[][] array = new int[3][3];
        int count = 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = count;
                count++;
                System.out.println(array[i][j]);
            }
        }
    }
}
