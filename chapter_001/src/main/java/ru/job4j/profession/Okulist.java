package ru.job4j.profession;


public class Okulist extends Doctor {

    public boolean lechitEyePain(Pacient pacient){
        System.out.println("Здравствуйте я окулист что у Вас?");
        System.out.println();
        boolean result = true;
        if (pacient.isEyePain()){
            System.out.println("Давайте попробуем Вас вылечить");
            System.out.println();
            System.out.println("Мы Вас вылечили теперь вы снова хорошо видете");
            result = false;
        }else {
            System.out.println("У вас нет проблем с глазами вам нужен другой специалист");
        }

        return result;
    }


}
