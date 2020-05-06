package ru.job4j.profession;

import java.time.LocalDate;

public class Dentist extends Doctor {
    public Dentist(String name, String surname, String education, String birthday) {
        super(name, surname, education, birthday);
    }

    public boolean lechitToothache(Pacient pacient){
        boolean result = pacient.isToothache();
        if (pacient.isToothache() == true){
            result = false;
        }
        System.out.println("Отлично теперь ваши зубы впорядке");
        return result;
    }

    public static void main(String[] args) {
        Dentist dentist = new Dentist("Андрей","Прокофьев","Высшее","24.04.2000");
        Pacient pacient = new Pacient();
        dentist.lechitToothache(pacient);
        System.out.println();
    }
}
