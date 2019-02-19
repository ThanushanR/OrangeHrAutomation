package com.sgic.automation.orangehrm.tests;

import com.sgic.automation.orangehrm.pages.LoginPage;
import com.sgic.automation.orangehrm.utils.TestBase;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Perfomance extends TestBase {
    @Test( priority = 0)
    public void addKIPs() {
        softAssert = new SoftAssert();
        softAssert.assertTrue(LoginPage.isLoginPageDisplay(), "Login Page is not Displayed");

        LoginPage.setUserName("Admin");
        LoginPage.setPassword("admin123");
        LoginPage.clickLogin();
        //softAssert.assertTrue(LoginPage.isLoginAlertDisplay(),"Alert is not Displayed");

        softAssert.assertAll();
    }
}
