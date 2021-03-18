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

        try
        {
            inputStream = new FileInputStream(file);
            workbook = new XSSFWorkbook(inputStream);
            sheet = workbook.getSheet("BBCRegistrationAccountInfo");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void firstStepOfRegistration() throws InterruptedException {
        WriteBBCRegistrationExcel.writeExcel();
        readFile();
        clickByXpath(registrationIcon);
        clickByXpath(registerNowLink);
        Thread.sleep(5000);
        clickByXpath(age);
        typeOnElement1(dayInput, sheet.getRow(1).getCell(0).getStringCellValue());
        typeOnElement1(monthInput, sheet.getRow(1).getCell(1).getStringCellValue());
        typeOnElement1(yearInput, sheet.getRow(1).getCell(2).getStringCellValue());
        clickById(continueButton);
    }

    public void secondStepinRegistration(){
       // ReadExcel.readExcelFile("C:\\Users\\israt\\IdeaProjects\\WebAutomationFramework_Team2\\ExcelData\\BBCRegistrationExcel.xlsx",0);
        WriteBBCRegistrationExcel.writeExcel();

    }


}
