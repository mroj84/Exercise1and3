import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.openqa.selenium.WebDriver;
import wdm.GridDriverManager;

public class BaseTestTemplate {
    WebDriver driver;

    GridDriverManager manager = new GridDriverManager();

    @AfterEach
    public void cleanup(){
        if (driver!=null)
        driver.quit();
    }

    @AfterAll
    public static void tearDown(){
    }
}
