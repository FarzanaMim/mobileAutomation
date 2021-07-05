package TaxiUser.taxi_service_impl;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import TaxiUser.taxi_lib.UIElementsConstants;
import TaxiUser.taxi_lib.XpathConstants;
import TaxiUser.taxi_service_interfaces.TU150_OnboardPage;
import io.appium.java_client.AppiumDriver;

/**
 * Created by user on 12/1/2017.
 */

public class TU150_OnboardPage_ServiceImpl implements TU150_OnboardPage {

    public void text_functionality_Verification(AppiumDriver driver){


        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(XpathConstants.txu140Waiting.title)));
        Assert.assertEquals(driver.findElement(By.xpath(XpathConstants.txu150_Onboard.title)).getText(), UIElementsConstants.txu150OnBoard.header);
        driver.findElement(By.xpath(XpathConstants.txu150_Onboard.GoBackToDefaultButton)).isEnabled();
        Assert.assertEquals(driver.findElement(By.xpath(XpathConstants.txu140Waiting.driverName)).getText(),UIElementsConstants.txu140Waiting.driverName);
        System.out.println("Vehicle iD-"+driver.findElement(By.xpath(XpathConstants.txu140Waiting.vehicleId)).getText() );
        System.out.println(" Lisence Plate"+driver.findElement(By.xpath(XpathConstants.txu140Waiting.text_car_license_plate)).getText() );
        String likeCount=driver.findElement(By.xpath(XpathConstants.txu140Waiting.likeCounting)).getText();
        System.out.println("Total like-"+likeCount );
        String SeatCapacity=driver.findElement(By.xpath(XpathConstants.txu140Waiting.seatcapability)).getText();
        System.out.println("Total SeatCapacity-"+SeatCapacity );
        driver.swipe(348, 990, 382, 80, 3000);
        Assert.assertEquals(driver.findElement(By.xpath(XpathConstants.txu140Waiting.text_arrival_time)).getText(),UIElementsConstants.txu140Waiting.text_arrival_time);
        Assert.assertEquals(driver.findElement(By.xpath(XpathConstants.txu140Waiting.text_minutes)).getText(),UIElementsConstants.txu140Waiting.text_minutes);
        String depurture=driver.findElement(By.xpath(XpathConstants.txu140Waiting.departureLocation)).getText();
        depurture.equals(UIElementsConstants.txu100WhereTo.DepartureTextBox);
        String destination=driver.findElement(By.xpath(XpathConstants.txu140Waiting.destinationLocation)).getText();
        TU100_Where_To_service_impl destinationLocat = new TU100_Where_To_service_impl();
        String DesLocation=destinationLocat.getDestinationLocation();
        destination.equals(DesLocation);
        Assert.assertEquals(driver.findElement(By.xpath(XpathConstants.txu140Waiting.paymentMethod)).getText(),UIElementsConstants.txu140Waiting.paymentMethod);
        Assert.assertEquals(driver.findElement(By.xpath(XpathConstants.txu140Waiting.coupon)).getText(),UIElementsConstants.txu140Waiting.coupon);
        Assert.assertEquals(driver.findElement(By.xpath(XpathConstants.txu140Waiting.textTotalTip)).getText(),UIElementsConstants.txu140Waiting.textTotalTip);
        Assert.assertEquals(driver.findElement(By.xpath(XpathConstants.txu140Waiting.textGiveAtip)).getText(),UIElementsConstants.txu140Waiting.textGiveAtip);
        driver.scrollTo("ドライバーにメッセージする");
        Assert.assertEquals(driver.findElement(By.xpath(XpathConstants.txu140Waiting.button_submitInactive)).getText(),UIElementsConstants.txu140Waiting.button_submitInactive);
        Assert.assertEquals(driver.findElement(By.xpath(XpathConstants.txu140Waiting.button_tip_minus)).getText(),UIElementsConstants.txu140Waiting.button_tip_minus);
        Assert.assertEquals(driver.findElement(By.xpath(XpathConstants.txu140Waiting.button_tip_plus)).getText(),UIElementsConstants.txu140Waiting.button_tip_plus);
        if(driver.findElement(By.xpath(XpathConstants.txu140Waiting.text_tip_amount)).equals(UIElementsConstants.txu140Waiting.text_tip_amount))
        {
            if(driver.findElement(By.xpath(XpathConstants.txu140Waiting.button_tip_minus)).isEnabled())
                System.out.println("Minus button disable");



            driver.findElement(By.xpath(XpathConstants.txu140Waiting.button_tip_plus)).click();
            Assert.assertEquals(driver.findElement(By.xpath(XpathConstants.txu140Waiting.button_submitInactive)).getText(),UIElementsConstants.txu140Waiting.button_submitactive);
            driver.findElement(By.xpath(XpathConstants.txu140Waiting.button_submitInactive)).click();
            Assert.assertEquals(driver.findElement(By.xpath(XpathConstants.txu140Waiting.text_dialog_message)).getText(),UIElementsConstants.txu140Waiting.text_dialog_message);
            Assert.assertEquals(driver.findElement(By.xpath(XpathConstants.txu140Waiting.button_tip_confirmation_yes)).getText(),UIElementsConstants.txu140Waiting.button_tip_confirmation_yes);
            Assert.assertEquals(driver.findElement(By.xpath(XpathConstants.txu140Waiting.button_tip_confirmation_no)).getText(),UIElementsConstants.txu140Waiting.button_tip_confirmation_no);
            driver.findElement(By.xpath(XpathConstants.txu140Waiting.button_tip_confirmation_yes)).click();
            Assert.assertEquals(driver.findElement(By.xpath(XpathConstants.txu140Waiting.button_submitInactive)).getText(),UIElementsConstants.txu140Waiting.button_submitInactive);

            System.out.println("Total Tip"+driver.findElement(By.xpath(XpathConstants.txu140Waiting.text_tip_output)).getText() );


        }
        else{

            if(driver.findElement(By.xpath(XpathConstants.txu140Waiting.button_tip_minus)).isEnabled())
                System.out.println("Minus button Enable");
            driver.findElement(By.xpath(XpathConstants.txu140Waiting.button_tip_plus)).click();
            Assert.assertEquals(driver.findElement(By.xpath(XpathConstants.txu140Waiting.button_submitInactive)).getText(),UIElementsConstants.txu140Waiting.button_submitactive);
            driver.findElement(By.xpath(XpathConstants.txu140Waiting.button_submitInactive)).click();
            driver.findElement(By.xpath(XpathConstants.txu140Waiting.button_tip_confirmation_yes)).click();
            Assert.assertEquals(driver.findElement(By.xpath(XpathConstants.txu140Waiting.button_submitInactive)).getText(),UIElementsConstants.txu140Waiting.button_submitInactive);

            System.out.println("Total Tip"+driver.findElement(By.xpath(XpathConstants.txu140Waiting.text_tip_output)).getText() );
        }

        System.out.println("Message option is not available"+driver.findElement(By.xpath(XpathConstants.txu140Waiting.text_title_message_to_driver)).isDisplayed());





    }



}
