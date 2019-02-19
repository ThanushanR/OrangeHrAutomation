package com.sgic.automation.orangehrm.TestData;

import com.sgic.automation.orangehrm.utils.ExcelDataConfig;
import org.apache.log4j.Logger;
import org.testng.annotations.DataProvider;

import static com.sun.xml.internal.ws.spi.db.BindingContextFactory.LOGGER;

public class LeaveListData extends ExcelDataConfig {

    public LeaveListData() {
        super
                ("src\\test\\resources\\ExcelSheet\\Leave.xlsx");
    }

    private static final Logger LOGGER = Logger.getLogger(HolidayData.class);
    @DataProvider(name = "LeaveList")
    public Object[][] LeaveList() {

        int rows = getRowCount("Leave_List");
        int col = getColumnCount("Leave_List");

        LOGGER.info("row = " + rows + " columns = " + col);

        Object[][] data = new Object[rows][col];
        for (int i = 1; i <= rows; i++) {
            for (int j = 0; j < col; j++) {
                data[i - 1][j] = getData("Leave_List", i, j);
            }
        }
        return data;
    }

}
