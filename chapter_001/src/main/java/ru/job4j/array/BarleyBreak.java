package ru.job4j.array;

public class BarleyBreak {
    public static void main(String[] args) {
        int [][] array = new int [3][3]; // создаем двойной массив
        int count = 1; // создаем переменную которую будем увеличивать
        for (int i = 0; i < array.length;i++ ){// большой цикл
            for (int j = 0; j < array.length; j++ ) { // внутренний цикл
                array[i][j] = count; // приравниваем массив к переменной count
                count++; // увеличиваем count на 1 с каждым проходом цикла
                System.out.println(array[i][j]); // выводим массив
            }
        }
    }
}
