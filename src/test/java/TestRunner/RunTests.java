package TestRunner;

import Steps.LoginPage;
import Steps.ReorderCycle;
import io.appium.java_client.android.AndroidDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;


public class RunTests {

    @Test
    public void LoginCycleTest() throws MalformedURLException {

        new LoginPage().loginCycleTest();


    }

    @Test
    public void ReorderCycleTest() throws MalformedURLException {

        new ReorderCycle().ReorderCycleTest();
    }
}
