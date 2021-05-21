package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item findById(int id) {
        Item rsl = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }

    public Item[] findByName(String key) {
        Item[] res = new Item[items.length];
        int count = 0;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getName().equals(key)) {
                items[count] = item;
                count++;
            }
        }
        return Arrays.copyOf(res,count);
    }

    public Item[] findAll() {
        return Arrays.copyOf(items,size);
    }

    public boolean replace(Item item,String id){
        boolean replaced = false;
        for (int i = 0;i<items.length;i++){
            if (items[i].equals(id)){
                items[i]=item;
                replaced=true;

            }

        }return replaced;
    }

    public boolean delete(int id){
        boolean deleted = false;
        System.arraycopy(items,id+1,items,id,items.length-1-id);
        deleted = true;
        return deleted;
    }
}
