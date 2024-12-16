package com.jet2holidays.base;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BasePage {

    public static AndroidDriver driver;

    public BasePage(){
        PageFactory.initElements(driver,this);
    }

    public void initialization() throws IOException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
//        capabilities.setCapability("appium:automationName","UIAutomator2");
//        capabilities.setCapability("appium:noReset",true);
        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("PlatformVersion", "9.0");
        capabilities.setCapability("deviceName","emulator-5554");
//        capabilities.setCapability("appPackage","com.jet2.holidays");
//        capabilities.setCapability("appActivity","com.jet2.holidays.ui.activity.MainActivity");
        capabilities.setCapability("app","C:\\jet\\Jet2 - Holidays & Flights_10.7.0_APKPure.xapk");

        capabilities.setCapability("autoGrantPermissions", false);
        driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
        System.out.println("automation started");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

}
