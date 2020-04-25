package ru.job4j.array;

public class SwitchArray {
    /**
     * меняем местами указанные элементы
     *
     * @param array
     * @param source
     * @param dest
     * @return
     */
    public static int[] swap(int[] array, int source, int dest) {
        int temp = array[source];
        array[source] = array[dest];
        array[dest] = temp;
        return array;
    }

    /**
     * меняем значение первого элемента с последним
     *
     * @param array
     * @return
     */
    public static int[] swapBorder(int[] array) {
        int temp = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = temp;
        return array;
    }
}
