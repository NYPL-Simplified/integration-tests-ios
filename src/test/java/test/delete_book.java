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

public class delete_book extends iOSTest {
    private String reportDirectory = "reports";
    private String reportFormat = "xml";
    private String testName = "DeleteSpecificbook-09";


    @Test
    public void testDeleteSpecificbook_09() {
         driver.findElement(By.xpath("//*[@class='_UIVisualEffectBackdropView' and @height>0 and ./parent::*[./parent::*[./parent::*[@class='UINavigationBar']]]]")).sendKeys("ebooks");
         new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@class='UIKBKeyplaneView']/*[@class='UIKBKeyView'])[7]")));
         driver.findElement(By.xpath("(//*[@class='UIKBKeyplaneView']/*[@class='UIKBKeyView'])[7]")).click();
         new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='Test-Driven Development: Extensive Tutorial']")));
         driver.findElement(By.xpath("//*[@text='Test-Driven Development: Extensive Tutorial']")).click();
        new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='Delete']")));
        driver.findElement(By.xpath("//*[@text='Delete']")).click();
        driver.findElement(By.xpath("//*[@id='Delete' and @class='UIAButton' and ./parent::*[(./preceding-sibling::* | ./following-sibling::*)[./*[@id='Cancel']]]]")).click();
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}