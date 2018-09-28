package com.codecool.Model;

import com.codecool.Model.Interfaces.Readable;

public class Text extends MediaItem implements Readable {

    private long length;

    Text(String title, String author, String releaseDate) {
        super(title, author, releaseDate);
        this.type = Type.TEXT;
    }

    @Override
    public void read() {

    }
}
