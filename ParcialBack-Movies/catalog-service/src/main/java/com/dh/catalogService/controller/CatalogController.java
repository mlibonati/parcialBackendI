package com.dh.playlistservice.controller;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.dh.playlistservice.model.PlaylistDTO;
import com.dh.playlistservice.service.PlaylistService;

@RestController
@RequestMapping("/catalog")
public class CatalogController {

    private final CatalogService catalogService;



    @Autowired
    public CatalogController(CatalogService catalogService) {
        this.catalogService = catalogService;
    }

    @GetMapping("/{genre}")
    public ResponseEntity<?> findPlaylistByGenre(@PathVariable("genre") String genre) {
        PlaylistDTO playlistDTO = catalogService.findPlaylistByGenre(genre);
        return Objects.isNull(playlistDTO)
            ? new ResponseEntity<>(HttpStatus.NOT_FOUND)
            : new ResponseEntity<>(playlistDTO, HttpStatus.OK);
    }
}
