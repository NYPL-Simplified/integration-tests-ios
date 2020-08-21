package test;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.SwipeElementDirection;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.By;
import org.junit.jupiter.api.*;
import java.net.URL;
import java.net.MalformedURLException;
import java.util.logging.Level;

public class browseliterary_fiction_sortBy  extends iOSTest {
    private String reportDirectory = "reports";
    private String reportFormat = "xml";
    private String testName = "browsliterary-fiction-sortBy";


    @Test
    public void testbrowsliterary_fiction_sortBy() {
        driver.findElement(By.xpath("//*[@accessibilityLabel='Fiction']")).click();
        new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@accessibilityLabel='Literary Fiction']")));
        driver.findElement(By.xpath("//*[@accessibilityLabel='Literary Fiction']")).click();
        driver.swipe(556, 896, 469, 515, 886);
        driver.swipe(415, 355, 467, 903, 700);
        driver.findElement(By.xpath("//*[@text='Author']")).click();
        driver.findElement(By.xpath("//*[@text='Title']")).click();
        driver.swipe(472, 944, 436, 353, 787);
        driver.swipe(404, 363, 389, 1070, 714);
        driver.findElement(By.xpath("//*[@text='Back']")).click();
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}