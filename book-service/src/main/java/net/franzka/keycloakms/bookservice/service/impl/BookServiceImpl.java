package net.franzka.keycloakms.bookservice.service.impl;

import net.franzka.keycloakms.bookservice.domain.Book;
import net.franzka.keycloakms.bookservice.repository.BookRepository;
import net.franzka.keycloakms.bookservice.service.BookService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public List<Book> getAll() {
        return bookRepository.findAll();
    }

    @Override
    public Book add(Book book) {
        return bookRepository.saveAndFlush(book);
    }
}
