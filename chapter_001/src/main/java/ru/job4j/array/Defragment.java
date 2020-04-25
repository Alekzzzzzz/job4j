package ru.job4j.array;

public class Defragment {
    /**
     * Метод для сортировки пустых ячеек от заполненых
     *
     * @param array
     * @return
     */
    public static String[] compress(String[] array) {

        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) {
                int j = index + 1;
                while (j < array.length) {
                    if (array[j] != null) {
                        array[index] = array[j];
                        array[j] = null;
                        break;
                    }
                    j++;
                }
            }
        }
        return array;
    }
}
