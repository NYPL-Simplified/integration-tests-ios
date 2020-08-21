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

public class read_eBook extends iOSTest {
    private String reportDirectory = "reports";
    private String reportFormat = "xml";
    private String testName = "Readbook-08";
    protected AndroidDriver<AndroidElement> driver = null;

    DesiredCapabilities dc = new DesiredCapabilities();

    @BeforeEach
    public void setUp() throws MalformedURLException {
        dc.setCapability("reportDirectory", reportDirectory);
        dc.setCapability("reportFormat", reportFormat);
        dc.setCapability("testName", testName);
        dc.setCapability(MobileCapabilityType.UDID, "");
        driver = new AndroidDriver<>(new URL("http://localhost:4723/wd/hub"), dc);
        driver.setLogLevel(Level.INFO);
    }

    @Test
    public void testReadbook_08() {
        driver.findElement(By.xpath("//*[@id='Search']")).sendKeys("ebooks");
        new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@class='UIKBKeyplaneView']/*[@class='UIKBKeyView'])[7]")));
        driver.findElement(By.xpath("//*[@id='Search']")).click();
        driver.findElement(By.xpath("//*[@id='Read']")).click();
        driver.swipe(189, 626, 567, 626, 328);
        driver.swipe(170, 570, 706, 516, 279);
        driver.findElement(By.xpath("//*[@text='Back']")).click();
        driver.findElement(By.xpath("//*[@text='Back']")).click();
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}