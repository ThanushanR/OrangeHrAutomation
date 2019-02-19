package com.sgic.automation.orangehrm.TestData;

import com.sgic.automation.orangehrm.utils.ExcelDataConfig;
import org.apache.log4j.Logger;
import org.testng.annotations.DataProvider;

public class LoginDemo extends ExcelDataConfig {

    private static final Logger LOGGER = Logger.getLogger(LoginDemo.class);
    public LoginDemo() {super
            ("src\\test\\resources\\ExcelSheet\\Leave.xlsx");

    }
    @DataProvider(name = "loginValid")
    public Object[][] Valid_Login() {

        int rows = getRowCount("Valid_Login");
        int col = getColumnCount("Valid_Login");

        LOGGER.info("row = "+ rows + " columns = "+ col);

        Object[][] data = new Object[rows][col];
        for (int i = 1; i <= rows; i++) {
            for (int j = 0; j < col; j++) {
                data[i - 1][j] = getData("Valid_Login", i, j);
            }
        }
        return data;
    }
    @DataProvider(name = "Invalid_Login")
    public Object[][] Invalid_Login() {

        int rows = getRowCount("Invalid_Login");
        int col = getColumnCount("Invalid_Login");

        LOGGER.info("row = "+ rows + " columns = "+ col);

        Object[][] data = new Object[rows][col];
        for (int i = 1; i <= rows; i++) {
            for (int j = 0; j < col; j++) {
                data[i - 1][j] = getData("Invalid_Login", i, j);
            }
        }
        return data;
    }
}

