package ru.job4j.array;
public class ArrayChar {
    /**
     *Метод для проверки что слово начинается с тех же букв
     */
    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
        for (int  i = 0; i < pref.length && i < word.length ;i++){
            if (word[i] != pref[i]){
                result = false;
                break;
            }
        }
        return result;
    }
}