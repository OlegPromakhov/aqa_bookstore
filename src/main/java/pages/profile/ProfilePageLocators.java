package pages.profile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProfilePageLocators {
    private static WebDriver driver;
    public static final WebElement BOOKLIST = driver.findElement(By.className("rt-tr-group"));
    public static final WebElement BOOK_AUTHOR = driver.findElement(By.cssSelector(".rt-td:nth-child(3)"));
}
