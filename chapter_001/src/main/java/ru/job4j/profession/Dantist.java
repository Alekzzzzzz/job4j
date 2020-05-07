package ru.job4j.profession;


public class Dantist extends Doctor {


    public boolean lechitToothache(Pacient pacient){
        System.out.println("Здравствуйте я дантист что у Вас?");
        System.out.println();
        boolean result = true;
        if (pacient.isToothache()){
            System.out.println("Давайте попробуем вылечить ваши зубы");
            System.out.println();
            System.out.println("Мы вылечили ваши зубы, теперь ваши зубы здоровы");
            result = false;
        }else {
            System.out.println("У вас нет проблем с зубами вам нужен другой специалист");
        }

        return result;
    }

}
