package com.sgic.automation.orangehrm.tests;

import com.sgic.automation.orangehrm.TestData.LoginDemo;
import com.sgic.automation.orangehrm.pages.DashBoardPage;
import com.sgic.automation.orangehrm.pages.LoginPage;
import com.sgic.automation.orangehrm.utils.Constants;
import com.sgic.automation.orangehrm.utils.TestBase;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import sun.plugin2.message.Message;

public class DemoLogin extends TestBase{

        private static final Logger LOGGER = Logger.getLogger(LoginDemo.class);

        @Test( priority = 0,dataProviderClass = LoginDemo.class,dataProvider = "loginValid")
        public void loginValid(String username,String password ) {
            LOGGER.info("Login page is displayed");
            softAssert.assertTrue(LoginPage.isLoginPageDisplay(), "Login Page is not Displayed");
            LOGGER.info("Login with  "+"UserName: "+ username+" , Pasword: "+password);
            LoginPage.login(username,password);
            LOGGER.info("DashBoardPage is displayed");
            softAssert.assertTrue(DashBoardPage.isDashboardDisplayed(),"Dashboard page is not displayed");
            softAssert.assertTrue(DashBoardPage.isWelcomeAdminbtnDisplayed() ,"Welcom admin button  is not Displayed");
            DashBoardPage.clickWelcomeAdminbtn();
            LOGGER.info("logout success");
            DashBoardPage.clickLogoutbtn();

            softAssert.assertAll();
        }


        @Test( priority = 0,dataProviderClass = LoginDemo.class,dataProvider = "Invalid_Login")
        public void loginInValid(String userName, String password,String alertMSg) {
            LOGGER.info("Login page is displayed");
            softAssert.assertTrue(LoginPage.isLoginPageDisplay(), "Login Page is not Displayed");
            LOGGER.info("Login with  " + "UserName: " + userName + " , Pasword: " + password);
            LoginPage.login(userName, password);
            LOGGER.info(alertMSg);
            softAssert.assertEquals(LoginPage.getLoginAlert(), alertMSg, "Alert Message Not Displayed");
            softAssert.assertAll();
        }
    }

