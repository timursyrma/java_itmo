package org.example.books;


import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import java.util.List;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(BooksController.class)
public class BookControllerTest {

    @Autowired
    MockMvc mvc;

    @MockBean
    BookService bookService;

    @Test
    public void findAllShouldReturnAllBooks() throws Exception {
        // Arrange
        Mockito.when(this.bookService.findAll()).thenReturn(getBooks());

        // Act
        mvc.perform(get("/books"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.length()").value(3));

    }

    @Test
    void findOneShouldReturValidBook() throws Exception {
        Mockito.when(this.bookService.getBookById(1)).thenReturn(getBooks().get(1));

        mvc.perform(get("/books/1"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.id").value(1))
                .andExpect(jsonPath("$.name").value("Book number one"))
                .andExpect(jsonPath("$.author").value("First author"))
                .andExpect(jsonPath("$.serial").value("123456789"));

    }


    private List<Book> getBooks() {
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

        return List.of(one, two, three);
    }
}
