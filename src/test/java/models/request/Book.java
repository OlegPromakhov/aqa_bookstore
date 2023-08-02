package models.request;

import lombok.*;

@AllArgsConstructor
@Builder
@Getter
@Setter
public class Book {
    private String isbn;
    private String title;
    private String subtitle;
    private String author;
    private String publisher;
// 9781449365035

}
