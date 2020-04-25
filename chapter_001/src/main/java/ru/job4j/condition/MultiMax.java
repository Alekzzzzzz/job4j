package ru.job4j.condition;

public class MultiMax {

    /**
     * ищем наибольшее значение из трёх
     *
     * @param first
     * @param second
     * @param third
     * @return
     */
    public int max(int first, int second, int third) {
        int result = first > second? first:second;
        result = result > third? result: third;
        return result;
    }
}