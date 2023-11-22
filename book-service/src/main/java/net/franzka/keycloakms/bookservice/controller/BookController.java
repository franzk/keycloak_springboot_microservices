package net.franzka.keycloakms.bookservice.controller;

import net.franzka.keycloakms.bookservice.domain.Book;
import net.franzka.keycloakms.bookservice.service.BookService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    public ResponseEntity<List<Book>> gretAll() {
        return ResponseEntity.ok(bookService.getAll());
    }

    @PostMapping
    public ResponseEntity<Book> add(@RequestBody Book book) {
        return ResponseEntity.ok(bookService.add(book));
    }

}
