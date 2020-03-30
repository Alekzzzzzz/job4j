package ru.job4j.loop;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] masiv = new int [100];
        for (int i = 0; i  < masiv.length;i++){
            masiv[i] = i + 1;
            System.out.println(masiv[i]);
        }
    }
}

