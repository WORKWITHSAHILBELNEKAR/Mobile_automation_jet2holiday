package com.jet2holiday.testcases;


import com.jet2holidays.page.*;
import com.jet2holidays.utilites.Utilities;
import com.jet2holidays.utilites.Utilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class PaymentTest extends PaymentPage {

    LoginPage loginPage;
    HomePage homePage;
    SearchHolidaysPage searchHolidayPage;
    SelectHolidayPackage selectHolidayPackage;
    Utilities utilities;
    PassengerDetails passengerDetails;
    PaymentPage paymentPage;

    @BeforeMethod
    public void setUp() throws IOException {
        initialization();
        loginPage = new LoginPage();
        homePage = new HomePage();
        searchHolidayPage = new SearchHolidaysPage();
        selectHolidayPackage = new SelectHolidayPackage();
        passengerDetails = new PassengerDetailsTest();
        utilities = new Utilities();
        paymentPage = new PaymentPage();
    }

    @Test
    public void PaymentTest() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        loginPage.loginUser();
        homePage.homePageAction();
        searchHolidayPage.SearchHolidays();
        selectHolidayPackage.SelectHolidaysFromList();
        passengerDetails.addPassengerDetails();
        paymentPage.makePayment();
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
    }
}
