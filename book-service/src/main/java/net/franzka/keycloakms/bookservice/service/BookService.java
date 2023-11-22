package net.franzka.keycloakms.bookservice.service;

import net.franzka.keycloakms.bookservice.domain.Book;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BookService {

    List<Book> getAll();

    Book add(Book book);

}
