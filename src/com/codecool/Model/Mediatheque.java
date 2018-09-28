package com.codecool.Model;

import java.util.ArrayList;

public class Mediatheque {
    private ArrayList<MediaItem> itemsList;
    private PersistenceDB persistence;

    public Mediatheque(PersistenceDB persistence) {
        this.persistence = persistence;
        this.itemsList = persistence.findAllItems();
    }

    public void saveItemsInDB(){
        persistence.saveList(itemsList);
    }

    public ArrayList<MediaItem> getItemsList() {
        return itemsList;
    }
}
