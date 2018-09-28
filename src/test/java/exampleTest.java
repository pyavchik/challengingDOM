import io.trueautomation.client.driver.TrueAutomationDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static io.trueautomation.client.TrueAutomationHelper.*;

public class exampleTest {
    private WebDriver driver;
    private By fooBtn = byTa(   "fooBtn");


    @BeforeTest
    public void beforeTest() {
        driver = new TrueAutomationDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @Test
    public void exampleTest() throws InterruptedException {
        driver.get("http://the-internet.herokuapp.com/challenging_dom");

        driver.findElement(fooBtn).click();

        Thread.sleep(7000);
    }

    @AfterTest
    public void afterTest() {
        driver.quit();
    }
}
