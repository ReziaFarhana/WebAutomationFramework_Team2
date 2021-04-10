package walmartHomePage;

import common.WebAPI;
import org.apache.poi.ss.usermodel.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import static walmartHomePage.WebElement.searchBAr;


public class WalmartAccountInfo extends WebAPI {

    public  void goToAccountPage() throws InterruptedException {



        WebElement accountInfo=driver.findElement(By.xpath("//*[text()='Account' and @class='b_a ab_b b_g b_b b_p x_a x_h x_i']"));
        accountInfo.click();

        clickByXpath("//*[text()='Account' and @class='x_a x_i']");
        sleepFor(3);
        driver.findElement(By.linkText("create an account")).click();
    }

    public void createAccountForm() throws InterruptedException {

        goToAccountPage();
        typeOnInputBox("first-name-su","Simar");
        typeOnInputBox("last-name-su","Kaur");
        typeOnInputBox("email-su","letsl@gmail.com");
        //clickById("password-su");
       // clickByXpath("//*[text()='Show']");
        typeOnInputBox("password-su","1234");
       sleepFor(2);
        clickByXpath("//label[@for='remember-me-su']");
        clickByXpath("//*[@id=\"sign-up-form\"]/button[1]");
        sleepFor(3);

    }


    public static void scrollDown() {

        //scrolling method
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,400)");
    }

    public void signInError() throws InterruptedException {

        WebElement accountInfo=driver.findElement(By.xpath("//*[text()='Account' and @class='b_a ab_b b_g b_b b_p x_a x_h x_i']"));
        accountInfo.click();

        //clickByXpath("//*[text()='Account' and @class='x_a x_i']");
        clickByXpath("//*[@class='x_a x_i' and text()='Sign In']");
        nElementNEnter("//*[@id='email']","letslive818@gmail.com");
        sleepFor(2);
        nElementNEnter("//*[@id='password']","1234");

        scrollDown();
        clickByXpath("//button[@class='button m-margin-top text-inherit'][normalize-space()='Sign in']");
        sleepFor(1);


    }

    public void readDataToSearchBox() throws IOException, InterruptedException {
        File path= new File("../Walmart/src/test/java/dataTest/WalmartReadExcel.xlsx");
        FileInputStream input=new FileInputStream(path);
        Workbook workbook= WorkbookFactory.create(input);
        Sheet sheet= workbook.getSheetAt(0);
        for(Row row :sheet){
            for (Cell cell:row){
                String search=cell.getStringCellValue();
                typeOnElementNEnter(searchBAr,search,driver);
                sleepFor(2);
                clearField(searchBAr);
//                boolean actual=driver.findElement(By.xpath()).isDisplayed();
//                Assert.assertTrue(actual,"Test failed");
//                sleepFor(2);
//                navigateBack();
            }
        }





    }




}
