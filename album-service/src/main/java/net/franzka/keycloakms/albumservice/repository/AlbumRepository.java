package net.franzka.keycloakms.albumservice.repository;

import net.franzka.keycloakms.albumservice.domain.Album;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlbumRepository extends JpaRepository<Album, Integer> {
}
