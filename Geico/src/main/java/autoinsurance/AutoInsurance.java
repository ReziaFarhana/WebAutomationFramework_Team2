package autoinsurance;

import bbc_geico_verizon_excelReadAndWrite.WriteGeicoAutoInsuranceExcel;
import common.WebAPI;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import static autoinsurance.AutoInsuranceWebElements.*;


public class AutoInsurance extends WebAPI {
    public static String filePath ="../Geico/GeicoExcelData/GeicoInsuranceRegister.xlsx";
    public static File file = new File(filePath);
    public static FileInputStream inputStream;
    public static XSSFWorkbook workbook;
    public static XSSFSheet sheet;

    public static void geicoReadFile() {

        try {
            inputStream = new FileInputStream(file);
            workbook = new XSSFWorkbook(inputStream);
            sheet = workbook.getSheet("GeicoRegistrationAccountInfo");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void autoInsuranceTab() {
        clickByCss(autoInsuranceLocator);
        typeOnElementNew(zipCodeBox,zipCode);
        clickByXpath(startQuoteButton);
    }

    public void geicoQuoteRegistrationStepOne(){
        WriteGeicoAutoInsuranceExcel.geicoWriteExcel(filePath);
        geicoReadFile();
        clickByXpath(nextButton);



    }


}
