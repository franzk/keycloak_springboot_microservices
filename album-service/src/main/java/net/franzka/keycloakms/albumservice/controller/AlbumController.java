package net.franzka.keycloakms.albumservice.controller;

import net.franzka.keycloakms.albumservice.domain.Album;
import net.franzka.keycloakms.albumservice.service.AlbumService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/album")
public class AlbumController {

    private final AlbumService albumService;

    public AlbumController(AlbumService albumService) {
        this.albumService = albumService;
    }

    @GetMapping
    public ResponseEntity<List<Album>> getAll() {
        return ResponseEntity.ok(albumService.getAll());
    }

    @PostMapping
    public ResponseEntity<Album> add(@RequestBody Album album) {
        return ResponseEntity.ok(albumService.add(album));
    }

}
