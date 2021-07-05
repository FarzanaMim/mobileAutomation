package TaxiUser.taxi_service_impl;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import TaxiUser.taxi_lib.UIElementsConstants;
import TaxiUser.taxi_lib.XpathConstants;
import TaxiUser.taxi_service_interfaces.TU120_Designating_inter;
import TaxiUser.taxi_service_interfaces.TU130_BroadcastRequesting_inter;
import TaxiUser.taxi_service_interfaces.TU140_WaitingPage_inter;
import io.appium.java_client.AppiumDriver;

/**
 * Created by user on 11/27/2017.
 */

public class TU140_WiatingPage_ServiceImpl implements TU140_WaitingPage_inter {
    private TU130_BroadcastRequesting_inter broadcastReq=new TU130_BroadcastRequesting_ser_Impl();
    private TU120_Designating_inter designatedReq=new TU120_DesignatingReq_Service_impl();


    public void broadcastReq_text_functionalityVerification(AppiumDriver driver){



        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(XpathConstants.txu140Waiting.title)));
        Assert.assertEquals(driver.findElement(By.xpath(XpathConstants.txu140Waiting.title)).getText(), UIElementsConstants.txu140Waiting.title);
        Assert.assertEquals(driver.findElement(By.xpath(XpathConstants.txu140Waiting.headermsg)).getText(),UIElementsConstants.txu140Waiting.headermsg);
        driver.findElement(By.xpath(XpathConstants.txu140Waiting.GoBackToDefaultButton)).isEnabled();
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




        driver.scrollTo("建物名や乗車位置の詳細情報、乗車時のお願いなどをドライバーに伝えることができます。");
        Assert.assertEquals(driver.findElement(By.xpath(XpathConstants.txu140Waiting.text_title_message_to_driver)).getText(),UIElementsConstants.txu140Waiting.text_title_message_to_driver);
        Assert.assertEquals(driver.findElement(By.xpath(XpathConstants.txu140Waiting.text_input_message)).getText(),UIElementsConstants.txu140Waiting.text_input_message);
        Assert.assertEquals(driver.findElement(By.xpath(XpathConstants.txu140Waiting.text_message_send_message_to_driver)).getText(),UIElementsConstants.txu140Waiting.text_message_send_message_to_driver);

        if(driver.findElement(By.xpath(XpathConstants.txu140Waiting.button_send_message_to_driver)).isEnabled())
        {
            Assert.assertEquals(driver.findElement(By.xpath(XpathConstants.txu140Waiting.button_send_message_to_driver)).getText(),UIElementsConstants.txu140Waiting.button_send_message_to_driver_active);
            driver.findElement(By.xpath(XpathConstants.txu140Waiting.button_send_message_to_driver)).click();
            Assert.assertEquals(driver.findElement(By.xpath(XpathConstants.txu140Waiting.button_send_message_to_driver)).getText(),UIElementsConstants.txu140Waiting.button_send_message_to_driver_inactive);
        }
        else
            {
              Assert.assertEquals(driver.findElement(By.xpath(XpathConstants.txu140Waiting.button_send_message_to_driver)).getText(),UIElementsConstants.txu140Waiting.button_send_message_to_driver_inactive);
              driver.findElement(By.xpath(XpathConstants.txu140Waiting.text_input_message)).click();

              driver.findElement(By.xpath(XpathConstants.txu140Waiting.text_input_message)).sendKeys("hello this is new message");
              Assert.assertEquals(driver.findElement(By.xpath(XpathConstants.txu140Waiting.button_send_message_to_driver)).getText(),UIElementsConstants.txu140Waiting.button_send_message_to_driver_active);

              driver.findElement(By.xpath(XpathConstants.txu140Waiting.button_send_message_to_driver)).click();
              Assert.assertEquals(driver.findElement(By.xpath(XpathConstants.txu140Waiting.button_send_message_to_driver)).getText(),UIElementsConstants.txu140Waiting.button_send_message_to_driver_inactive);

        }

        Assert.assertEquals(driver.findElement(By.xpath(XpathConstants.txu140Waiting.phonetextView)).getText(),UIElementsConstants.txu140Waiting.phonetextView);

        driver.findElement(By.xpath(XpathConstants.txu140Waiting.button_call_driver)).isEnabled();

        Assert.assertEquals(driver.findElement(By.xpath(XpathConstants.txu140Waiting.button_cancel_request)).getText(),UIElementsConstants.txu140Waiting.button_cancel_request);

        driver.findElement(By.xpath(XpathConstants.txu140Waiting.button_cancel_request)).isEnabled();
        driver.findElement(By.xpath(XpathConstants.txu140Waiting.minimizeImageButton)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(XpathConstants.txu140Waiting.driverArrivalMesg)));
        Assert.assertEquals(driver.findElement(By.xpath(XpathConstants.txu140Waiting.driverArrivalMesg)).getText(),UIElementsConstants.txu140Waiting.text_message_driver_arrival);
        driver.findElement(By.xpath(XpathConstants.txu140Waiting.arrivalOk)).click();
















    }

    public void designatedReq_text_functionalityVerification(AppiumDriver driver){



        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(XpathConstants.txu140Waiting.title)));
        Assert.assertEquals(driver.findElement(By.xpath(XpathConstants.txu140Waiting.title)).getText(), UIElementsConstants.txu140Waiting.title);
        Assert.assertEquals(driver.findElement(By.xpath(XpathConstants.txu140Waiting.headermsg)).getText(),UIElementsConstants.txu140Waiting.headermsg);
        driver.findElement(By.xpath(XpathConstants.txu140Waiting.GoBackToDefaultButton)).isEnabled();
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




        driver.scrollTo("建物名や乗車位置の詳細情報、乗車時のお願いなどをドライバーに伝えることができます。");
        Assert.assertEquals(driver.findElement(By.xpath(XpathConstants.txu140Waiting.text_title_message_to_driver)).getText(),UIElementsConstants.txu140Waiting.text_title_message_to_driver);
        Assert.assertEquals(driver.findElement(By.xpath(XpathConstants.txu140Waiting.text_input_message)).getText(),UIElementsConstants.txu140Waiting.text_input_message);
        Assert.assertEquals(driver.findElement(By.xpath(XpathConstants.txu140Waiting.text_message_send_message_to_driver)).getText(),UIElementsConstants.txu140Waiting.text_message_send_message_to_driver);

        if(driver.findElement(By.xpath(XpathConstants.txu140Waiting.button_send_message_to_driver)).isEnabled())
        {
            Assert.assertEquals(driver.findElement(By.xpath(XpathConstants.txu140Waiting.button_send_message_to_driver)).getText(),UIElementsConstants.txu140Waiting.button_send_message_to_driver_active);
            driver.findElement(By.xpath(XpathConstants.txu140Waiting.button_send_message_to_driver)).click();
            Assert.assertEquals(driver.findElement(By.xpath(XpathConstants.txu140Waiting.button_send_message_to_driver)).getText(),UIElementsConstants.txu140Waiting.button_send_message_to_driver_inactive);
        }
        else
        {
            Assert.assertEquals(driver.findElement(By.xpath(XpathConstants.txu140Waiting.button_send_message_to_driver)).getText(),UIElementsConstants.txu140Waiting.button_send_message_to_driver_inactive);
            driver.findElement(By.xpath(XpathConstants.txu140Waiting.text_input_message)).click();

            driver.findElement(By.xpath(XpathConstants.txu140Waiting.text_input_message)).sendKeys("hello this is new message");
            Assert.assertEquals(driver.findElement(By.xpath(XpathConstants.txu140Waiting.button_send_message_to_driver)).getText(),UIElementsConstants.txu140Waiting.button_send_message_to_driver_active);

            driver.findElement(By.xpath(XpathConstants.txu140Waiting.button_send_message_to_driver)).click();
            Assert.assertEquals(driver.findElement(By.xpath(XpathConstants.txu140Waiting.button_send_message_to_driver)).getText(),UIElementsConstants.txu140Waiting.button_send_message_to_driver_inactive);

        }

        Assert.assertEquals(driver.findElement(By.xpath(XpathConstants.txu140Waiting.phonetextView)).getText(),UIElementsConstants.txu140Waiting.phonetextView);

        driver.findElement(By.xpath(XpathConstants.txu140Waiting.button_call_driver)).isEnabled();

        Assert.assertEquals(driver.findElement(By.xpath(XpathConstants.txu140Waiting.button_cancel_request)).getText(),UIElementsConstants.txu140Waiting.button_cancel_request);

        driver.findElement(By.xpath(XpathConstants.txu140Waiting.button_cancel_request)).isEnabled();
        driver.findElement(By.xpath(XpathConstants.txu140Waiting.minimizeImageButton)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(XpathConstants.txu140Waiting.driverArrivalMesg)));
        Assert.assertEquals(driver.findElement(By.xpath(XpathConstants.txu140Waiting.driverArrivalMesg)).getText(),UIElementsConstants.txu140Waiting.text_message_driver_arrival);
        driver.findElement(By.xpath(XpathConstants.txu140Waiting.arrivalOk)).click();














    }







}
