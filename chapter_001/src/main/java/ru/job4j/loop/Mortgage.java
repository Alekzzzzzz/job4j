package ru.job4j.loop;

public class Mortgage {
    public int year(int amount, int monhly,double percent){
        int year = 0;
        while (year < 1){// Сейчас year = 0 значит проходим по телу цикла
            year = (int) ((amount / 100 * percent) + amount);// преоброзовали year чтобы можно было работать с типом double
            year = year / monhly / 12;// полученый результат разделили на ежемесячный платеж и затем на 12 месяцев
            year += 1;// присваеваем year единицу так как в задании если меньше 12 месяцев то пишем 1 год


         }
        return  year;
    }
}
