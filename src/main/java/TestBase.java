import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import retrofit2.Retrofit;

public class TestBase {
    protected WebDriver driver;
    protected Retrofit retrofit;

    @BeforeMethod
    public void setup() {
        // Initialize WebDriver (e.g., ChromeDriver) and Retrofit instance
    }

    @AfterMethod
    public void afterMethod() {
        driver.quit();
    }

}
