package TaxiUser.texi_test_steps;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import TaxiUser.taxi_lib.BaseConfiguration;
import TaxiUser.taxi_service_impl.TU010_Login_Webview_services_impl;
import TaxiUser.taxi_service_impl.TU100_Where_To_service_impl;
import TaxiUser.taxi_service_impl.TU110_RequestOption_service_impl;
import TaxiUser.taxi_service_impl.TU120_DesignatingReq_Service_impl;
import TaxiUser.taxi_service_impl.TU130_BroadcastRequesting_ser_Impl;
import TaxiUser.taxi_service_impl.TU140_WiatingPage_ServiceImpl;
import TaxiUser.taxi_service_impl.TU150_OnboardPage_ServiceImpl;
import TaxiUser.taxi_service_impl.TU90_Top_service_impl;
import TaxiUser.taxi_service_interfaces.TU010_Login_WebView_inter;
import TaxiUser.taxi_service_interfaces.TU100_Where_To_inter;
import TaxiUser.taxi_service_interfaces.TU110_RequestOption_Service_inter;
import TaxiUser.taxi_service_interfaces.TU120_Designating_inter;
import TaxiUser.taxi_service_interfaces.TU130_BroadcastRequesting_inter;
import TaxiUser.taxi_service_interfaces.TU140_WaitingPage_inter;
import TaxiUser.taxi_service_interfaces.TU90_Top_Service_Inter;
import io.appium.java_client.AppiumDriver;

/**
 * Created by user on 12/1/2017.
 */

public class TU150_OnboardPage {

    private BaseConfiguration baseConfig = new BaseConfiguration();
    private AppiumDriver driver = null;
    private TU90_Top_Service_Inter tu90Top = new TU90_Top_service_impl();
    private TU100_Where_To_inter tu100WhereTo = new TU100_Where_To_service_impl();
    private TU110_RequestOption_Service_inter tu110ReqOption = new TU110_RequestOption_service_impl();
    private TU130_BroadcastRequesting_inter tu130BroadcastRequest = new TU130_BroadcastRequesting_ser_Impl();
    private TU010_Login_WebView_inter tu010login = new TU010_Login_Webview_services_impl();
    private TU140_WaitingPage_inter tu140waitingPage=new TU140_WiatingPage_ServiceImpl();
    private TU120_Designating_inter tu120designating=new TU120_DesignatingReq_Service_impl();
    private TaxiUser.taxi_service_interfaces.TU150_OnboardPage tu150onBoardPage=new TU150_OnboardPage_ServiceImpl();





    @Before
    public void initDriver() throws Exception {
        driver = (AppiumDriver) baseConfig.loadDriver();
    }

    //For Broadcast request
    @Test
    public void broadcastWaitingPageverification() throws Exception {
        tu010login.login_webview(driver);
        tu90Top.pageTransaction_to_WhereTo(driver);
        tu100WhereTo.pageTransitTotxu110RequestOption(driver);
        tu110ReqOption.pageTransitionToBroadcastPage(driver);
        tu130BroadcastRequest.BroadCastRequestSend(driver);
        tu140waitingPage.broadcastReq_text_functionalityVerification(driver);
        tu150onBoardPage.text_functionality_Verification(driver);




    }

    //For Designated request
    @Test
    public void designatedWaitingPageverification() throws Exception {
        tu010login.login_webview(driver);
        tu90Top.pageTransaction_to_WhereTo(driver);
        tu100WhereTo.pageTransitTotxu110RequestOption(driver);
        tu110ReqOption.pageTransitionToBroadcastPage(driver);
        tu120designating.designatedRequestSend(driver);
        tu140waitingPage.designatedReq_text_functionalityVerification(driver);




    }

    @After

    public void testCaseTearDown() {

        driver.quit();
    }
}
