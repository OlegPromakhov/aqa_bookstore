package models.response;

import java.util.ArrayList;
import java.util.List;
import models.request.Book;

public class BookStoreResponse {

    List<Book> books;
    public BookStoreResponse() {
        books = new ArrayList<>();
    }
}
