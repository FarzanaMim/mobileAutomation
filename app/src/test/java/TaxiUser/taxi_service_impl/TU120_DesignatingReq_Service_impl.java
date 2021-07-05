package TaxiUser.taxi_service_impl;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import TaxiUser.taxi_lib.UIElementsConstants;
import TaxiUser.taxi_lib.XpathConstants;
import TaxiUser.taxi_service_interfaces.TU120_Designating_inter;
import io.appium.java_client.AppiumDriver;

/**
 * Created by user on 10/23/2017.
 */

public class TU120_DesignatingReq_Service_impl implements TU120_Designating_inter {


    public void designatedRequestSend(AppiumDriver driver){
        driver.findElement(By.xpath(XpathConstants.txu120DesignatingReq.favDriverButton)).click();
        driver.findElement(By.xpath(XpathConstants.txu120DesignatingReq.centerPlaceButton)).click();
        Assert.assertEquals(driver.findElement(By.xpath(XpathConstants.txu120DesignatingReq.SelectDriverButton)).getText(), UIElementsConstants.txu120DesignatingReq.SelectDriverButton1);
        driver.findElement(By.xpath(XpathConstants.txu120DesignatingReq.driver)).click();
        Assert.assertEquals(driver.findElement(By.xpath(XpathConstants.txu120DesignatingReq.SelectDriverButton)).getText(), UIElementsConstants.txu120DesignatingReq.SelectDriverButton2);
        driver.findElement(By.xpath(XpathConstants.txu120DesignatingReq.SelectDriverButton)).click();
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(XpathConstants.txu120DesignatingReq.ConfirmReqMeg)));
        Assert.assertEquals(driver.findElement(By.xpath(XpathConstants.txu120DesignatingReq.ConfirmReqMeg)).getText(),UIElementsConstants.txu120DesignatingReq.ConfirmReqMeg);
        Assert.assertEquals(driver.findElement(By.xpath(XpathConstants.txu120DesignatingReq.yes)).getText(),UIElementsConstants.txu120DesignatingReq.yes);
        Assert.assertEquals(driver.findElement(By.xpath(XpathConstants.txu120DesignatingReq.no)).getText(),UIElementsConstants.txu120DesignatingReq.no);
        driver.findElement(By.xpath(XpathConstants.txu120DesignatingReq.yes)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(XpathConstants.txu120DesignatingReq.designatedTitel)));
        Assert.assertEquals(driver.findElement(By.xpath(XpathConstants.txu120DesignatingReq.designatedTitel)).getText(),UIElementsConstants.txu120DesignatingReq.designatedTitel);
    }


    public void textVerification(AppiumDriver driver){

        designatedRequestSend( driver);
        Assert.assertEquals(driver.findElement(By.xpath(XpathConstants.txu120DesignatingReq.cancelButton)).getText(),UIElementsConstants.txu120DesignatingReq.cancelButton);
        driver.findElement(By.xpath(XpathConstants.txu120DesignatingReq.cancelButton)).click();
        Assert.assertEquals(driver.findElement(By.xpath(XpathConstants.txu120DesignatingReq.cancelConfirmMsg)).getText(),UIElementsConstants.txu120DesignatingReq.cancelConfirmMsg);
        Assert.assertEquals(driver.findElement(By.xpath(XpathConstants.txu120DesignatingReq.cancelYes)).getText(),UIElementsConstants.txu120DesignatingReq.cancelYes);
        Assert.assertEquals(driver.findElement(By.xpath(XpathConstants.txu120DesignatingReq.cancelNo)).getText(),UIElementsConstants.txu120DesignatingReq.cancelNo);
        driver.findElement(By.xpath(XpathConstants.txu120DesignatingReq.cancelYes)).click();
        Assert.assertEquals(driver.findElement(By.xpath(XpathConstants.txu120DesignatingReq.confirmmsg)).getText(),UIElementsConstants.txu120DesignatingReq.confirmmsg);
        driver.findElement(By.xpath(XpathConstants.txu120DesignatingReq.ok)).click();
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(XpathConstants.txu090Top.SettingOfDestinationPlaceHolderText)));














    }


}
