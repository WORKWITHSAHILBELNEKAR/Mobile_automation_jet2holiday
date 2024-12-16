package com.jet2holiday.testcases;

import com.jet2holidays.page.PassengerDetails;
import com.jet2holidays.page.*;
import com.jet2holidays.utilites.Utilities;
import com.jet2holidays.utilites.Utilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class PassengerDetailsTest extends PassengerDetails {

    LoginPage loginPage;
    HomePage homePage;
    SearchHolidaysPage searchHolidayPage;
    SelectHolidayPackage selectHolidayPackage;
    Utilities utilities;
    PassengerDetails passengerDetails;

    @BeforeMethod
    public void setUp() throws IOException {
        initialization();
        loginPage = new LoginPage();
        homePage = new HomePage();
        searchHolidayPage = new SearchHolidaysPage();
        selectHolidayPackage = new SelectHolidayPackage();
        passengerDetails = new PassengerDetailsTest();
        utilities = new Utilities();
    }

    @Test
    public void addPassengerDetail() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        loginPage.loginUser();
        homePage.homePageAction();
        searchHolidayPage.SearchHolidays();
        selectHolidayPackage.SelectHolidaysFromList();
        passengerDetails.addPassengerDetails();
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
    }
}
