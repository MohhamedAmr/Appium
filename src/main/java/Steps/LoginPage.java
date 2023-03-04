package Steps;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

import java.net.MalformedURLException;

public class LoginPage extends PageBase {


    private By getCountryCodeId = By.id("tvCountryCodeNumber");
    private By getSkipButtonId = By.id("tvSkip");
    private By getEgyptCountryCodeId = By.id("textView68");
    private By getPhoneNumberFieldId = By.id("etCurrentNumber");
    private By getContinueButtonId = By.id("btn_continue");
    private By getPasswordFieldId = By.id("etNewPassword");
    private By getLoginButtonId = By.id("btnLogin");

    private By getBannerDismissButton = By.id("com_braze_inappmessage_modal_close_button");


    public LoginPage(AndroidDriver driver) {
        super(driver);
    }

    public void clickBannerDismissButton() {

        PageBase.waitForVisibilityOf(getBannerDismissButton);
        driver.findElement(getBannerDismissButton).click();
    }


    public void loginAfterSplash(String number) {
        driver.findElement(getPhoneNumberFieldId).sendKeys(number);
        driver.findElement(getContinueButtonId).click();

    }

    public void loginLastStep(String password) {
        driver.findElement(getPasswordFieldId).sendKeys(password);
        driver.findElement(getLoginButtonId).click();

    }

    public void clickOnSkipButton() {
        driver.findElement(getSkipButtonId).click();
    }

    public void clickOnCountryCodeLabel() {
        driver.findElement(getCountryCodeId).click();
    }

    public void clickOnEgyptLabel() {
        driver.findElement(getEgyptCountryCodeId).click();
    }

    public void loginCycleTest() throws MalformedURLException {
        LoginPage loginPage = new LoginPage(driver);
        new PageBase(driver).sendURL();
        new PageBase(driver).implicitWait();
        loginPage.clickOnSkipButton();
        //loginPage.clickBannerDismissButton();
        loginPage.clickOnCountryCodeLabel();
        loginPage.clickOnEgyptLabel();
        loginPage.loginAfterSplash("01271022279");
        loginPage.loginLastStep("123456");
        //PageBase.implicitWait();


    }

}







