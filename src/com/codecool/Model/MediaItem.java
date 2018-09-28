package com.codecool.Model;

public abstract class MediaItem {
    private String title;
    private String author;
    private String releaseDate;
    Type type;

    MediaItem(String title, String author, String releaseDate) {
        this.title = title;
        this.author = author;
        this.releaseDate = releaseDate;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public void setType(Type type) {
        this.type = type;
    }



    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public Type getType() {
        return type;
    }
}
