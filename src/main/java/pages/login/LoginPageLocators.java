package pages.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageLocators {
    private static WebDriver driver;
    public static final WebElement USERNAME = driver.findElement(By.id("userName"));
    public static final WebElement PASSWORD = driver.findElement(By.id("password"));
    public static final WebElement LOGIN_BTN = driver.findElement(By.id("login"));
}
