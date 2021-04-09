package login;

import common.WebAPI;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import registration.RegistrationPageWithExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import static login.LoginWebElements.*;
import static registration.RegistrationPageWebElements.*;

public class LoginWithDataProvider extends WebAPI {
    public static String filePath ="../Walmart/WalmartDataTest/WalmartReg.xlsx";
    public static File file = new File(filePath);
    public static FileInputStream inputStream;
    public static XSSFWorkbook workbook;
    public static XSSFSheet sheet;
    public static String sheetWalmartLogin = "WalmartLogin";

    // use for Dataprovider
    public Object [][]getTestData(String sheetName) throws IOException {
        //get to excel
        inputStream = new FileInputStream(file);
        workbook = new XSSFWorkbook(inputStream);
        sheet = workbook.getSheet(sheetName);

        //iterate through cells and rows in excell
        Object [][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
        for(int i = 0; i < sheet.getLastRowNum(); i++){
            for(int k =0; k < sheet.getRow(0).getLastCellNum(); k++){
                data[i][k] = sheet.getRow(i+1).getCell(k).toString();
            }
        }
        return data;
    }
    @DataProvider
    public Object[][] getLoginDataUsingDataProvider() throws IOException {
        Object data [][] = getTestData(sheetWalmartLogin);
        return data;
    }
    public void signInPage() throws InterruptedException {
        clickByXpath(accountBtn);
        sleepFor(4);
        clickByXpath(signInBtn);
    }

    @Test(dataProvider = "getLoginDataUsingDataProvider")
    public void loginUsingDataProvider(String email, String password) throws InterruptedException {
       signInPage();
       sleepFor(4);
        driver.findElement(By.xpath(emailBoxCusXp)).sendKeys(email);
        driver.findElement(By.xpath(passwordBoxCusXp)).sendKeys(password);

        //click sign in
        clickByXpath(signInButtonCusXp);
    }

}
