package test;
//package <set your test package>;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.SwipeElementDirection;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.junit.jupiter.api.*;
import java.net.URL;
import java.net.MalformedURLException;
import java.util.logging.Level;

public class verify_description extends iOSTest {
    private String reportDirectory = "reports";
    private String reportFormat = "xml";
    private String testName = "CheckInfoSpecificbook-10";


    @Test
    public void testCheckInfoSpecificbook_10() {
        driver.swipe(478, 960, 466, 818, 583);
        driver.swipe(469, 760, 500, 1029, 368);
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}