package ru.job4j.profession;



public class Engineer extends Profession {

    private int money;

    public int getMoney() {
        return money = 200;
    }

    public void kupitNoviySait(){
        Programmer programmer = new Programmer();
        programmer.sozdatSait(money);
    }

    public void obslugitKlienta(Klient klient){
        Builder builder = new Builder();
        System.out.println("Здравствуйте что бы вы хотели");
        System.out.println("Мы можем предложить вам маленький дом он стоит 100");
        System.out.println("Мы можем предложить вам большой дом он стоит 200");
        System.out.println("Мы можем предложить вам супер дом он стоит 300");
        System.out.println("Выберите дом на который Вам хватает");
        klient.bigDom();
        if (klient.getMoney() >= 300 ){
           int sdacha = klient.getMoney() - 100;
            System.out.print("Отлично мы получили ваши деньги");
            System.out.println(" и начинаем строить ваш супер дом вот ваша сдача " + sdacha+" рублей");
            builder.stroitSuperDom();
        }else if (klient.getMoney() >= 200){
            System.out.println("Отлично мы начинаем строить ваш большой дом");
        }else if (klient.getMoney() >= 100){
            System.out.println("Отлично мы начинаем строить ваш маленький дом");
        }else {
            System.out.println("к сожалению Вам не хватает денег");
        }


    }

}
