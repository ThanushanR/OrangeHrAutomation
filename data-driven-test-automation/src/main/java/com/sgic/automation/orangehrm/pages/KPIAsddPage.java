package com.sgic.automation.orangehrm.pages;

import com.sgic.automation.orangehrm.utils.PageBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;

public class KPIAsddPage extends PageBase {
    private static final Logger LOGGER = Logger.getLogger(PerformancePage.class);
    private static By addKPIsheading = By.id("PerformanceHeading");
    private static By txtjobtitle = By.id("defineKpi360_jobTitleCode");
    private static By txtKPI = By.id("defineKpi360_keyPerformanceIndicators");
    private static By txtMinRating = By.id("defineKpi360_minRating");
    private static By txtMaxRating = By.id("defineKpi360_maxRating");
    private static By makeDefault = By.id("defineKpi360_makeDefault");
    private static By savebtn = By.id("saveBtn");
    private static By cancelbtn = By.id("btnCancel");

    public static boolean isAddKIPsPageDisplayes(){
        return getDriver().findElement(addKPIsheading).isDisplayed();
    }
    public static void setJobTitle(String jobTitle){
        getDriver().findElement(txtjobtitle).sendKeys(jobTitle);
    }
    public static void setKPIs(String kpis){
        getDriver().findElement(txtKPI).sendKeys(kpis);
    }
    public static void setMinRating(String minRating){
        getDriver().findElement(txtMinRating).sendKeys(minRating);
    }
    public static void setMaxRating(String maxRating){
        getDriver().findElement(txtMaxRating).sendKeys(maxRating);
    }
    public static void clickMakeDefoult(){
        getDriver().findElement(makeDefault).click();
    }
    public static boolean isSaveButtonDisplayed(){
        return getDriver().findElement(savebtn).isDisplayed();
    }
    public static void clickSaveBtn(){
        getDriver().findElement(savebtn).click();
    }

}
