package com.sgic.automation.orangehrm.pages;

import com.sgic.automation.orangehrm.utils.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.sgic.automation.orangehrm.utils.PageBase.getDriver;
import static com.sgic.automation.orangehrm.utils.PageBase.implicitWait;

public class Holidays {

    private static By menuHoliday= By.id("menu_leave_viewHolidayList");
    private static By holidayInformationHeader= By.id("holiday-information");
    private static By calenderFrom= By.id("calFromDate");
    private static By calenderTo= By.id("calToDate");
    private static By btnSearch= By.id("btnSearch");
    private static By btnAdd= By.id("btnAdd");
    private static By btnDelete= By.id("btnDelete");
    private static By addHolidayHeader= By.id("locationHeading");
    private static By addHolidayName= By.id("holiday_description");
    private static By addHolidayCalender= By.xpath("//*[@id=\"frmHoliday\"]/fieldset/ol/li[2]/img");
    private static By clickCalenderMonth = By.className("ui-datepicker-month");
    private static By clickCalenderYear = By.className("ui-datepicker-year");
    private static By calenderDate = By.id("holiday_date");
    private static By addHolidayRecurring= By.id("holiday_recurring");
    private static By addHolidayLength= By.id("holiday_length");
    private static By btnSave= By.id("saveBtn");
    private static By btnCancel= By.id("btnCancel");
    private static By noRecords= By.xpath("//*[@id=\"resultTable\"]/tbody/tr/td");
    private static By deleteCheckboxClick= By.id("ohrmList_chkSelectAll");
    private static By btnDeleteHoliday= By.id("btnDelete");
    private static By deleteHolidayConfirmationHeader= By.id("deleteConfModal");
    private static By deleteHolidayOk= By.id("dialogDeleteBtn");
    private static By deleteHolidayCancel= By.xpath("//*[@id=\"deleteConfModal\"]/div[3]/input[2]");




    public static boolean isholidayInformationHeaderDisplay(){
        return getDriver().findElement(holidayInformationHeader).isDisplayed();
    }
    public static void clickMenuHoliday()
    {
        getDriver().findElement(menuHoliday).click();
    }
    public static void clickCalenderFrom()
    {
        getDriver().findElement(calenderFrom).click();
    }
    public static void setCalenderFrom(String calFromDate) {
        getDriver().findElement(calenderFrom).clear();
        getDriver().findElement(calenderFrom).sendKeys(calFromDate);
    }
    public static void setCalenderTo(String calToDate) {
        getDriver().findElement(calenderTo).clear();
        getDriver().findElement(calenderTo).sendKeys(calToDate);
    }
    public static void setAddHolidayName(String holiday_description) {
        getDriver().findElement(addHolidayName).sendKeys(holiday_description);
    }
    public static void setHolidayLength(String holiday_length) {
        getDriver().findElement(addHolidayLength).sendKeys(holiday_length);
    }
    public static void clickBtnSearch()
    {
        getDriver().findElement(btnSearch).click();
    }
    public static void clickBtnAdd()
    {

        getDriver().findElement(btnAdd).click();
    }
    public static void clickBtnDelete()
    {
        getDriver().findElement(btnDelete).click();
    }
    public static void clickAddHolidayCalender()
    {
        getDriver().findElement(addHolidayCalender).click();
    }
    public static void setCalenderDate(String holiday_date) {
        getDriver().findElement(calenderDate).clear();
        getDriver().findElement(calenderDate).sendKeys(holiday_date);
    }
    public static void clickHolidayRecurring() {
        WebElement checkbox = getDriver().findElement(addHolidayRecurring);
        if (checkbox.isSelected())
            checkbox.click();
    }
    public static boolean isAddHolidayHeaderDisplay(){
        return getDriver().findElement(addHolidayHeader).isDisplayed();
    }
    public static void clickBtnSave() {

        getDriver().findElement(btnSave).click();
    }
    public static void clickBtnCancel()
    {
        getDriver().findElement(btnCancel).click();
    }
    public static void clickDeleteCheckBoxClick()
    {
        getDriver().findElement(deleteCheckboxClick).click();
    }

    public static void clickBtnDeleteHoliday()
    {
        getDriver().findElement(btnDeleteHoliday).click();
    }
    public static boolean isDeleteHolidayConfirmationHeaderDisplay(){
        return getDriver().findElement(deleteHolidayConfirmationHeader).isDisplayed();
    }
    public static void clickDeleteHolidayOk()
    {
        getDriver().findElement(deleteHolidayOk).click();
    }
    public static void clickDeleteHolidayCancel()
    {
        getDriver().findElement(deleteHolidayCancel).click();
    }

    public static void SearchHolidays(String calFromDate, String calToDate){
    Holidays.setCalenderFrom(calFromDate);
    Holidays.setCalenderTo(calToDate);
    implicitWait(10);
    }
    public static void AddHolidays(String addHolidayName, String calenderDate,String addHolidayLength){

        Holidays.setAddHolidayName(addHolidayName);
        Holidays.setCalenderDate(calenderDate);
        Holidays.clickHolidayRecurring();
        Holidays.setHolidayLength(addHolidayLength);
        implicitWait(2);
    }

}

