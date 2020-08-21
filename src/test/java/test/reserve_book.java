package test;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class reserve_book extends iOSTest{

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

}
