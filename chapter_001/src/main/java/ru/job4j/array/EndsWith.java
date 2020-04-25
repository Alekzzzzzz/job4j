package ru.job4j.array;

public class EndsWith {
    /**
     * Метод для проверки одинакового окончания значений в элементах массива
     *
     * @param word
     * @param post
     * @return
     */
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        for (int i = word.length - 1; i > post.length; i--){
            if (word[i] != post[i - (word.length - post.length)]){
                result = false;
                break;
            }
        }
        return result;
    }
}