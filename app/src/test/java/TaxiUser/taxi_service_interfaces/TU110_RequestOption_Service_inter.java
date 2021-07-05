package TaxiUser.taxi_service_interfaces;

import io.appium.java_client.AppiumDriver;

/**
 * Created by user on 10/18/2017.
 */

public interface TU110_RequestOption_Service_inter {
    public void textVerification(AppiumDriver driver);
    public void pageTransitionToBroadcastPage(AppiumDriver driver);
    public void pageTransitionToDesignatedPage(AppiumDriver driver);
}
