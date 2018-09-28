package com.codecool.Model;

import com.codecool.Model.Interfaces.Watchable;

public class Video extends MediaItem implements Watchable {

    private long time;

    public Video(String title, String author, String releaseDate) {
        super(title, author, releaseDate);
        this.type = Type.VIDEO;
    }

    @Override
    public void watch() {

    }
}
