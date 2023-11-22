package net.franzka.keycloakms.albumservice.service.impl;

import net.franzka.keycloakms.albumservice.domain.Album;
import net.franzka.keycloakms.albumservice.repository.AlbumRepository;
import net.franzka.keycloakms.albumservice.service.AlbumService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlbumServiceImpl implements AlbumService {

    private final AlbumRepository albumRepository;

    public AlbumServiceImpl(AlbumRepository albumRepository) {
        this.albumRepository = albumRepository;
    }

    @Override
    public List<Album> getAll() {
        return albumRepository.findAll();
    }

    @Override
    public Album add(Album album) {
        return albumRepository.saveAndFlush(album);
    }
}
