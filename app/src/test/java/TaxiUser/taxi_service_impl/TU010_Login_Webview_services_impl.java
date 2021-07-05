package TaxiUser.taxi_service_impl;

import org.openqa.selenium.By;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import TaxiUser.taxi_service_interfaces.TU010_Login_WebView_inter;
import io.appium.java_client.AppiumDriver;

/**
 * Created by user on 11/23/2017.
 */

public class TU010_Login_Webview_services_impl implements TU010_Login_WebView_inter {

    public void login_webview(AppiumDriver driver) throws InterruptedException
    {

        Set<String> availableContexts = driver.getContextHandles();
        System.out.println("Total No of Context Found After we reach to WebView = "+ availableContexts.size());
        for(String context : availableContexts) {
            if(context.contains("WEBVIEW")){
                System.out.println("Context Name is " + context);
                driver.manage().timeouts().implicitlyWait(160, TimeUnit.SECONDS);
                // 4.3 Call context() method with the id of the context you want to access and change it to WEBVIEW_1
                //(This puts Appium session into a mode where all commands are interpreted as being intended for automating the web view)
                driver.context(context);
                driver.manage().timeouts().implicitlyWait(160, TimeUnit.SECONDS);
                System.out.print("null");
                break;
            }
        }
        driver.manage().timeouts().implicitlyWait(160, TimeUnit.SECONDS);
        System.out.print("null");
        driver.findElement(By.xpath("/html[1]/body[1]/app-login[1]/div[1]/div[1]/a[3]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html[1]/body[1]/app-email[1]/div[1]/div[3]/form[1]/div[1]/input[1]")).click();
        driver.findElement(By.xpath("/html[1]/body[1]/app-email[1]/div[1]/div[3]/form[1]/div[1]/input[1]")).sendKeys("mimfarzana91@gmail.com");
        driver.findElement(By.xpath("/html[1]/body[1]/app-email[1]/div[1]/div[3]/form[1]/button[1]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html[1]/body[1]/app-password[1]/div[1]/div[2]/form[1]/div[2]/input[1]")).click();
        driver.findElement(By.xpath("/html[1]/body[1]/app-password[1]/div[1]/div[2]/form[1]/div[2]/input[1]")).sendKeys("abcd1234");
        driver.findElement(By.xpath("/html[1]/body[1]/app-password[1]/div[1]/div[2]/form[1]/button[1]")).click();
        for(String context : availableContexts) {
            if(context.contains("NATIVE")){
                System.out.println("We are Back to " + context);
                driver.context(context);

            }
        }




    }
}
