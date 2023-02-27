package appiumBasics;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class RunWebApplicationOnEmulator {
    @Test
    public void OpenWebApplication() throws MalformedURLException {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        //capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        //capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "MODY");
       capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"com.mnasat.nashmi.presentation.authentication.loginandsignup.UserLoginAndSignupActivity");
        capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"com.mnasat.nashmi");
        //capabilities.setCapability(MobileCapabilityType.APP, "C:\\Users\\Mody\\IdeaProjects\\appiumProject\\shgardi_User_v4.7.apk");
        //capabilities.setCapability(AndroidMobileCapabilityType.);
        //WebDriverManager.chromedriver().setup();
        //capabilities.setCapability("chromedriverExecutable" ,WebDriverManager.chromedriver().getDownloadedDriverPath() );
       AndroidDriver driver = new AndroidDriver(new URL ("http://127.0.1.1:4723/wd/hub") , capabilities);


    }
}
