package ru.job4j.profession;

import java.time.LocalDate;

// все неправильно
public class Okulist extends Doctor {
    public Okulist(String name, String surname, String education, String birthday) {
        super(name, surname, education, birthday);
    }

    public boolean lechitEyePain(Pacient pacient){
        boolean result = pacient.isEyePain();
        if (pacient.isEyePain() == true){
            result = false;
        }
        System.out.println("Отлично теперь вы снова хорошо видете");
        return result;
    }


}
