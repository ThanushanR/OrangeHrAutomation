package com.sgic.automation.orangehrm.pages;

import com.sgic.automation.orangehrm.utils.PageBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;

import static com.sgic.automation.orangehrm.utils.PageBase.getDriver;
import static com.sgic.automation.orangehrm.utils.PageBase.implicitWait;

public class DashBoardPage {
    private static final Logger LOGGER = Logger.getLogger(LoginPage.class);
    private static By dashboardHeading=By.xpath("//*[@id=\"content\"]/div/div[1]/h1");
    private static By welcomeAdminbtn=By.id("welcome");
    private static By logoutbtn=By.xpath("//*[@id=\"welcome-menu\"]/ul/li[2]/a");

    public static boolean isDashboardDisplayed(){
        return  getDriver().findElement(dashboardHeading).isDisplayed();
    }
    public static boolean isWelcomeAdminbtnDisplayed(){
        return getDriver().findElement(welcomeAdminbtn).isDisplayed();
    }
    public static void clickWelcomeAdminbtn(){
        getDriver().findElement(welcomeAdminbtn).click();
    }
    public static void addLeaveEntitlements(){

    }
    public static void clickLogoutbtn(){
        implicitWait(3);
        getDriver().findElement(logoutbtn).click();
    }
}
