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
        for (int index = 0; index < position; index++) {
            Item item = items[index];
                items[position] = item;
        }
        return Arrays.copyOf(items, position);
    }

    public Item[] findByName(String key){
        for (int i = 0; i < position; i++) {
            Item item = items[i];
                if (key.equals(item.getName())){
                    items[position] = item;
                }
        }
        return Arrays.copyOf(items,position);
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