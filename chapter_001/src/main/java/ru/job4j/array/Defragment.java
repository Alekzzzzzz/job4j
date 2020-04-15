package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) {
                int point = index;
                int count = point;
               while (count < array.length - 1){
                   if(array[count +1] != null){
                       String s = array[point];
                       array[point]=array[count + 1];
                       array[count + 1]= s;
                       point++;
                   }else {
                       count++;
                   }

               }

            }
            System.out.print(array[index] + " ");
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
