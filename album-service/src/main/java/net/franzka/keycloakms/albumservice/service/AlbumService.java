package net.franzka.keycloakms.albumservice.service;

import net.franzka.keycloakms.albumservice.domain.Album;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AlbumService {

    List<Album> getAll();

    Album add(Album album);

}
