package ru.job4j.profession;

public class Builder extends Engineer {

private String kirpichi;

    public String getKirpichi() {
        System.out.println(kirpichi);
        return kirpichi;
    }

    public void setKirpichi(String kirpichi) {
        this.kirpichi = kirpichi;
    }

    public String stroitMalenkiyDom(){
        setKirpichi("Ваш Маленький дом готов");
        return getKirpichi();
    }

    public String stroitBolshoyDom(){
        setKirpichi("Ваш Большой дом готов");
        return getKirpichi();
    }

    public String stroitSuperDom(){
       setKirpichi("Ваш Супер дом готов");
       return getKirpichi();
    }
}
