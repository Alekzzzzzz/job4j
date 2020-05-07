package ru.job4j.profession;

public class Programmer extends Engineer {

    private int money;

    public int getMoney() {
        return money = 500;
    }

    public void sozdatSait(int money){
        System.out.println("С вас 50 рублй");
        Engineer engineer = new Engineer();
        int sdacha = engineer.getMoney() - 50;
        System.out.println("Отлично ваш сайт готов вот ваша сдача " + sdacha);
    }

}
