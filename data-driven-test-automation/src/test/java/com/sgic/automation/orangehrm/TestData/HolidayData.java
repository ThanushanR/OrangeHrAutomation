package com.sgic.automation.orangehrm.TestData;

import com.sgic.automation.orangehrm.utils.ExcelDataConfig;
import org.apache.log4j.Logger;
import org.testng.annotations.DataProvider;

public class HolidayData extends ExcelDataConfig {

    private static final Logger LOGGER = Logger.getLogger(HolidayData.class);

    public HolidayData() {
        super
                ("src\\test\\resources\\ExcelSheet\\Leave.xlsx");
    }

    @DataProvider(name = "SearchHoliday")
    public Object[][] searchHoliday() {

        int rows = getRowCount("Search_Holiday");
        int col = getColumnCount("Search_Holiday");

        LOGGER.info("row = " + rows + " columns = " + col);

        Object[][] data = new Object[rows][col];
        for (int i = 1; i <= rows; i++) {
            for (int j = 0; j < col; j++) {
                data[i - 1][j] = getData("Search_Holiday", i, j);
            }
        }
        return data;
    }
    @DataProvider(name = "AddHoliday")
    public Object[][] addHoliday() {

        int rows = getRowCount("Add_Holiday");
        int col = getColumnCount("Add_Holiday");

        LOGGER.info("row = " + rows + " columns = " + col);

        Object[][] data = new Object[rows][col];
        for (int i = 1; i <= rows; i++) {
            for (int j = 0; j < col; j++) {
                data[i - 1][j] = getData("Add_Holiday", i, j);
            }
        }
        return data;
    }
}
