package test;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class iOSTest {

    public IOSDriver<IOSElement> driver;

    @BeforeSuite
    public void setupAppium() throws MalformedURLException {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "13.1");
        capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "Safari");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone Simulator");
        capabilities.setCapability(MobileCapabilityType.APP, "/Users/tazrian/Documents/ios-regression/build/Release-iphonesimulator/ios-regression.app");
        capabilities.setCapability(MobileCapabilityType.NO_RESET, true);

        driver = new IOSDriver<IOSElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }

    @AfterSuite
    public void uninstallApp() throws InterruptedException {
//            driver.removeApp("com.bzytan.appiumeveryday");
    }

    @Test
    public void test() throws InterruptedException {
        driver.navigate().to("https://www.facebook.com/");
    }
}
