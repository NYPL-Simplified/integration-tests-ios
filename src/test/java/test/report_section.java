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

public class report_section extends iOSTest {
    private String reportDirectory = "reports";
    private String reportFormat = "xml";
    private String testName = "Report-Section11-15";


    @Test
    public void testReport_Section11_15() {
        driver.findElement(By.xpath("//*[@id='Report a Problem']")).click();
        driver.findElement(By.xpath("//*[@id='Wrong Genre']")).click();
        // driver.findElement(By.xpath("//*[@text='Submit']")).click();
        driver.findElement(By.xpath("//*[@id='Report a Problem']")).click();
        driver.findElement(By.xpath("//*[@id='Wrong Author']")).click();
        driver.findElement(By.xpath("//*[@text='Submit']")).click();
        driver.findElement(By.xpath("//*[@id='Report a Problem']")).click();
        driver.findElement(By.xpath("//*[@id='Wrong/Mismatched Description']")).click();
        driver.findElement(By.xpath("//*[@text='Submit']")).click();
        driver.findElement(By.xpath("//*[@id='Report a Problem']")).click();
        driver.findElement(By.xpath("//*[@class='UIATable']")).click();
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}