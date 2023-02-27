package Steps;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class PageBase {
    private static String url = "http://127.0.0.1:4723/wd/hub";
    public static AndroidDriver driver;

    public PageBase(AndroidDriver driver){
        this.driver = driver;
    }
    public static void implicitWait(){
        driver.manage().timeouts().implicitlyWait(20 , TimeUnit.SECONDS);
    }
    public static void sendURL() throws MalformedURLException {
        MobileCaps caps = new MobileCaps();
        driver = new AndroidDriver(new URL(url) , caps.UserCaps());
    }
    public static void waitForVisibilityOf(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator)); }
}
