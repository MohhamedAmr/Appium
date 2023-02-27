package Steps;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class LoginPage {
    private AndroidDriver driver;

    private String url = "http://127.0.0.1:4723/wd/hub";
    private By getCountryCodeId = By.id("tvCountryCodeNumber");
    private By getSkipButtonId = By.id("tvSkip");
    private By getEgyptCountryCodeId = By.id("textView68");
    private By getPhoneNumberFieldId = By.id("etCurrentNumber");
    private By getContinueButtonId = By.id("btn_continue");
    private By getPasswordFieldId = By.id("etNewPassword");
    private By getLoginButtonId = By.id("btnLogin");

    private By getBannerDismissButton = By.id("text_header");

    protected void waitForVisibilityOf(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator)); }

    public LoginPage(AndroidDriver driver){
        this.driver=driver;
    }
    public void clickBannerDismissButton(){

       implicityWait();
        driver.findElement(getBannerDismissButton).click();
    }

     public void sendURL() throws MalformedURLException {
         MobileCaps caps = new MobileCaps();
         driver = new AndroidDriver(new URL(url) , caps.UserCaps());
     }
    public void loginAfterSplash(String number) {
        driver.findElement(getPhoneNumberFieldId).sendKeys(number);
        driver.findElement(getContinueButtonId).click();

    }
    public void implicityWait(){
        driver.manage().timeouts().implicitlyWait(20 , TimeUnit.SECONDS);
    }
    public void loginLastStep (String password){
        driver.findElement(getPasswordFieldId).sendKeys(password);
        driver.findElement(getLoginButtonId).click();

    }

        public void clickOnSkipButton(){
            driver.findElement(getSkipButtonId).click();
        }

        public void clickOnCountryCodeLabel(){
            driver.findElement(getCountryCodeId).click();
        }
        public void clickOnEgyptLabel(){
            driver.findElement(getEgyptCountryCodeId).click();
        }
        public void loginCycleTest() throws MalformedURLException {
            LoginPage loginPage = new LoginPage(driver);
            loginPage.sendURL();
            loginPage.implicityWait();
            loginPage.clickOnSkipButton();

            //loginPage.clickBannerDismissButton();
            loginPage.clickOnCountryCodeLabel();
            loginPage.clickOnEgyptLabel();
            //loginPage.implicityWait();

            loginPage.loginAfterSplash("01271022279");
            loginPage.loginLastStep("123456");


        }

    }







