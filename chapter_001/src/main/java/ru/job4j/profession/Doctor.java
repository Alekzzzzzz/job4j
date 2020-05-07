package ru.job4j.profession;


public class Doctor extends Profession {

private int age;
private String specific;

    public String getSpecific() {
        System.out.println(specific);
        return specific;
    }

    public void setSpecific(String specific) {
        this.specific = specific;
    }

    public int getAge() {
        System.out.println("мне " + age + " лет");
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void diagnozEyePain(Pacient pacient){
        Okulist okulist = new Okulist();
        if (pacient.isEyePain() == true) {
            System.out.println("Да действительно, Вам нужно к окулисту");
            System.out.println();
            okulist.lechitEyePain(pacient);
        } else {
            System.out.println("У вас все в порядке со зрением, но я могу позвать сюда окулиста");
            okulist.lechitEyePain(pacient);
        }

    }

    public void diagnozToothache(Pacient pacient) {
        Dantist dantist = new Dantist();
        if (pacient.isToothache() == true) {
            System.out.println("Да действительно, Вам нужно к дантисту");
            System.out.println();
            dantist.lechitToothache(pacient);
        } else {
            System.out.println("У вас все в порядке с зубами, но я могу позвать сюда дантиста");
            dantist.lechitToothache(pacient);
        }

    }

}

