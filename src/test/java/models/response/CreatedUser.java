package models.response;
import lombok.*;
import models.request.Book;

import java.util.List;

@AllArgsConstructor
@Builder
@Getter
@Setter
public class CreatedUser {
    //00c3df8d-12f5-4fa5-a034-1caa6fc7e129
    private String userId;
    private String username;
    private List<Book> books;
}
