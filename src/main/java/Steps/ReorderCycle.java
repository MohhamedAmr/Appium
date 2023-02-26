package Steps;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

import java.net.MalformedURLException;

public class ReorderCycle {
    private AndroidDriver driver;
    private By getReorderButtonIdFromHome = By.id("reorder");
    private By getOkButtonIdAfterTapReorder = By.id("btnConfirmDelete");
    private By getProceedToCheckoutButtonId = By.id("cl_proceed_checkout");
    private By getSelectPayCashButtonId = By.id("payment_rb");
    private By getPlaceOrderButtonId = By.id("btn");

    public ReorderCycle(AndroidDriver driver){
        this.driver = driver;
    }

    public void ClickReorder (){
        driver.findElement(getReorderButtonIdFromHome).click();

    }
    public void ClickOkButton(){
        driver.findElement(getOkButtonIdAfterTapReorder).click();
    }
    public void ClickPayCash(){
        driver.findElement(getSelectPayCashButtonId).click();
    }
    public void ClickPlaceOrder(){
        driver.findElement(getPlaceOrderButtonId).click();
    }
    public void ReorderCycle() throws MalformedURLException {
        new LoginPage(driver).loginCycleTest();
        new HomePagePermissions(driver).AcceptAllPermission();
        ReorderCycle reorderCycle = new ReorderCycle(driver);
        reorderCycle.ClickReorder();
        reorderCycle.ClickOkButton();
        reorderCycle.ClickPayCash();
        reorderCycle.ClickPlaceOrder();
    }
}
