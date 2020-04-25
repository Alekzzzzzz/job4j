package ru.job4j.array;

public class ArrayDefinition {
    /**
     * Присваиваем значение к элементам массива
     *
     * @param args
     */
    public static void main(String[] args) {
        String[] names = new String[4];
        names[0] = "Alexander";
        names[1] = "Anton";
        names[2] = "Dmitriy";
        names[3] = "Agata";
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
    }
}
