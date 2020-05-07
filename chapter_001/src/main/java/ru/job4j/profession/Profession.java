package ru.job4j.profession;


public class Profession {

    private String name;
    private String surname;
    private String education;
    private String birthday;

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getName() {
        System.out.println("Здравствуйте меня зовут " + name);
        return name;
    }

    public String getSurname() {
        System.out.println("Мая фамилия " + surname);
        return surname;
    }

    public String getEducation() {
        System.out.println("По специальности я " + education);
        return education;
    }

    public String getBirthday() {
        System.out.println("моя дата рождения " + birthday);
        return birthday;
    }

}
