package com.codecool.Model;

import java.util.ArrayList;

public class User {
    private long id;
    private Mediatheque mediatheque;

    public User(long id, Mediatheque mediatheque) {
        this.id = id;
        this.mediatheque = mediatheque;
    }

    public MediaItem searchItem(String title){

        return null;
    }

    public MediaItem viewItem(MediaItem item){

        return null;
    }

    public void rentItem(MediaItem mediaItem){

    }

    public void returnItem(MediaItem mediaItem){

    }
}
