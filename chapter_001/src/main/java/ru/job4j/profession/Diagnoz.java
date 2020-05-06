package ru.job4j.profession;

public class Diagnoz {

   private boolean healthy = false; // здоров
   private boolean  sick = true; // болен

    public boolean isHealthy() {
        System.out.println("Вы здоровы");
        return healthy;
    }

    public boolean getSick() {
        System.out.println("Вы больны");
        return sick;
    }
}
