package com.sgic.automation.orangehrm.pages;

import com.sgic.automation.orangehrm.utils.PageBase;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import static com.sgic.automation.orangehrm.utils.PageBase.*;

public class AssignLeave {

    private static By assignLeaveHeader = By.id("assign-leave");
    private static By menuAssignLeave = By.id("menu_leave_assignLeave");
    private static By employeeName = By.id("assignleave_txtEmployee_empName");
    private static By leaveType = By.id("assignleave_txtLeaveType");
    private static By leaveBalance = By.id("menu_leave_assignLeave");
    private static By fromDate = By.id("assignleave_txtFromDate");
    private static By toDate = By.id("assignleave_txtToDate");
    private static By partialDays = By.id("assignleave_partialDays");
    private static By specifictime = By.id("assignleave_firstDuration_duration");
    private static By specifictimeFrom = By.id("assignleave_firstDuration_time_from");
    private static By specifictimeTo = By.id("assignleave_firstDuration_time_to");
    private static By comment = By.id("assignleave_txtComment");
    private static By assignBtn = By.id("assignBtn");
    private static By confirmationPopoup = By.id("leaveBalanceConfirm");
    private static By okbtn = By.id("confirmOkButton");
    private static By cancelBtn = By.id("confirmCancelButton");
    private static By duration = By.id("assignleave_duration_duration");

    public static boolean isAssignLeaveHeaderDisplayed(){

        return getDriver().findElement(assignLeaveHeader).isDisplayed();
    }
    public static void clickMenuAssignLeave() {

        getDriver().findElement(menuAssignLeave).click();
    }
    public static void setEmployeeName( String assignleave_txtEmployee_empName ) {
        getDriver().findElement(employeeName).sendKeys(assignleave_txtEmployee_empName);
    }
    public static void setLeaveType(String assignleave_txtFromDate) {
        Select dropDownOption = new Select(getDriver().findElement(leaveType));
        dropDownOption.selectByVisibleText(assignleave_txtFromDate);
    }
    public static void setFromDate(String holiday_date) {
        getDriver().findElement(fromDate).clear();
        getDriver().findElement(fromDate).sendKeys(holiday_date);
    }
    public static void setToDate(String assignleave_txtToDate) {
        getDriver().findElement(toDate).clear();
        getDriver().findElement(toDate).sendKeys(assignleave_txtToDate);
    }
    public static void setPartialDays(String assignleave_partialDays) {
        Select dropDownOption = new Select(getDriver().findElement(partialDays));
        dropDownOption.selectByVisibleText(assignleave_partialDays);
    }
    public static void setSpecifictime(String assignleave_firstDuration_duration) {
        Select dropDownOption = new Select(getDriver().findElement(specifictime));
        dropDownOption.selectByVisibleText(assignleave_firstDuration_duration);
    }
    public static void setSpecifictimeFrom(String assignleave_firstDuration_time_from) {
        Select dropDownOption = new Select(getDriver().findElement(specifictimeFrom));
        dropDownOption.selectByVisibleText(assignleave_firstDuration_time_from);
    }
    public static void setSpecifictimeTo(String assignleave_firstDuration_time_to) {
        Select dropDownOption = new Select(getDriver().findElement(specifictimeTo));
        dropDownOption.selectByVisibleText(assignleave_firstDuration_time_to);
    }
    public static void setComment(String assignleave_txtComment) {
        getDriver().findElement(comment).clear();
        getDriver().findElement(comment).sendKeys(assignleave_txtComment);
    }
    public static void setDuration(String assignleave_duration_duration) {
        Select dropDownOption = new Select(getDriver().findElement(duration));
        dropDownOption.selectByVisibleText(assignleave_duration_duration);
    }
    public static void clickAssignBtn() {
        getDriver().findElement(assignBtn).click();
    }
    public static boolean isConfirmationPopoupDisplayed(){
        PageBase.implicitWait(3);
        return getDriver().findElement(confirmationPopoup).isDisplayed();
    }

    public static void clickOkbtn() {
        getDriver().findElement(okbtn).click();
    }
    public static void clickCancelbtn() {
        getDriver().findElement(cancelBtn).click();
    }
    public static void AssignLeaveData(String employeeName, String leaveType,String fromDate,String toDate,String duration, String comment){
        staticWait(3);
        AssignLeave.setEmployeeName(employeeName);
        staticWait(3);
        AssignLeave.setLeaveType(leaveType);
        staticWait(3);
        AssignLeave.setFromDate(fromDate);
        staticWait(3);
        AssignLeave.setToDate(toDate);
        staticWait(3);
        AssignLeave.setDuration(duration);
        staticWait(3);
        AssignLeave.setComment(comment);
        implicitWait(2);
    }
}
