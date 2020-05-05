package ru.job4j.condition;

public class Max {
    /**
     * Перегруженный метод max
     *
     * @param left
     * @param right
     * @return
     */
    public int max(int left, int right) {
        return left >= right ? left: right;
    }

    public int max(int left, int right,int front) {
        return max(max(left,right),front);
    }

    public int max(int left, int right,int front,int back) {
        return max(max(left,right,front),back);
    }
}