package sign_in_test;

import common.WebAPI;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import static sign_in.SignInWebElements.*;
import static sign_in.SignInWebElements.signInBtnLocator;

public class SignInWithDataProviderTest extends WebAPI {

    public static String filePath ="../BBC/BBCSignInData/BBCsignIn.xlsx";
    public static File file = new File(filePath);
    public static FileInputStream inputStream;
    public static XSSFWorkbook workbook;
    public static XSSFSheet sheet;
    public static String sheetBBCSignIn ="BBCSignIn";


    // use for DataProvider
    public Object [][]getTestData(String sheetName) throws IOException {
        //get to excel
        inputStream = new FileInputStream(file);
        workbook = new XSSFWorkbook(inputStream);
        workbook.getSheetAt(0);
        sheet = workbook.getSheet(sheetName);

        //iterate through cells and rows in excel
        Object [][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
        for(int i = 0; i < sheet.getLastRowNum(); i++){
            for(int k =0; k < sheet.getRow(0).getLastCellNum(); k++){
                data[i][k] = sheet.getRow(i+1).getCell(k).toString();
            }
        }
        return data;
    }
    @DataProvider
    public Object[][] getSignInDataUsingDataProvider() throws IOException {
        Object data [][] = getTestData(sheetBBCSignIn);
        return data;
    }
    public void signInPage() throws InterruptedException {
        clickById(signInBtnHP);
        sleepFor(4);
    }

    @Test(dataProvider = "getSignInDataUsingDataProvider")
    public void signInUsingDataProvider(String email, String password) throws InterruptedException {
        signInPage();
        sleepFor(4);
        driver.findElement(By.xpath(userNameLocator)).sendKeys(email);
        driver.findElement(By.xpath(Password)).sendKeys(password);
        clickById(signInBtnLocator);
        sleepFor(4);

        String expectedTitle = "BBC – Sign in";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Title doesn't match");
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
