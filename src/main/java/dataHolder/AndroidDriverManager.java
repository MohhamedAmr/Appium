package dataHolder;

import Steps.MobileCaps;
import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class AndroidDriverManager {

    private String url = "http://127.0.0.1:4723/wd/hub";
    private MobileCaps caps = new MobileCaps();

    private AndroidDriver driver;

    private static AndroidDriverManager androidDriverManager = null;

    private AndroidDriverManager() {
    }

    public static AndroidDriverManager getInstance() {
        if (androidDriverManager == null)
            androidDriverManager = new AndroidDriverManager();

        return androidDriverManager;
    }

    public void setDriver(AndroidDriver driver) {
        this.driver = driver;
    }

    public AndroidDriver getDriver() {
        if (driver == null) {
            try {
                driver =
                        new AndroidDriver(
                                new URL(AndroidDriverManager.getInstance().getUrl()),
                                AndroidDriverManager.getInstance().getCaps().UserCaps()
                        );

                AndroidDriverManager.getInstance().setDriver(driver);
            } catch (MalformedURLException e) {
                throw new RuntimeException(e);
            }
        }
        return driver;
    }

    public String getUrl() {
        return url;
    }

    public MobileCaps getCaps() {
        return caps;
    }
}
