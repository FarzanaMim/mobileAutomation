package TaxiUser.taxi_lib;

import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

/**
 * Created by user on 10/5/2017.
 */

public class BaseConfiguration {
    AppiumDriver driver;
    public AppiumDriver loadDriver()throws  Exception
    {


        DesiredCapabilities cap=new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");

        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        cap.setCapability(MobileCapabilityType.VERSION, "4.2.2");
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android device");
        //cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "4000");
        cap.setCapability(MobileCapabilityType.APP_PACKAGE, "com.earthcar.taxiuser.dev.debug");
        cap.setCapability(MobileCapabilityType.APP_ACTIVITY, "com.earthcar.taxiuser.ui.activity.SplashScreenActivity");
        //cap.setCapability("noReset", true);
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);
        if (driver != null) {
            System.out.print("Not null");
        }
        else{
            System.out.print("null");
        }
        return driver;
    }
}


