package Steps;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class HomePagePermissions {
    private By takeLocationPermissionWhileUsingTheApp = By.id("permission_allow_foreground_only_button");
    private By takeAllowNotificationPermission = By.id("permission_allow_button");
    private By confirmSimilarLocationSheet = By.id("btnConfirm");
    private AndroidDriver driver;

    public HomePagePermissions(AndroidDriver driver) {
        this.driver = driver;
    }

    public void AcceptAllPermission(){
   LoginPage loginPage=new LoginPage(driver) ;
loginPage.waitForVisibilityOf(takeLocationPermissionWhileUsingTheApp);
   driver.findElement(takeLocationPermissionWhileUsingTheApp).click();
   loginPage.waitForVisibilityOf(takeAllowNotificationPermission);
    driver.findElement(takeAllowNotificationPermission).click();
    loginPage.waitForVisibilityOf(confirmSimilarLocationSheet);
    driver.findElement(confirmSimilarLocationSheet).click();

}

}
