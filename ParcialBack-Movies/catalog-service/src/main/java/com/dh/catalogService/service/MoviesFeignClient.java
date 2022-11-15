package com.dh.playlistservice.service;

import java.util.List;

import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.dh.playlistservice.config.FeignConfiguration;
import com.dh.playlistservice.model.MusicDTO;

@FeignClient(name = "movie-service")
@LoadBalancerClient(name = "movie-service", configuration = FeignConfiguration.class)
public interface MusicFeignClient {

    @GetMapping("/movies/{genre}")
    ResponseEntity<List<MusicDTO>> findMusicByGenre(@PathVariable("genre") String genre);
}
