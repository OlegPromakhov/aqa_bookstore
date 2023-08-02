package api;
import retrofit2.Call;
import retrofit2.http.*;

import java.awt.print.Book;
import java.util.List;

public interface BookStoreClient {
    @GET("/BookStore/v1/Books")
    Call<List<Book>> getBooks();
    @GET("/BookStore/v1/Books")
    Call<List<Book>> getFilteredBooksByAuthor(
            @Query("author") String author
    );
    @POST("/BookStore/v1/Books")
    Call<Void> postBooksToUser(
            @Body String userId,
            @Body List<Book> collectionOfIsbns
    );
}
