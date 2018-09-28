package com.codecool.Model;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    private PersistenceDB persistence = new PersistenceDB();
    private Mediatheque mediatheque = new Mediatheque(persistence);
    private User user = new User(1000, mediatheque);
    private Manager manager = new Manager(2000, mediatheque);



    @Test
    void searchItem() {
        MediaItem mediaItem = user.searchItem("Great Book");
        assertEquals(mediatheque.getItemsList().get(0), mediaItem);

    }

    @Test
    void viewItem() {
    }
}