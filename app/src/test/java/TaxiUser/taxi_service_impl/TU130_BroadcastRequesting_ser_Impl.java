package TaxiUser.taxi_service_impl;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import TaxiUser.taxi_lib.UIElementsConstants;
import TaxiUser.taxi_lib.XpathConstants;
import TaxiUser.taxi_service_interfaces.TU100_Where_To_inter;
import TaxiUser.taxi_service_interfaces.TU110_RequestOption_Service_inter;
import TaxiUser.taxi_service_interfaces.TU130_BroadcastRequesting_inter;
import TaxiUser.taxi_service_interfaces.TU90_Top_Service_Inter;
import io.appium.java_client.AppiumDriver;

/**
 * Created by user on 10/19/2017.
 */

public class TU130_BroadcastRequesting_ser_Impl implements TU130_BroadcastRequesting_inter {
    private TU100_Where_To_inter tu100WhereTo= new TU100_Where_To_service_impl();
    private TU90_Top_Service_Inter tu90Top = new TU90_Top_service_impl();
    private TU110_RequestOption_Service_inter tu110ReqOption =new TU110_RequestOption_service_impl();


    public void BroadCastRequestSend(AppiumDriver driver){
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(XpathConstants.txu090Top.SettingOfDestinationPlaceHolderText)));
        driver.findElement(By.xpath(XpathConstants.txu090Top.SettingOfDestinationButton)).click();
        tu100WhereTo.pageTransitTotxu110RequestOption( driver);
        tu110ReqOption.pageTransitionToBroadcastPage(driver);
        Assert.assertEquals(driver.findElement(By.xpath(XpathConstants.txu130Requesting.CancelReqButton)).getText(),UIElementsConstants.txu130Requesting.CancelReqButtonText);
        driver.findElement(By.xpath(XpathConstants.txu130Requesting.CancelReqButton)).click();
        Assert.assertEquals(driver.findElement(By.xpath(XpathConstants.txu130Requesting.CancelConfirmMsg)).getText(),UIElementsConstants.txu130Requesting.CancelConfirmMsg);
        Assert.assertEquals(driver.findElement(By.xpath(XpathConstants.txu130Requesting.yesButton)).getText(),UIElementsConstants.txu130Requesting.yesText);
        driver.findElement(By.xpath(XpathConstants.txu130Requesting.yesButton)).isEnabled();
        Assert.assertEquals(driver.findElement(By.xpath(XpathConstants.txu130Requesting.noButton)).getText(),UIElementsConstants.txu130Requesting.noText);
        driver.findElement(By.xpath(XpathConstants.txu130Requesting.noButton)).click();
    }

    public void textVerification(AppiumDriver driver) throws InterruptedException {


        /*ssert.assertEquals(driver.findElement(By.xpath(XpathConstants.txu130Requesting.CancelReqButton)).getText(), UIElementsConstants.txu130Requesting.CancelReqButtonText);
        driver.findElement(By.xpath(XpathConstants.txu130Requesting.CancelReqButton)).click();
        Assert.assertEquals(driver.findElement(By.xpath(XpathConstants.txu130Requesting.CancelConfirmMsg)).getText(),UIElementsConstants.txu130Requesting.CancelConfirmMsg);
        Assert.assertEquals(driver.findElement(By.xpath(XpathConstants.txu130Requesting.yesButton)).getText(),UIElementsConstants.txu130Requesting.yesText);
        Assert.assertEquals(driver.findElement(By.xpath(XpathConstants.txu130Requesting.noButton)).getText(),UIElementsConstants.txu130Requesting.noText);
        driver.findElement(By.xpath(XpathConstants.txu130Requesting.noButton)).click();
        driver.findElement(By.xpath(XpathConstants.txu130Requesting.CancelReqButton)).click();
        driver.findElement(By.xpath(XpathConstants.txu130Requesting.yesButton)).click();
        Assert.assertEquals(driver.findElement(By.xpath(XpathConstants.txu130Requesting.canceledmsg)).getText(),UIElementsConstants.txu130Requesting.canceledmsg);
        driver.findElement(By.xpath(XpathConstants.txu130Requesting.okButton)).click();*/

       // Thread.sleep(10000);
        BroadCastRequestSend( driver);
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS) ;
        driver.get(UIElementsConstants.txu130Requesting.driverNotFoundmsg);
        WebDriverWait wait = new WebDriverWait(driver, 20);


        Assert.assertEquals(driver.findElement(By.xpath(XpathConstants.txu130Requesting.driverNotFoundmsg)).getText(),UIElementsConstants.txu130Requesting.driverNotFoundmsg);
        Assert.assertEquals(driver.findElement(By.xpath(XpathConstants.txu130Requesting.backToTopButton)).getText(),UIElementsConstants.txu130Requesting.backtoTopbutton);
        driver.findElement(By.xpath(XpathConstants.txu130Requesting.backToTopButton)).isEnabled();
        Assert.assertEquals(driver.findElement(By.xpath(XpathConstants.txu130Requesting.driverListButton)).getText(),UIElementsConstants.txu130Requesting.driverListButton);
        driver.findElement(By.xpath(XpathConstants.txu130Requesting.driverListButton)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(XpathConstants.txu130Requesting.driverList)));
        Assert.assertEquals(driver.findElement(By.xpath(XpathConstants.txu130Requesting.driverList)).getText(),UIElementsConstants.txu130Requesting.driverList);
        Assert.assertEquals(driver.findElement(By.xpath(XpathConstants.txu130Requesting.CloseupButton)).getText(),UIElementsConstants.txu130Requesting.CloseupButton);
        driver.findElement(By.xpath(XpathConstants.txu130Requesting.CloseupButton)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(XpathConstants.txu090Top.SettingOfDestinationPlaceHolderText)));





    }


}
