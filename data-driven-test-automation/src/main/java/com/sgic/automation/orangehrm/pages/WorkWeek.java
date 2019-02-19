package com.sgic.automation.orangehrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import static com.sgic.automation.orangehrm.utils.PageBase.getDriver;
import static com.sgic.automation.orangehrm.utils.PageBase.implicitWait;

public class WorkWeek {

    private static By menuEditWorkWeek= By.id("menu_leave_defineWorkWeek");
    private static By editWorkWeekHeader= By.id("locationHeading");
    private static By workWeekMonday= By.id("WorkWeek_day_length_Monday");
    private static By workWeekTuesday= By.id("WorkWeek_day_length_Tuesday");
    private static By workWeekWednesday= By.id("WorkWeek_day_length_Wednesday");
    private static By workWeekThursday= By.id("WorkWeek_day_length_Thursday");
    private static By workWeekFriday= By.id("WorkWeek_day_length_Friday");
    private static By workWeekSaturday= By.id("WorkWeek_day_length_Saturday");
    private static By workWeekSunday= By.id("WorkWeek_day_length_Sunday");
    private static By editBtn= By.id("saveBtn");

    public static boolean iseditWorkWeekHeaderDisplay(){
        return getDriver().findElement(editWorkWeekHeader).isDisplayed();
    }
    public static void clickMenuEditWorkWeek() {
        getDriver().findElement(menuEditWorkWeek).click();
    }
    public static void clickeditBtn() {
        getDriver().findElement(editBtn).click();
    }
    public static void setWorkWeekMonday(String WorkWeek_day_length_Monday) {
        Select dropDownOption = new Select(getDriver().findElement(workWeekMonday));
        dropDownOption.selectByVisibleText(WorkWeek_day_length_Monday);
    }
    public static void setWorkWeekTuesday(String WorkWeek_day_length_Tuesday) {
        Select dropDownOption = new Select(getDriver().findElement(workWeekTuesday));
        dropDownOption.selectByVisibleText(WorkWeek_day_length_Tuesday);
    }
    public static void setWorkWeekWednesday(String WorkWeek_day_length_Tuesday) {
        Select dropDownOption = new Select(getDriver().findElement(workWeekWednesday));
        dropDownOption.selectByVisibleText(WorkWeek_day_length_Tuesday);
    }
    public static void setWorkWeekThursday(String WorkWeek_day_length_Thursday) {
        Select dropDownOption = new Select(getDriver().findElement(workWeekThursday));
        dropDownOption.selectByVisibleText(WorkWeek_day_length_Thursday);
    }
    public static void setWorkWeekFriday(String WorkWeek_day_length_Friday) {
        Select dropDownOption = new Select(getDriver().findElement(workWeekFriday));
        dropDownOption.selectByVisibleText(WorkWeek_day_length_Friday);
    }
    public static void setWorkWeekSaturday(String WorkWeek_day_length_Saturday) {
        Select dropDownOption = new Select(getDriver().findElement(workWeekSaturday));
        dropDownOption.selectByVisibleText(WorkWeek_day_length_Saturday);
    }
    public static void setWorkWeekSunday(String WorkWeek_day_length_Sunday) {
        Select dropDownOption = new Select(getDriver().findElement(workWeekSunday));
        dropDownOption.selectByVisibleText(WorkWeek_day_length_Sunday);
    }
    public static void clickSaveBtn() {
        getDriver().findElement(editBtn).click();
    }

    public static void WorkWeek(String workWeekMonday,String workWeekTuesday,String workWeekWednesday,String workWeekThursday,String workWeekFriday,String workWeekSaturday,String workWeekSunday){
       WorkWeek.setWorkWeekMonday(workWeekMonday);
        implicitWait(3);
        WorkWeek.setWorkWeekTuesday(workWeekTuesday);
        implicitWait(3);
        WorkWeek.setWorkWeekWednesday(workWeekWednesday);
        implicitWait(3);
        WorkWeek.setWorkWeekThursday(workWeekThursday);
        implicitWait(3);
        WorkWeek.setWorkWeekFriday(workWeekFriday);
        implicitWait(3);
        WorkWeek.setWorkWeekSaturday(workWeekSaturday);
        implicitWait(3);
        WorkWeek.setWorkWeekSunday(workWeekSunday);
        implicitWait(3);
    }
}
