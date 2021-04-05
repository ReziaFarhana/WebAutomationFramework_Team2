package searchbox;

import common.WebAPI;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import utilities.WalmartSearchBoxExcelWrite;

import static searchbox.SearchBoxWebElements.*;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class SearchBox extends WebAPI {

    public static String filePath ="../Walmart/WalmartDataTest/WalmartSearchBox.xlsx";
    public static File file = new File(filePath);
    public static FileInputStream inputStream;
    public static XSSFWorkbook workbook;
    public static XSSFSheet sheet;

    public static void readSearchBox() throws IOException {
        inputStream = new FileInputStream(file);
        workbook = new XSSFWorkbook(inputStream);
        sheet = workbook.getSheet("WalmartSearchBox");
    }

    public void searchCatToys() throws IOException, InterruptedException {
        WalmartSearchBoxExcelWrite.writeExcel(filePath);
        readSearchBox();
        driver.findElement(By.xpath(searchbox))
                .sendKeys( sheet.getRow(1).getCell(0).getStringCellValue());
        sleepFor(3);
        clickByXpath(searchbtn);
        sleepFor(5);
        driver.close();

    }
    public void searchBikes() throws IOException, InterruptedException {
        WalmartSearchBoxExcelWrite.writeExcel(filePath);
        readSearchBox();
        driver.findElement(By.xpath(searchbox))
                .sendKeys( sheet.getRow(1).getCell(0).getStringCellValue());
        sleepFor(3);
        clickByXpath(searchbtn);
        sleepFor(4);
        driver.close();

    }
}
