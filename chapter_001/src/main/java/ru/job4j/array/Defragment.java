package ru.job4j.array;

public class Defragment {

    public static String[] compress(String[] array) {

        for (int index = 0; index < array.length; index++) {

            if (array[index] == null) {

                int j = index + 1;

                while (j < array.length){

                    if (array[j] != null){

                        array[index] = array[j];
                        array[j] = null;
                        break;
                    }
                    j++;
                }

            }
            System.out.print(array[index] + " "); // вывод на экран массив[с индексом] + " пробел"
        }
        return array;
    }

    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        System.out.println();
        for (int index = 0; index < compressed.length; index++) {
            System.out.print(compressed[index] + " ");
        }
    }
}
