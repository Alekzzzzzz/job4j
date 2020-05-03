package ru.job4j.loop;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] a = new int [10];
        for (int i = 0;i < a.length-1; i++){
            a[i] = i + 1 ;
            System.out.println(a[i]);
        }
    }
}
