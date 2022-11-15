package com.dh.playlistservice.model;

import java.util.List;

public class CatalogDTO {

    private String creationDate;
    private List<MovieDTO> movies;

    public CatalogDTO(String creationDate, List<MovieDTO> movies) {
        this.creationDate = creationDate;
        this.movies = movies;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public void setMovies(List<MovieDTO> movies) {
        this.movies = movies;
    }

    public List<MovieDTO> getMovies() {
        return movies;
    }
}
