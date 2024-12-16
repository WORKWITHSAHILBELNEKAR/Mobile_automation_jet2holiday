package com.jet2holiday.testcases;

import com.jet2holidays.page.HomePage;
import com.jet2holidays.page.LoginPage;
import com.jet2holidays.page.SearchHolidaysPage;
import com.jet2holidays.page.SelectHolidayPackage;
import com.jet2holidays.utilites.Utilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class SelectHolidaysPackageTest extends SelectHolidayPackage {
    LoginPage loginPage;
    HomePage homePage;
    SearchHolidaysPage searchHolidayPage;
    SelectHolidayPackage selectHolidayPackage;
    Utilities utilities;

    @BeforeMethod
    public void setUp() throws IOException {
        initialization();
        loginPage = new LoginPage();
        homePage = new HomePage();
        searchHolidayPage = new SearchHolidaysPage();
        selectHolidayPackage = new SelectHolidayPackage();
        utilities = new Utilities();
    }


    @Test
    public void SelectHolidays() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        loginPage.loginUser();
        homePage.homePageAction();
        searchHolidayPage.SearchHolidays();
        selectHolidayPackage.SelectHolidaysFromList();
    }

    @Test
    public void SelectLowPriceHolidays() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        loginPage.loginUser();
        homePage.homePageAction();
        searchHolidayPage.SearchLowPriceHolidays();
        selectHolidayPackage.SelectLowPriceHolidaysFromList();
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
    }
}

