package TaxiUser.taxi_service_impl;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import TaxiUser.taxi_lib.UIElementsConstants;
import TaxiUser.taxi_lib.XpathConstants;
import TaxiUser.taxi_service_interfaces.TU90_Top_Service_Inter;
import io.appium.java_client.AppiumDriver;

/**
 * Created by user on 10/5/2017.
 */

public class TU90_Top_service_impl implements TU90_Top_Service_Inter {

    public void textVerification(AppiumDriver driver) {

        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        Assert.assertEquals(driver.findElement(By.xpath(XpathConstants.txu090Top.LocationServiceOnText)).getText(), UIElementsConstants.txu090Top.LocationServiceOnText);
        Assert.assertEquals(driver.findElement(By.xpath(XpathConstants.txu090Top.LocationServiceOffButton)).getText(), UIElementsConstants.txu090Top.LocationServiceOffButtonText);
        driver.findElement(By.xpath(XpathConstants.txu090Top.LocationServiceOffButton)).isEnabled();
        Assert.assertEquals(driver.findElement(By.xpath(XpathConstants.txu090Top.LocationServiceOnButton)).getText(), UIElementsConstants.txu090Top.LocationServiceOnButtonText);
        driver.findElement(By.xpath(XpathConstants.txu090Top.LocationServiceOnButton)).click();
        WebDriverWait wait = new WebDriverWait(driver, 20);

       /* wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(XpathConstants.txu090Top.LocationButton)));
        driver.findElement(By.xpath(XpathConstants.txu090Top.GPSMessage_05Button)).click();
*/


        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(XpathConstants.txu090Top.SettingOfDestinationPlaceHolderText)));
        //Assert.assertEquals(driver.findElement(By.xpath(XpathConstants.txu090Top.ThankUDriverMsg)).getText(),UIElementsConstants.txu090Top.ThanksMsg);
        //driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        //Assert.assertEquals(driver.findElement(By.xpath(XpathConstants.txu090Top.Header)).getText(),UIElementsConstants.txu090Top.Header);
        driver.findElement(By.xpath(XpathConstants.txu090Top.Menubar)).click();
        driver.navigate().back();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(XpathConstants.txu090Top.SettingOfDestinationPlaceHolderText)));
        Assert.assertEquals(driver.findElement(By.xpath(XpathConstants.txu090Top.SettingOfDestinationPlaceHolderText)).getText(), UIElementsConstants.txu090Top.SettingOfDestinationPlaceHolderText);
        driver.findElement(By.xpath(XpathConstants.txu090Top.SettingOfDestinationButton)).isEnabled();

        //Assert.assertEquals(driver.findElement(By.xpath(XpathConstants.txu090Top.DriverEvaluateMessage)).getText(),UIElementsConstants.txu090Top.DriverEvaluationMesg);
        //driver.findElement(By.xpath(XpathConstants.txu090Top.DriverEvaluateMsgClose)).click();
        driver.findElement(By.xpath(XpathConstants.txu090Top.GoBackToDefaultButton)).isEnabled();
        driver.findElement(By.xpath(XpathConstants.txu090Top.SettingOfDestinationButton)).click();
        System.out.println("before try catch");
        boolean b = isElementPresent(driver);
        System.out.println("Method called");

        if (b == false) {
            System.out.println("if method");

            Assert.assertEquals(driver.findElement(By.xpath(XpathConstants.txu100WhereTo.PageTitle)).getText(), UIElementsConstants.txu100WhereTo.PageTitle);
        }
        else {
            driver.findElement(By.xpath(XpathConstants.txu090Top.NoTexiOkButton)).click();
        }


    }














    public void pageTransaction_to_WhereTo(AppiumDriver driver){


        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.findElement(By.xpath(XpathConstants.txu090Top.LocationServiceOnButton)).click();
        WebDriverWait wait = new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(XpathConstants.txu090Top.SettingOfDestinationPlaceHolderText)));

        driver.findElement(By.xpath(XpathConstants.txu090Top.SettingOfDestinationButton)).click();
        System.out.println("before try catch");
        boolean a = isElementPresent(driver);
        System.out.println("Method called");

        if(a==false) {
            System.out.println("if method");

            Assert.assertEquals(driver.findElement(By.xpath(XpathConstants.txu100WhereTo.PageTitle)).getText(), UIElementsConstants.txu100WhereTo.PageTitle);
        }
        else{
            driver.findElement(By.xpath(XpathConstants.txu090Top.NoTexiOkButton)).click();
        }


        }


        public boolean isElementPresent (AppiumDriver driver) {
        try {
            System.out.println("try");
            driver.findElement(By.xpath(XpathConstants.txu090Top.NoTexiMsg));
            return true;
        } catch (NoSuchElementException e) {
            System.out.println("catch");
            return false;
        }
    }


//        if(driver.findElement(By.xpath(XpathConstants.txu090Top.NoTexiMsg)).isDisplayed())
//        {
//
//            driver.findElement(By.xpath(XpathConstants.txu090Top.NoTexiOkButton)).click();
//        }
//
//        else if
//        {
//            Assert.assertEquals(driver.findElement(By.xpath(XpathConstants.txu100WhereTo.PageTitle)).getText(), UIElementsConstants.txu100WhereTo.PageTitle);
//
//        }






    }

