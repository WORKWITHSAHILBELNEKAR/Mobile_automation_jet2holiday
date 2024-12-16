package com.jet2holiday.testcases;


import com.jet2holidays.page.LoginPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class LoginTest extends LoginPage {

    LoginPage loginPage;


    @BeforeMethod
    public void setUp() throws IOException {
        initialization();
        loginPage = new LoginPage();

    }


    @Test
    public void Login() throws InterruptedException {
        loginPage.loginUser();
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
    }
}
