package Steps;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

import java.net.MalformedURLException;

public class ReorderCycle extends PageBase {
    //    private AndroidDriver driver;
    private By getReorderButtonIdFromHome = By.id("reorder");
    private By getOkButtonIdAfterTapReorder = By.id("btnConfirmDelete");
    private By getProceedToCheckoutButtonId = By.id("cl_proceed_checkout");
    private By getSelectPayCashButtonId = By.id("payment_rb");
    private By getPlaceOrderButtonId = By.id("btn");

    private By confirmSimilarLocationSheet = By.id("btnConfirm");

    public ReorderCycle(AndroidDriver driver) {
        super(driver);
    }

    public void ClickReorder() {
        // waitForVisibilityOf(getReorderButtonIdFromHome);
        driver.findElement(getReorderButtonIdFromHome).click();

    }

    public void ClickConfrimSimilarLocation() {
        //waitForVisibilityOf(confirmSimilarLocationSheet);
        driver.findElement(confirmSimilarLocationSheet).click();
    }

    public void ClickOkButton() {
        driver.findElement(getOkButtonIdAfterTapReorder).click();
    }

    public void ProceedToCheckout() {
        // waitForVisibilityOf(getProceedToCheckoutButtonId);
        driver.findElement(getProceedToCheckoutButtonId).click();
    }

    public void ClickPayCash() {
        // waitForVisibilityOf(getSelectPayCashButtonId);
        driver.findElement(getSelectPayCashButtonId).click();
    }

    public void ClickPlaceOrder() {
        driver.findElement(getPlaceOrderButtonId).click();
    }

    public void ReorderCycleTest() throws MalformedURLException {
        new LoginPage(driver).loginCycleTest();

        //new HomePagePermissions(driver).AcceptAllPermission();
        ReorderCycle reorderCycle = new ReorderCycle(driver);
        reorderCycle.ClickConfrimSimilarLocation();
        reorderCycle.ClickReorder();
        reorderCycle.ClickOkButton();
        reorderCycle.ProceedToCheckout();
        reorderCycle.ClickPayCash();
        reorderCycle.ClickPlaceOrder();
    }
}
