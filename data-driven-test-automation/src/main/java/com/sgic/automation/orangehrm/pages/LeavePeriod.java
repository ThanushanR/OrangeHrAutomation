package com.sgic.automation.orangehrm.pages;

import org.openqa.selenium.By;

import static com.sgic.automation.orangehrm.utils.PageBase.*;

public class LeavePeriod {

    private static By LeaveModule = By.id("menu_leave_viewLeaveModule");
    private static By leavePeriod = By.id("locationHeading");
    private static By menuConfigure = By.id("menu_leave_Configure");
    private static By menuLeavePeriod = By.id("menu_leave_defineLeavePeriod");
    private static By btnEdit = By.id("btnEdit");
    private static By leavePeriodStartMonth = By.id("leaveperiod_cmbStartMonth");
    private static By leavePeriodStartDate = By.id("leaveperiod_cmbStartDate");
    private static By btnSave = By.id("btnEdit");

    public static boolean isLeavePeriodDisplay(){

        return getDriver().findElement(leavePeriod).isDisplayed();
    }

    public static void clickLeaveModule() {

        getDriver().findElement(LeaveModule).click();
    }
    public static void clickMenuConfigure() {

        getDriver().findElement(menuConfigure).click();
    }
    public static void clickMenuLeavePeriod() {

        getDriver().findElement(menuLeavePeriod).click();
    }

    public static void clickBtnEdit() {

        getDriver().findElement(btnEdit).click();
    }

    public static void setleavePeriodStartMonth(String leaveperiod_cmbStartMonth) {
        getDriver().findElement(leavePeriodStartMonth).sendKeys(leaveperiod_cmbStartMonth);
    }

    public static void setleavePeriodStartDate(String leaveperiod_cmbStartDate) {
        getDriver().findElement(leavePeriodStartDate).sendKeys(leaveperiod_cmbStartDate);
    }
    public static void clickbtnSave() {
        getDriver().findElement(btnSave).click();
    }
    public static void EditLeavePeriod(String leavePeriodStartMonth, String leavePeriodStartDate){
        staticWait(2);
        LeavePeriod.setleavePeriodStartMonth(leavePeriodStartMonth);
        staticWait(2);
        LeavePeriod.setleavePeriodStartDate(leavePeriodStartDate);
        implicitWait(2);
    }
}