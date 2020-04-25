package ru.job4j.array;

public class FindLoop {
    /**
     * Ищем индекс с опредеоенным числом в массиве
     *
     * @param data
     * @param el
     * @param start
     * @param finish
     * @return
     */
    public static int indexOf(int[] data, int el, int start, int finish) {
        int rst = -1;
        for (int index = start; index < finish; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }
}