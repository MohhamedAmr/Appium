package Steps;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class HomePagePermissions extends PageBase {
    private By takeLocationPermissionWhileUsingTheApp = By.id("permission_allow_foreground_only_button");
    private By takeAllowNotificationPermission = By.id("permission_allow_button");


    public HomePagePermissions(AndroidDriver driver) {
        super(driver);
    }

    public void AcceptAllPermission() {


        PageBase pageBase = new PageBase(driver);
        pageBase.waitForVisibilityOf(takeLocationPermissionWhileUsingTheApp);
        driver.findElement(takeLocationPermissionWhileUsingTheApp).click();
        pageBase.waitForVisibilityOf(takeAllowNotificationPermission);
        driver.findElement(takeAllowNotificationPermission).click();


    }

}
