package org.example.books;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class BookService {
    private List<Book> books = new ArrayList<>();

    public List<Book> findAll() {
        return books;
    }

    public Book getBookById(int id) {
        return books.stream().filter(book -> book.id() == id).findFirst().orElseThrow(BookNotFoundException::new);
    }

    @PostConstruct
    private void loadBooks() {
        Book one = new Book(1,
                "Book number one",
                "First author",
                "123456789");
        Book two = new Book(2,
                "Book number tho",
                "Second author",
                "234567891");
        Book three = new Book(3,
                "Book number three",
                "Third author",
                "345678912");

        books.addAll(Arrays.asList(one, two, three));
    }
}
