package Steps;

import dataHolder.AndroidDriverManager;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class BasePage {
    private static String url = "http://127.0.0.1:4723/wd/hub";
    public static AndroidDriver driver;

    public BasePage(){
      driver = AndroidDriverManager.getInstance().getDriver();
    }
    public static void implicitWait(){
        driver.manage().timeouts().implicitlyWait(20 , TimeUnit.SECONDS);
    }

    public static void waitForVisibilityOf(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator)); }
}
