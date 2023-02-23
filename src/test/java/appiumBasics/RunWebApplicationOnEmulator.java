package appiumBasics;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class RunWebApplicationOnEmulator {
    @Test
    public void OpenWebApplication() throws MalformedURLException {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");

        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "MODY");

       capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"com.mnasat.nashmi.presentation.splash.SplashActivity");
        capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"com.mnasat.nashmi");

       AndroidDriver <AndroidElement>  driver  = new AndroidDriver <AndroidElement>(new URL ("http://127.0.0.1:4723/wd/hub") , capabilities);
       //driver.manage().timeouts().implicitlyWait(120 , TimeUnit.SECONDS);
       //driver.findElement(By.id("/tvSkip")).click();
        WebDriverWait wait = new WebDriverWait (driver, 120);
        wait.until (ExpectedConditions.visibilityOfElementLocated (By.id ("tvSkip")));
       driver.findElement(By.id("com.mnasat.nashmi:id/tvCountryCodeNumber")).click();
       driver.findElement(By.className("android.widget.TextView")).click();
       driver.findElement(By.id("com.mnasat.nashmi:id/etCurrentNumber")).sendKeys("01271022279");
       driver.findElement(By.id("com.mnasat.nashmi:id/btn_continue")).click();




    }
}
