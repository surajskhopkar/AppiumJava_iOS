package TestCases;

import Utils.Configuration;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class iOSBasics extends Configuration {

    @Test
    public void BaseTest() throws InterruptedException {
        driver.findElement(AppiumBy.id("Alert Views")).click();
        Thread.sleep(3000);
        driver.findElement(AppiumBy.id("Text Entry")).click();
        Thread.sleep(3000);
        driver.findElement(AppiumBy.className("XCUIElementTypeTextField")).sendKeys("Liverpool FC");
        Thread.sleep(3000);
        driver.findElement(AppiumBy.id("OK")).click();
        Thread.sleep(3000);
        driver.findElement(AppiumBy.id("Confirm / Cancel")).click();
        Thread.sleep(3000);
        String msg = driver.findElement(AppiumBy.id("A message should be a short, complete sentence.")).getAttribute("name");
        Assert.assertEquals(msg, "A message should be a short, complete sentence.");


    }
}
