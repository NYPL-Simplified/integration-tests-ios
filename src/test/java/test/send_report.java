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

public class send_report extends iOSTest{
    private String reportDirectory = "reports";
    private String reportFormat = "xml";
    private String testName = "Report&Problem-Other-16To20";
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
    public void testReport_Problem_Other_16To20() {
        // driver.findElement(By.xpath("//*[@class='_UIVisualEffectBackdropView' and @height>0 and ./parent::*[./parent::*[./parent::*[@class='UINavigationBar']]]]")).sendKeys("ebooks");
        // driver.executeScript("seetest:client.deviceAction(\"Enter\")");
        // driver.findElement(By.xpath("((//*[@class='UICollectionView']/*/*[@class='UIView' and ./parent::*[@class='NYPLBookNormalCell']])[2]/*[@class='UIImageView' and @width>0])[1]")).click();
        // driver.swipe(372, 909, 349, 752, 749);

    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}