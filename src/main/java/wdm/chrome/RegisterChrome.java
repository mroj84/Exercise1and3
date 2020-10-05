package wdm.chrome;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.grid.selenium.GridLauncherV3;

/**
 * Register a Chrome browser in the Selenium Hub.
 *
 * @author Boni Garcia (boni.gg@gmail.com)
 * @since 1.0.0
 */
public class RegisterChrome {

    public static void setupGridChrome(int port) {
            WebDriverManager.chromedriver().setup();
            GridLauncherV3.main(new String[]{"-role", "node", "-hub",
                    "http://localhost:4444/grid/register", "-browser",
                    "browserName=chrome", "-port", port + ""});
    }

}