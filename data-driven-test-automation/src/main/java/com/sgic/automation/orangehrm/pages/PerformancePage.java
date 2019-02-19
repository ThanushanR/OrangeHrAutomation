package com.sgic.automation.orangehrm.pages;

import com.sgic.automation.orangehrm.utils.PageBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;

public class PerformancePage extends PageBase {
    private static final Logger LOGGER = Logger.getLogger(PerformancePage.class);
    private static By performancebtn=By.id("menu__Performance");
    private static By configurebtn=By.id("menu_performance_Configure");
    private static By manageReviewsbtn=By.id("menu_performance_ManageReviews");
    private static By employeeTrackersbtn=By.id("menu_performance_viewEmployeePerformanceTrackerList");
    private static By KPIsbtn=By.id("menu_performance_searchKpi");

    public static boolean isPerfomanceBtnDisplay(){
        return getDriver().findElement(performancebtn).isDisplayed();
    }
    public static void clickPerfomance(){
        getDriver().findElement(performancebtn).click();
    }
    public static boolean isConfigureBtnDisplay(){
        return getDriver().findElement(configurebtn).isDisplayed();
    }
    public static void clickConfigure(){
        getDriver().findElement(configurebtn).click();
    }
    public static boolean isKPIsBtnDisplay(){
        return getDriver().findElement(KPIsbtn).isDisplayed();
    }
    public static void clickKPIs(){
        getDriver().findElement(KPIsbtn).click();
    }


}
