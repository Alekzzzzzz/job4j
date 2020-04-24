package ru.job4j.loop;


import java.sql.SQLOutput;
import java.util.Arrays;

public  class Main {

    public static void main(String[] args) {
        int i,j,n = 3,count = 1;

        int [][] nums = new int [n][n];
        for (i = 0; i < n  ; i++){
            for (j = 0; j < n; j++){
                nums[i][j] = count;
                count++;
                System.out.print(nums[i][j]+" ");

            }

        }
    }

}

