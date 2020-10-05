import enums.DriverType;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import org.openqa.selenium.By;

import static org.assertj.core.api.Assertions.assertThat;

@Tag("regression")
@Execution(ExecutionMode.CONCURRENT)
class ParallelConfigTest extends BaseTestTemplate {

    @Test
    void userRegistration(){
        driver = manager.getDriver(DriverType.FIREFOX);
        driver.get("http://automationpractice.com/index.php");
        assertThat(driver.findElements(By.id("header_logo")).size() > 0);
    }

    @Test
    void userRegistration1(){
        driver = manager.getDriver(DriverType.FIREFOX);
        driver.get("http://automationpractice.com/index.php");
        assertThat(driver.findElements(By.id("header_logo")).size() > 0);
    }

    @Test
    void userRegistration2(){
        driver = manager.getDriver(DriverType.FIREFOX);
        driver.get("http://automationpractice.com/index.php");
        assertThat(driver.findElements(By.id("header_logo")).size() > 0);
    }

    @Test
    void userRegistration3(){
        driver = manager.getDriver(DriverType.FIREFOX);
        driver.get("http://automationpractice.com/index.php");
        assertThat(driver.findElements(By.id("header_logo")).size() > 0);
    }

    @Test
    void userRegistration4(){
        driver = manager.getDriver(DriverType.FIREFOX);
        driver.get("http://automationpractice.com/index.php");
        assertThat(driver.findElements(By.id("header_logo")).size() > 0);
    }

    @Test
    void userRegistration5(){
        driver = manager.getDriver(DriverType.FIREFOX);
        driver.get("http://automationpractice.com/index.php");
        assertThat(driver.findElements(By.id("header_logo")).size() > 0);
    }

    @Test
    void userRegistration6(){
        driver = manager.getDriver(DriverType.FIREFOX);
        driver.get("http://automationpractice.com/index.php");
        assertThat(driver.findElements(By.id("header_logo")).size() > 0);
    }
    @Test
    void userRegistration7(){
        driver = manager.getDriver(DriverType.FIREFOX);
        driver.get("http://automationpractice.com/index.php");
        assertThat(driver.findElements(By.id("header_logo")).size() > 0);
    }

    @Test
    void userRegistration8(){
        driver = manager.getDriver(DriverType.FIREFOX);
        driver.get("http://automationpractice.com/index.php");
        assertThat(driver.findElements(By.id("header_logo")).size() > 0);
    }

    @Test
    void userRegistration9(){
        driver = manager.getDriver(DriverType.FIREFOX);
        driver.get("http://automationpractice.com/index.php");
        assertThat(driver.findElements(By.id("header_logo")).size() > 0);
    }

    @Test
    void userRegistration10(){
        driver = manager.getDriver(DriverType.FIREFOX);
        driver.get("http://automationpractice.com/index.php");
        assertThat(driver.findElements(By.id("header_logo")).size() > 0);
    }

    @Test
    void userRegistration11(){
        driver = manager.getDriver(DriverType.FIREFOX);
        driver.get("http://automationpractice.com/index.php");
        assertThat(driver.findElements(By.id("header_logo")).size() > 0);
    }

    @Test
    void userRegistration12(){
        driver = manager.getDriver(DriverType.FIREFOX);
        driver.get("http://automationpractice.com/index.php");
        assertThat(driver.findElements(By.id("header_logo")).size() > 0);
    }
}
