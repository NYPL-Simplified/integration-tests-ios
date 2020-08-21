package test;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.By;
import org.junit.jupiter.api.*;
import java.net.URL;
import java.net.MalformedURLException;
import java.util.logging.Level;

public class browseAudiobooks {
    private String reportDirectory = "reports";
    private String reportFormat = "xml";
    private String testName = "browseAudiobooks-06";
    protected AndroidDriver<AndroidElement> driver = null;


    @Test
    public void testbrowseAudiobooks_06() {
        driver.findElement(By.xpath("//*[@id='Search']")).sendKeys("audiobooks");
        new WebDriverWait(driver, 3).until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@class='UIKBKeyplaneView']/*[@class='UIKBKeyView'])[7]")));
        driver.findElement(By.xpath("//*[@id='Search']")).click();
        driver.findElement(By.xpath("//*[@text='Back']")).click();
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}