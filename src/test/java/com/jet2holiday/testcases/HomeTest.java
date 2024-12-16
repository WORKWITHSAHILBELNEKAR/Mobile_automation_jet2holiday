package com.jet2holiday.testcases;

import com.jet2holidays.page.HomePage;
import com.jet2holidays.page.LoginPage;
import com.jet2holidays.utilites.Utilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class HomeTest extends HomePage {
    LoginPage loginPage;
    HomePage homePage;
    Utilities utilities;

    @BeforeMethod
    public void setUp() throws IOException {
        initialization();
        loginPage = new LoginPage();
        homePage = new HomePage();
        utilities = new Utilities();
    }


    @Test
    public void Home() throws InterruptedException {
        loginPage.loginUser();
        homePage.homePageAction();
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
    }
}
