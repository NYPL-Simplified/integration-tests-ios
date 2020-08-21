package test;

import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.SwipeElementDirection;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.By;
import org.junit.jupiter.api.*;
import java.net.URL;
import java.net.MalformedURLException;
import java.util.logging.Level;

public class browseLanes extends iOSTest {

    private String reportDirectory = "reports";
    private String reportFormat = "xml";
    private String testName = "browsliterary-fiction";

    @Test
    public void testbrowseLiterary() {
        driver.findElement(By.xpath("//*[@accessibilityLabel='Fiction']")).click();
        driver.swipe(436, 744, 409, 507, 810);
        driver.swipe(356, 512, 407, 843, 515);
        driver.swipe(436, 744, 409, 507, 810);
        driver.swipe(356, 512, 407, 843, 515);
        driver.findElement(By.xpath("//*[@accessibilityLabel='Literary Fiction']")).click();
        driver.swipe(487, 993, 446, 620, 977);
        driver.swipe(444, 623, 515, 1270, 1059);
    }

    @Test
    public void testbrowseLane() {
        driver.swipe(478, 1120, 395, 641, 1706);
        driver.findElement(By.xpath("//*[@accessibilityLabel='Fiction']")).click();
        driver.swipe(392, 981, 327, 472, 2275);
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}