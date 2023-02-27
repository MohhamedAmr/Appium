package Steps;

import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class MobileCaps {
    public DesiredCapabilities UserCaps() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        capabilities.setCapability("autoGrantPermissions", true);
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "MODY");

        capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.mnasat.nashmi.presentation.splash.SplashActivity");
        capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.mnasat.nashmi");
        return capabilities;

    }
}
