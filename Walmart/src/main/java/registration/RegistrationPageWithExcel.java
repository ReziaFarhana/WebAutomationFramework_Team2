package registration;

import common.WebAPI;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utilities.WriteExcelFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import static registration.RegistrationPageWebElements.*;

public class RegistrationPageWithExcel extends WebAPI {

    public static String filePath ="../Walmart/WalmartDataTest/WalmartReg.xlsx";
    public static File file = new File(filePath);
    public static FileInputStream inputStream;
    public static XSSFWorkbook workbook;
    public static XSSFSheet sheet;
    public static String sheetWalmart = "WalmartReg";
    public static String sheetWalmartLogin = "WalmartLogin";

    public static void readFile() throws IOException {
        inputStream = new FileInputStream(file);
        workbook = new XSSFWorkbook(inputStream);
        sheet = workbook.getSheet(sheetWalmart);

    }

    public  void createAccountPage() throws InterruptedException {
        clickByXpath(accountBtn);
        sleepFor(4);
        clickByXpath(signInBtn);
    }




    public void registerWithExcel() throws InterruptedException, IOException {
        WriteExcelFile.writeExcel(filePath);
        readFile();
        createAccountPage();
        clickByXpath(createAccountBtn);
       
        typeOnElementByXpath(firstName, sheet.getRow(1).getCell(0).getStringCellValue());
        sleepFor(3);
        typeOnElementByXpath(lastName, sheet.getRow(1).getCell(1).getStringCellValue());
        sleepFor(3);
        typeOnElementByXpath(email, sheet.getRow(1).getCell(2).getStringCellValue());
        sleepFor(3);
        typeOnElementByXpath(password, sheet.getRow(1).getCell(3).getStringCellValue());
        Thread.sleep(4);
        clickByXpath(showPasswrdBtn);
        Thread.sleep(5);
        scrollByXPATH(createAccountBtn2);
        String expectedTitle = "Account";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Title doesnt match my guy");
    }
}
