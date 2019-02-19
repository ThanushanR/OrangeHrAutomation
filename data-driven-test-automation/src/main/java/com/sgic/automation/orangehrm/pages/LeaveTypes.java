package com.sgic.automation.orangehrm.pages;

import org.openqa.selenium.By;

import static com.sgic.automation.orangehrm.utils.PageBase.*;

public class LeaveTypes {

    private static By menuLeaveType = By.id("menu_leave_leaveTypeList");
    private static By leaveTypeHeader = By.id("search-results");
    private static By leaveTypeBtnAdd = By.id("btnAdd");
    private static By leaveTypeBtnDelete = By.id("btnDelete");
    private static By leaveTypeCheckbox = By.id("ohrmList_chkSelectRecord_5");
    private static By leaveTypeDeleteConfirmation = By.id("deleteConfModal");
    private static By leaveTypeDeleteConfirmationOk = By.id("dialogDeleteBtn");
    private static By leaveTypeDeleteConfirmationCancel = By.xpath("/html/body/div[1]/div[3]/div[2]/div[3]/input[2]");
    private static By leaveTypeAddCheckBox = By.id("leaveType_excludeIfNoEntitlement");
    private static By leaveTypeAddSave = By.id("saveButton");
    private static By leaveTypeAddCancel = By.id("backButton");
    private static By LeaveTypeName = By.id("leaveType_txtLeaveTypeName");

    public static boolean isLeaveTypeHeaderDisplay(){
        return getDriver().findElement(leaveTypeHeader).isDisplayed();
    }
    public static void clickMenuLeaveType() {
        getDriver().findElement(menuLeaveType).click();
    }
    public static void clickLeaveTypeBtnAdd() {

        getDriver().findElement(leaveTypeBtnAdd).click();
    }
    public static void setLeaveTypeName(String leaveType_txtLeaveTypeName) {
        getDriver().findElement(LeaveTypeName).sendKeys(leaveType_txtLeaveTypeName);
    }
    public static void clickLeaveTypeAddCheckbox() {

        getDriver().findElement(leaveTypeAddCheckBox).click();
    }
    public static void clickLeaveTypeAddSave() {

        getDriver().findElement(leaveTypeAddSave).click();
    }
    public static void clickLeaveTypeCheckbox() {

        getDriver().findElement(leaveTypeCheckbox).click();
    }
    public static void clickLeaveTypeBtnDelete() {

        getDriver().findElement(leaveTypeBtnDelete).click();
    }
    public static boolean isleaveTypeDeleteConfirmationDisplay(){
        return getDriver().findElement(leaveTypeDeleteConfirmation).isDisplayed();
    }
    public static void clickLeaveTypeDeleteConfirmationOk() {

        getDriver().findElement(leaveTypeDeleteConfirmationOk).click();
    }
    public static void clickLeaveTypeDeleteConfirmationCancel() {

        getDriver().findElement(leaveTypeDeleteConfirmationCancel).click();
    }
    public static void AddLeaveType(String LeaveTypeName){

        LeaveTypes.setLeaveTypeName(LeaveTypeName);
        LeaveTypes.clickLeaveTypeAddCheckbox();
        staticWait(2);
    }
}
