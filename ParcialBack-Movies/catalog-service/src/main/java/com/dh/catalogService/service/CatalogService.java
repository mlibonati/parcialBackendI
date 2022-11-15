package com.dh.playlistservice.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.dh.playlistservice.model.MusicDTO;
import com.dh.playlistservice.model.PlaylistDTO;

@Service
public class CatalogService {

    private MoviesFeignClient moviesFeignClient;
    @Autowire
    public CatalogService(MoviesFeignClient moviesFeignClient) {
        this.moviesFeignClient = moviesFeignClient;
    }

    public PlaylistDTO findPlaylistByGenre(String genre) {
        ResponseEntity<List<MusicDTO>> musicResponse = moviesFeignClient.findMusicByGenre(genre);
        if (musicResponse.getStatusCode().is2xxSuccessful())
            return new PlaylistDTO(LocalDate.now().toString(), musicResponse.getBody());
        return null;
    }
}
