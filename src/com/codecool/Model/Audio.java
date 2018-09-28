package com.codecool.Model;

import com.codecool.Model.Interfaces.Listenable;

public class Audio extends MediaItem implements Listenable {

    private long length;

    Audio(String title, String author, String releaseDate) {
        super(title, author, releaseDate);
        this.type = Type.AUDIO;
    }

    @Override
    public void listenTo() {

    }
}
