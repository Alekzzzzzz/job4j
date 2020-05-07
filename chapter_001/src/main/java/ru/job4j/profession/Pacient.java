package ru.job4j.profession;

public class Pacient {
    private boolean isToothache;
    private boolean isEyePain;

    public boolean isToothache() {
        boolean isToothache = this.isToothache;
        System.out.println("У меня болят зубы");
        System.out.println();
        return isToothache = true;
    }

    public boolean isEyePain() {
        boolean isEyePain = this.isEyePain;
        System.out.println("У меня что то с глазами");
        System.out.println();
        return isEyePain = true;

    }


}
