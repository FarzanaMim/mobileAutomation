package TaxiUser.texi_test_steps;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import TaxiUser.taxi_lib.BaseConfiguration;
import TaxiUser.taxi_service_impl.TU010_Login_Webview_services_impl;
import TaxiUser.taxi_service_impl.TU90_Top_service_impl;
import TaxiUser.taxi_service_interfaces.TU010_Login_WebView_inter;
import TaxiUser.taxi_service_interfaces.TU90_Top_Service_Inter;
import io.appium.java_client.AppiumDriver;


/**
 * Created by user on 10/10/2017.
 */

public class TU90_Top {
    private BaseConfiguration baseConfig = new BaseConfiguration();
    private AppiumDriver driver = null;
    private TU90_Top_Service_Inter tu90Top = new TU90_Top_service_impl();
    private TU010_Login_WebView_inter tu010login = new TU010_Login_Webview_services_impl();


    @Before
    public void initDriver() throws Exception {
        driver = baseConfig.loadDriver();

    }

   @Test
    public void fixedTextVerification() throws Exception

    {

        tu010login.login_webview(driver);

        tu90Top.textVerification(driver);

    }

    @Test
    public void pageTransactionOfTopPage() throws Exception {

        tu010login.login_webview(driver);
        tu90Top.pageTransaction_to_WhereTo(driver);
    }

    @After

    public void testCaseTearDown() {

        driver.quit();
    }
}