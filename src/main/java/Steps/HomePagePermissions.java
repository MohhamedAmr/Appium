package Steps;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class HomePagePermissions extends BasePage {
    private By takeLocationPermissionWhileUsingTheApp = By.id("permission_allow_foreground_only_button");
    private By takeAllowNotificationPermission = By.id("permission_allow_button");


    public HomePagePermissions() {
        super();
    }

    public void AcceptAllPermission() {


        BasePage basePage = new BasePage();
        basePage.waitForVisibilityOf(takeLocationPermissionWhileUsingTheApp);
        driver.findElement(takeLocationPermissionWhileUsingTheApp).click();
        basePage.waitForVisibilityOf(takeAllowNotificationPermission);
        driver.findElement(takeAllowNotificationPermission).click();


    }

}
