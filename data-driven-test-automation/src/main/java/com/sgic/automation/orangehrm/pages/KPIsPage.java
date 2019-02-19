package com.sgic.automation.orangehrm.pages;

import com.sgic.automation.orangehrm.utils.PageBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;

public class KPIsPage extends PageBase {
    private static final Logger LOGGER = Logger.getLogger(PerformancePage.class);
    private static By KPIsheading=By.xpath("//*[@id=\"divFormContainer\"]/div[1]");
    private static By searcbtn = By.id("searchBtn");
    private static By addbtn = By.id("Add");
    private static By deletebtn = By.id("btnDelete");

    public boolean isKPIsPageDisplayed(){
        return getDriver().findElement(KPIsheading).isDisplayed();
    }
    public static boolean isAddButtonDisplayed(){
        return getDriver().findElement(addbtn).isDisplayed();
    }
    public static void clickAddbtn(){
        getDriver().findElement(addbtn).click();
    }

}
