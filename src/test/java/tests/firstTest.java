package tests;

import models.request.Book;
import api.BookStoreClient;
import models.request.User;
import api.UserClient;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.login.LoginPage;
import pages.profile.ProfilePage;


public class firstTest extends TestBase {
    private WebDriver driver;
        @Test
        public void testLoginFlow() {
            String author = "Axel Rauschmayer";
            // Create user via API
            User user = new User();
            UserClient userService = new UserClient();
            userService.createUser(user);
            userService.generateUserToken(user);
            BookStoreClient bookStoreService = new BookStoreClient()
            Book book = new Book();
            book = bookStoreService.getFilteredBooks(author);
            bookStoreService.postBooksToUser(user.getUserId(), book.getIsbn().get(0));

            // Perform UI login using Selenium
            LoginPage loginPage = new LoginPage(driver);
            loginPage.openLoginPage();
            loginPage.inputUsername(user.getUsername());
            loginPage.inputPassword(user.getPassword());
            loginPage.clickLoginBtn();
            ProfilePage profilePage = new ProfilePage(driver);
            profilePage.verifyProfilePageOpened();
            String displayedAuthor = profilePage.getBookAuthor();
            String actualNumBooks = profilePage.getNumBooks();
            Assert.assertEquals(displayedAuthor, author);
            Assert.assertEquals(actualNumBooks, "1");
        }
}
