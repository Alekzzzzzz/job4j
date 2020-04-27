package ru.job4j.loop;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int massiv [][]= new int [3][3];
        int count = 0;
        for (int i = 0; i != 3; i++){
        for (int j = 0; j != 3; j++){
            massiv[i][j]= count++;
        }

        }   for (int index = 0; index != 3 ; index++){
            System.out.println(Arrays.toString(massiv[index]));
        }

    }
}
