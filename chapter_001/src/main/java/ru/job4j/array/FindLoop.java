package ru.job4j.array;

public class FindLoop {
    public int indexOf(int[] data, int el) {
        int rst = -1; // если элемента нет в массиве, то возвращаем -1.
        for (int index = 0; index != data.length; index++) {// проходим по циклу от 0 до выбранного числа
            if (data[index] == el) {// если индекс = выбранному числу
                rst = index;// то выводим индекс
                break;
            }

        }
        return rst;
    }
}