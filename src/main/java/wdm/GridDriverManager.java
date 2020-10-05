package wdm;

import enums.DriverType;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class GridDriverManager {

    private final String GRID_HUB_URL = "http:localhost:4444/wd/hub";

    public WebDriver getDriver(DriverType type) {
        //Temp fix for: java.lang.RuntimeException: java.net.BindException: Address already in use: bind
        if (type.equals(DriverType.FIREFOX)) {
            WebDriver driver = null;
            try {
                driver = new RemoteWebDriver(new URL(GRID_HUB_URL), DesiredCapabilities.chrome());
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
            return driver;
        }

        if (type.equals(DriverType.FIREFOX)) {
            WebDriver driver = null;
            try {
                driver = new RemoteWebDriver(new URL(GRID_HUB_URL), DesiredCapabilities.firefox());
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
            return driver;
        }
        throw new InvalidArgumentException("Driver " + type + " is not supported");
    }
}
