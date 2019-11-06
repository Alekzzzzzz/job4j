package ru.job4j.array;

public class FindLoop {
    public static int indexOf(int[] data, int el, int start, int finish) {
        int rst = -1; // если элемента нет в массиве, то возвращаем -1.
        for (int index = start; index < finish; index++) {// проходим по циклу от 0 до выбранного числа
            if (data[index] == el) {// если индекс = выбранному числу
                rst = index;// то выводим индекс
                break;
            }

        }
        return rst;
    }
}