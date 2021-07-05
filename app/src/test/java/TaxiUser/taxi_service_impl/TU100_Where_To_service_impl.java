package TaxiUser.taxi_service_impl;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import TaxiUser.taxi_lib.UIElementsConstants;
import TaxiUser.taxi_lib.XpathConstants;
import TaxiUser.taxi_service_interfaces.TU100_Where_To_inter;
import io.appium.java_client.AppiumDriver;

/**
 * Created by user on 10/10/2017.
 */

public class TU100_Where_To_service_impl implements TU100_Where_To_inter {

    private   String destinationLocation;

   public String getDestinationLocation(){
       return destinationLocation;
    };

    public void textVerification(AppiumDriver driver) {

        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        Assert.assertEquals(driver.findElement(By.xpath(XpathConstants.txu100WhereTo.PageTitle)).getText(), UIElementsConstants.txu100WhereTo.PageTitle);
        System.out.println("Departure point"+ driver.findElement(By.xpath(XpathConstants.txu100WhereTo.DepartureTextBox)).getText());
        Assert.assertEquals(driver.findElement(By.xpath(XpathConstants.txu100WhereTo.DestinationTextBox)).getText(), UIElementsConstants.txu100WhereTo.DestinationPlaceHolderText);
        Assert.assertEquals(driver.findElement(By.xpath(XpathConstants.txu100WhereTo.PinPlacementText)).getText(),UIElementsConstants.txu100WhereTo.PinPlacementText);
        if(driver.findElement(By.xpath(XpathConstants.txu100WhereTo.selectDriverButton)).isEnabled())
        {
            System.out.print("\n Button is enable ");
        }
        else
            System.out.print("\n Button is disable ");
        driver.findElement(By.xpath(XpathConstants.txu100WhereTo.DestinationTextBox)).click();
        driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);


        driver.swipe(370,700, 370, 1080, 4000);

       destinationLocation = driver.findElement(By.xpath(XpathConstants.txu100WhereTo.DestinationTextBox)).getText();

        /*
        Assert.assertEquals(driver.findElement(By.xpath(XpathConstants.txu100WhereTo.DestinationTextBox)).getText(), "Rd No 11, Dhaka 1212 バングラデシュ");*/
        driver.findElement(By.xpath(XpathConstants.txu100WhereTo.selectDriverButton)).isEnabled();
        Assert.assertEquals(driver.findElement(By.xpath(XpathConstants.txu100WhereTo.selectDriverButton)).getText(), UIElementsConstants.txu100WhereTo.selectDriverButton);
        driver.findElement(By.xpath(XpathConstants.txu100WhereTo.selectDriverButton)).click();
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(XpathConstants.txu110RequestOption.PageTitle)));
        driver.findElement(By.xpath(XpathConstants.txu110RequestOption.backButton)).click();
        Assert.assertEquals(driver.findElement(By.xpath(XpathConstants.txu100WhereTo.PageTitle)).getText(),UIElementsConstants.txu100WhereTo.PageTitle);




    }


public void pageTransitTotxu110RequestOption(AppiumDriver driver){

    driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    driver.findElement(By.xpath(XpathConstants.txu100WhereTo.DestinationTextBox)).click();


    driver.swipe(368, 723, 400, 1050, 3000);
    driver.findElement(By.xpath(XpathConstants.txu100WhereTo.selectDriverButton)).click();
    WebDriverWait wait = new WebDriverWait(driver, 20);
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(XpathConstants.txu110RequestOption.PageTitle)));
    Assert.assertEquals(driver.findElement(By.xpath(XpathConstants.txu110RequestOption.PageTitle)).getText(),UIElementsConstants.txu110RequestOption.pageTitle);




}
}
