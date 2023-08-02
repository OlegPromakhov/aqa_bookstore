package pages.login;

import org.openqa.selenium.WebDriver;

import static pages.login.LoginPageLocators.*;

public class LoginPage {

    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    public void openLoginPage() {
        driver.get("${baseUrl}/login");
    }
    public void inputUsername(String user) {
        USERNAME.sendKeys(user);
    }

    public void inputPassword(String pass) {
        PASSWORD.sendKeys(pass);
    }

    public void clickLoginBtn() {
        LOGIN_BTN.click();
    }
}


