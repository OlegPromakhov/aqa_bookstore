package pages.profile;

import org.openqa.selenium.WebDriver;
import static pages.profile.ProfilePageLocators.*;

public class ProfilePage {
    private WebDriver driver;

    public ProfilePage(WebDriver driver) {
        this.driver = driver;
    }
    public void verifyProfilePageOpened() {
        assert driver.getCurrentUrl().contains("*/profile");
    }

    public String getBookAuthor() {
        String author = BOOK_AUTHOR.getText();
        return author;
    }

    public String getNumBooks() {
        String numberOfBooks = String.valueOf(BOOKLIST.getSize());
        return numberOfBooks;
    }
}
