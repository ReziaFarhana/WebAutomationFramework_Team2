package home_page.MoreMenuTab;

import common.WebAPI;
import databases.ConnectToSqlDB;
import org.apache.poi.ss.usermodel.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static home_page.MoreMenuTab.MenuBarMoreWEbElement.*;

public class MenuBarMore extends WebAPI {

    ConnectToSqlDB db = new ConnectToSqlDB();

    /**
     * Method to open More Menu Bar option from BBC home page
     */
    public void clikOnMoreMenuTab() {
        clickByXpath(menuTabMore);
    }

    public void openWeatherLink() throws InterruptedException {
        clikOnMoreMenuTab();
        clickByCss(weatherLink);
        sleepFor(2);
    }

    public void weatherSearchByCity() {
        clikOnMoreMenuTab();
//        typeOnElementNEnter(weatherSearchByCity,"Washington DC, United States");
        typeByCss(weatherSearchByCity, "Washington DC, United States");

    }

    public void searchWithSearchInputBox() throws Exception {
        List<String> items = getTextFromWebElementsByCss(BBCHomePageHeaders);
//        List<String> add = new ArrayList<>();
//        for (int i = 0;i<items.size();i++){
//            add.add(items.get(i));
//        }
        System.out.println(items);

        db.insertDataFromArrayListToSqlTable(items, "BBC_Heading", "Lists");
            // Reading ifo from the data table
        List<String> lists = db.readDataBase("bbc_search", "Lists");

        for (int i = 0; i < lists.size(); i++) {
            typeOnElementNEnter(searchBareLocator, lists.get(i));
            sleepFor(3);
            boolean actual = driver.findElement(By.xpath(verifyBBCHomeHeader)).isDisplayed();
            Assert.assertTrue(actual,"Test failed");
            sleepFor(2);
            navigateBack();
        }
    }

    public static List<String> getTextFromWebElements(String locator) {
        List<WebElement> element = driver.findElements(By.cssSelector(locator));
        List<String> text = new ArrayList<>();
        for (WebElement web : element) {
            text.add(web.getText());
        }
        return text;
    }

    /**
     * from Reto
     * @param locator
     * @return
     */
    public static List<String> getTextFromWebElementsByCss(String locator) {
        List<WebElement> element = new ArrayList<WebElement>();
        List<String> text = new ArrayList<String>();
        element = driver.findElements(By.cssSelector(locator));
        for (WebElement web : element) {
            String st = web.getText();
            text.add(st);

        }
        System.out.println(text);
        System.out.println(text.size());
        return text;
    }

    public void searchOnBBCUsingExcelData() throws IOException, InterruptedException {
        File path = new File("../File_Cabinet/BBCHeadLists.xlsx");
        FileInputStream input = new FileInputStream(path);
        Workbook book = WorkbookFactory.create(input);
        Sheet sheet = book.getSheetAt(0);
         for (Row row: sheet){
            for (Cell cell: row){
             String search =  cell.getStringCellValue();
                typeOnElementNEnter(searchBareLocator,search);
                sleepFor(3);
                boolean actual = driver.findElement(By.xpath(verifyBBCHomeHeader)).isDisplayed();
                Assert.assertTrue(actual,"Test failed");
                sleepFor(2);
                navigateBack();
            }
        }

    }

    public void readFromExcelData(String loc) throws IOException, InterruptedException {
        File path = new File("../File_Cabinet/BBCHeadLists.xlsx");
        FileInputStream input = new FileInputStream(path);
        Workbook book = WorkbookFactory.create(input);
        Sheet sheet = book.getSheetAt(0);
        for (Row row: sheet){
            for (Cell cell: row){
                String search =  cell.getStringCellValue();
                driver.findElement(By.cssSelector(loc)).sendKeys(search, Keys.ENTER);
                sleepFor(3);

            }
        }

    }

}
