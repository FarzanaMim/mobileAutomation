package TaxiUser.taxi_service_impl;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import TaxiUser.taxi_lib.UIElementsConstants;
import TaxiUser.taxi_lib.XpathConstants;
import TaxiUser.taxi_service_interfaces.TU110_RequestOption_Service_inter;
import io.appium.java_client.AppiumDriver;

/**
 * Created by user on 10/18/2017.
 */

public class TU110_RequestOption_service_impl implements TU110_RequestOption_Service_inter{

    public void textVerification(AppiumDriver driver){

        Assert.assertEquals(driver.findElement(By.xpath(XpathConstants.txu110RequestOption.nominateDriver)).getText(), UIElementsConstants.txu110RequestOption.nominateDriverText);
        Assert.assertEquals(driver.findElement(By.xpath(XpathConstants.txu110RequestOption.designateReq)).getText(),UIElementsConstants.txu110RequestOption.designateReqText);
        Assert.assertEquals(driver.findElement(By.xpath(XpathConstants.txu110RequestOption.callTexi)).getText(), UIElementsConstants.txu110RequestOption.callTexiText);
        Assert.assertEquals(driver.findElement(By.xpath(XpathConstants.txu110RequestOption.broadcastReq)).getText(), UIElementsConstants.txu110RequestOption.broadcastReqText);




    }

    public void pageTransitionToBroadcastPage(AppiumDriver driver){




        driver.findElement(By.xpath(XpathConstants.txu110RequestOption.broadcastReq)).click();
        Assert.assertEquals(driver.findElement(By.xpath(XpathConstants.txu110RequestOption.broadcastpermission)).getText(),UIElementsConstants.txu110RequestOption.broadcastpermissionText);
        Assert.assertEquals(driver.findElement(By.xpath(XpathConstants.txu110RequestOption.yes)).getText(),UIElementsConstants.txu110RequestOption.yesText);
        Assert.assertEquals(driver.findElement(By.xpath(XpathConstants.txu110RequestOption.no)).getText(),UIElementsConstants.txu110RequestOption.notext);
        driver.findElement(By.xpath(XpathConstants.txu110RequestOption.no)).click();
        driver.findElement(By.xpath(XpathConstants.txu110RequestOption.broadcastReq)).click();
        driver.findElement(By.xpath(XpathConstants.txu110RequestOption.yes)).click();
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(XpathConstants.txu130Requesting.PageTitle)));
        Assert.assertEquals(driver.findElement(By.xpath(XpathConstants.txu130Requesting.PageTitle)).getText(),UIElementsConstants.txu130Requesting.pageTitle);

    }

    public void pageTransitionToDesignatedPage(AppiumDriver driver){
        driver.findElement(By.xpath(XpathConstants.txu110RequestOption.designateReq)).click();
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(XpathConstants.txu120DesignatingReq.PageTitle)));
        Assert.assertEquals(driver.findElement(By.xpath(XpathConstants.txu120DesignatingReq.PageTitle)).getText(),UIElementsConstants.txu120DesignatingReq.pageTitle);
    }
}
