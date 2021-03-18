package bbc;

import common.WebAPI;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import bbc_geico_verizon_excelReadAndWrite.WriteBBCRegistrationExcel;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import static bbc.bbcWebelements.*;

public class Registration extends WebAPI {
    public static File file = new File("C:\\Users\\israt\\IdeaProjects\\WebAutomationFramework_Team2\\ExcelData\\BBCRegister.xlsx");
    public static FileInputStream inputStream;
    public static XSSFWorkbook workbook;
    public static XSSFSheet sheet;

    public static void readFile() {

        try {
            inputStream = new FileInputStream(file);
            workbook = new XSSFWorkbook(inputStream);
            sheet = workbook.getSheet("BBCRegistrationAccountInfo");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void signInPageVerify() {
        clickByXpath(registrationIcon);
    }

    public void registration() throws InterruptedException {
        WriteBBCRegistrationExcel.writeExcel();
        readFile();
        signInPageVerify();
        clickByXpath(registerNowLink);
        Thread.sleep(5000);
        clickByXpath(age);
        typeOnElement1(dayInput, sheet.getRow(1).getCell(0).getStringCellValue());
        typeOnElement1(monthInput, sheet.getRow(1).getCell(1).getStringCellValue());
        typeOnElement1(yearInput, sheet.getRow(1).getCell(2).getStringCellValue());
        clickById(continueButton);
        typeOnElement1(emailAddress, sheet.getRow(1).getCell(3).getStringCellValue());
        typeOnElement1(passwordField, sheet.getRow(1).getCell(4).getStringCellValue());
        clickById(showPassword);
        clickById(continueButton);
    }


}
