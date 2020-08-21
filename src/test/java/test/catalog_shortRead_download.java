package test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.By;
import org.junit.jupiter.api.*;
import java.net.URL;
import java.net.MalformedURLException;
import java.util.logging.Level;

public class catalog_shortRead_download extends iOSTest {
    private String reportDirectory = "reports";
    private String reportFormat = "xml";
    private String testName = "Catalog-ShortRead-DownloadB";

    @Test
    public void testCatalog_ShortRead_DownloadB() {
        driver.findElement(By.xpath("//*[@id='Then Came a Spider']")).click();
        new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='Get' and @class='UIAButton']")));
        driver.findElement(By.xpath("//*[@id='Get']")).click();
        new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='Read' and @class='UIAButton']")));
        driver.findElement(By.xpath("//*[@text='Read' and @class='UIAButton']")).click();
        driver.swipe(653, 683, 190, 707, 525);
        driver.swipe(646, 727, 198, 740, 1048);
        driver.swipe(69, 649, 556, 696, 426);
        driver.swipe(153, 510, 835, 569, 589);
        driver.swipe(326, 138, 318, 226, 591);
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}