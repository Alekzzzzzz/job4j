package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Random;

public class Tracker {
    /**
     * Массив для хранения заявок.
     */
    private final Item[] items = new Item[100];

    /**
     * Указатель ячейки для новой заявки.
     */
    private int position = 0;

    /**
     * Метод добавления заявки в хранилище
     * @param item новая заявка
     */
    public Item add(Item item) {
        item.setId(generateId());
        items[position++] = item;
        return item;
    }

    public Item[] findAll(){
        Item[] namesWithoutNull = new Item[items.length];
        int size = 0;
        for (int index = 0; index < items.length; index++) {
            Item item = items[index];
            if (item != null) {
                namesWithoutNull[size] = item;
                size++;
            }

        }
        namesWithoutNull = Arrays.copyOf(namesWithoutNull, size);
        return namesWithoutNull;
    }

    public Item[] findByName(String key){
        int size = 0;
        Item [] newArray = new Item[items.length];
        for (int i = 0; i < items.length; i++) {
            Item item = items[i];
            if (item != null){
                if (key.equals(item.getName())){
                    newArray[size] = item;
                    size++;
                }
            }
        }
        newArray = Arrays.copyOf(newArray,size);
        return newArray;
    }

    public Item  findById(String id){
        for (int i = 0; i < items.length; i++){
            Item currentItem = items[i];
            if (currentItem != null){
                if (currentItem.getId().equals(id)){
                    return currentItem;
                }
            }
        }
        return null;
    }

    /**
     * Метод генерирует уникальный ключ для заявки.
     * Так как у заявки нет уникальности полей, имени и описание. Для идентификации нам нужен уникальный ключ.
     * @return Уникальный ключ.
     */
    private String generateId() {
        //Реализовать метод генерации.
        Random rm = new Random();
        return String.valueOf(rm.nextLong()) + System.currentTimeMillis();
    }
}