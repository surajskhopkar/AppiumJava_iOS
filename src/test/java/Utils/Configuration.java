package Utils;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.options.XCUITestOptions;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.testng.annotations.Test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class Configuration {
    public AppiumDriverLocalService service;
    public IOSDriver driver;

    @Test
    public void ConfigureAppium() throws MalformedURLException, InterruptedException {
        service = new AppiumServiceBuilder().withAppiumJS(new File("//usr//local//lib//node_modules//appium//build//lib//main.js"))
                .withIPAddress("127.0.0.1").usingPort(4723).build();
        service.start();

        XCUITestOptions options = new XCUITestOptions();
        options.setDeviceName("iPhone 15");
        options.setApp("//Users//surajkhopkar//Library//Developer//Xcode//DerivedData//UIKitCatalog-esvzejjjvuqthwbwcttvoakqezrp//" +
                "Build//Products//Debug-iphonesimulator//UIKitCatalog.app");
        options.setPlatformVersion("17.4");

        //Appium - Webdriver Agent -> iOS App
        options.setWdaLaunchTimeout(Duration.ofSeconds(20));

        driver = new IOSDriver(new URL("http://127.0.0.1:4723"), options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        Thread.sleep(15000);








    }
}
