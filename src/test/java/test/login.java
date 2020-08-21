package test;

//package <set your test package>;
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

public class login extends iOSTest {
    private String reportDirectory = "reports";
    private String reportFormat = "xml";
    private String testName = "SignInScreen-29To33";
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
    public void testSignInScreen() {
        new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@placeholder='Barcode or Username']")));
        driver.findElement(By.xpath("//*[@id='Log In']")).sendKeys("");
        driver.findElement(By.xpath("//*[@placeholder='Barcode or Username']")).sendKeys("fahad");
        new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@placeholder='PIN']")));
        driver.findElement(By.xpath("//*[@placeholder='PIN']")).click();
        driver.findElement(By.xpath("//*[@placeholder='PIN']")).sendKeys("k12");
        driver.findElement(By.xpath("//*[@id='Log In']")).click();
        driver.findElement(By.xpath("//*[@id='OK']")).click();
        new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='Log In']")));
        driver.findElement(By.xpath("//*[@id='Show']")).click();
        driver.findElement(By.xpath("//*[@text='Cancel' and ./parent::*[./parent::*[./parent::*[./parent::*[./parent::*[./parent::*[./parent::*[./parent::*[./parent::*[./parent::*[./parent::*[./parent::*[./parent::*[./parent::*[./parent::*[./parent::*[./parent::*[./parent::*[@class='UIAView']]]]]]]]]]]]]]]]]]]")).click();
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}