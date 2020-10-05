package wdm.firefox;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.grid.selenium.GridLauncherV3;

/**
 * Register a Chrome browser in the Selenium Hub.
 *
 * @author Boni Garcia (boni.gg@gmail.com)
 * @since 1.0.0
 */
public class RegisterFirefox {

    public static void setupGridFirefox(int port) {
            WebDriverManager.firefoxdriver().setup();
            GridLauncherV3.main(new String[]{"-role", "node", "-hub",
                    "http://localhost:4444/grid/register", "-browser",
                    "browserName=firefox", "-port", port + ""});
    }

}