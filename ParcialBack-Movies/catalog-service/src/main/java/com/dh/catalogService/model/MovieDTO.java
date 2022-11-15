package com.dh.playlistservice.model;

public class MovieDTO {

    private Integer id;
    private String name;
    private String genre;
    private String urlStream;

    public void setName(String name) {
        this.name = name;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setUrlStream(String urlStream) {
        this.urlStream = urlStream;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGenre() {
        return genre;
    }

    public String getUrlStream() {
        return urlStream;
    }

    public MovieDTO(Integer id, String name, String genre, String urlStream) {
        this.id = id;
        this.name = name;
        this.genre = genre;
        this.urlStream = urlStream;
    }

    public MovieDTO() {
        //No-args constructor
    }


}
