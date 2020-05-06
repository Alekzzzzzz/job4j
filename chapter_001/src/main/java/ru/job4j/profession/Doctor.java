package ru.job4j.profession;

import java.time.LocalDate;

public class Doctor extends Profession {


    public Doctor(String name, String surname, String education, String birthday) {
        super(name, surname, education, birthday);
    }
    public  void diagnozEyePain(Pacient pacient){
        Diagnoz diagnoz = new Diagnoz();
        if (pacient.isEyePain() == true){
            diagnoz.getSick();
            System.out.println("Вам нужно к окулисту");
        }else {
            System.out.println("Да вы здоровы");
            diagnoz.isHealthy();
        }

    }

    public void diagnozToothache(Pacient pacient){
        Diagnoz diagnoz = new Diagnoz();
        if(pacient.isToothache() == true){
            diagnoz.getSick();
            System.out.println("Вам нужно к дантисту");
        }
        else {
            diagnoz.isHealthy();
        }

    }

    public static void main(String[] args) {
        Doctor doctor = new Doctor("sfs","dasda","dada","dad");
        Pacient pacient = new Pacient();
        doctor.diagnozEyePain(pacient);
    }

}

