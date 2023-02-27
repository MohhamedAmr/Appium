package TestRunner;

import Steps.LoginPage;

import Steps.ReorderCycle;
import io.appium.java_client.android.AndroidDriver;

import org.testng.annotations.Test;

import java.net.MalformedURLException;


public class RunTests {
    private AndroidDriver driver;
    @Test
    public void LoginCycleTest() throws MalformedURLException {

    new LoginPage(driver).loginCycleTest();

    }
    @Test
public void ReorderCycleTest() throws MalformedURLException {
        new ReorderCycle(driver).ReorderCycle();
}
}
