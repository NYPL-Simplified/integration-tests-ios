package test;

//package <set your test package>;
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

public class return_remove extends iOSTest {
    private String reportDirectory = "reports";
    private String reportFormat = "xml";
    private String testName = "ViewBookDetails-23T027";
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
    public void testRemove() {
        driver.findElement(By.xpath("//*[@id='Nonfiction']")).click();
        driver.findElement(By.xpath("//*[@id='Science & Technology']")).click();
        new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='The Geeks & The Girls']")));
        driver.findElement(By.xpath("//*[@text='The Geeks & The Girls']")).click();
        driver.findElement(By.xpath("//*[@id='More…']")).click();
        driver.swipe(532, 1047, 496, 672, 779);
        driver.swipe(486, 604, 509, 736, 464);
        driver.findElement(By.xpath("//*[@id='Get']")).click();
        driver.findElement(By.xpath("//*[@id='Cancel']")).click();
        driver.findElement(By.xpath("//*[@text='Download']")).click();
        driver.findElement(By.xpath("//*[@id='Back']")).click();
        driver.findElement(By.xpath("//*[@text='Delete']")).click();
        driver.findElement(By.xpath("//*[@id='Delete' and @class='UIAButton' and ./parent::*[(./preceding-sibling::* | ./following-sibling::*)[./*[@id='Cancel']]]]")).click();
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}