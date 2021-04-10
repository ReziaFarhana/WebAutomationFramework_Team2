package sign_in;

import common.WebAPI;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.*;

import static sign_in.SignInWebElements.*;


public class SignInWithDataProvider extends WebAPI {

    public static String filePath ="../BBC/BBCSignInData/BBCsignIn.xlsx";
    public static File file = new File(filePath);
    public static FileInputStream inputStream;
    public static XSSFWorkbook workbook;
    public static XSSFSheet sheet=null;
    public static String sheetBBCSignIn ="BBCSignIn";
    int numberOfRows, numberOfCol, rowNum;

    // use for DataProvider
    public Object [][]getTestData(String sheetName) throws IOException, FileNotFoundException {
        //get to excel
        String[][] getTestData = {};
        inputStream = new FileInputStream(file);
        workbook = new XSSFWorkbook(inputStream);
        sheet = workbook.getSheet(sheetName);
        numberOfRows = sheet.getLastRowNum();
        numberOfCol = sheet.getRow(0).getLastCellNum();
        getTestData = new String[numberOfRows + 1][numberOfCol + 1];
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
    }
}
