package com.company;

public class Song {
    private String name;
    private String author;
    private boolean isPopular;

    public Song(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public Song(String name, String author, boolean isPopular) {
        this.name = name;
        this.author = author;
        this.isPopular = isPopular;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public boolean getPopularityStatus() {
        return isPopular;
    }

    public void setPopularityStatus(boolean status) {
        isPopular = status;
    }

    public void printSong() {
        String popular = isPopular ? "yes" : "no";
        String message = String.format("Song name: %s\nAuthor: %s\nPopular: %s", name, author, popular);
        System.out.println(message);
    }

    public static void main(String[] args) {

    }
}
