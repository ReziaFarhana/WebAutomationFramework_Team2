package VerizonHomepage;

import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static VerizonHomepage.webElement.*;

public class overviewSupport extends WebAPI {



    public void supportButton(){

        clickByXpath(supportButton);
    }

        public void supportOverview() throws InterruptedException {

        supportButton();
        //support overview button
        clickByXpath(supportOverviewButton);
        //scroll
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,900)");
        sleepFor(2);
        //my verizon
        clickByXpath(myVerizonButton);


        }

        public void myVerizonSignIn() throws InterruptedException {

        supportOverview();
        nElementNEnter("//*[@id=\"IDToken1\"]","2123334444");
        nElementNEnter("//*[@id=\"IDToken2\"]","password");
        //checkbox

            clickByXpath(rememberMeCheckBox);
//
            //clickByXpath(signInSubmitButton);

            nElementNEnter(secretQuestion,secretQuestionAnswer);

        }

        public void frequentlyAskedQuestions(){

            supportButton();
            //support overview button
            clickByXpath(supportOverviewButton);
            //scroll
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,900)");

            //click FAQ
            clickByXpath(frequentlyAskedQuestionTab);
            clickByXpath("//a[@id='itemqid589b5cb0df1c']//span[@class='oneDRd_video_expand_icon']");
            clickByXpath("//a[normalize-space()='Verizon mobile contact us page']");
            clickByXpath("//*[@id=\"app\"]/main/div/div/div[1]/div[1]/div[1]/a");
            typeOnInputBox("//*[@id=\"textarea\"]","what are the hours for customer service?");


        }

        public void device() throws InterruptedException {
            supportButton();
            //support overview button
            clickByXpath(supportOverviewButton);
            //scroll
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,900)");

            clickByXpath("//button[contains(@aria-label,'Questions about your device?')]//*[local-name()='svg']");
            clickByXpath("//button[contains(@aria-label,'Questions about your device?')]//*[local-name()='svg']");

            WebElement deviceDropDown = driver.findElement(By.xpath("//*[@id=\"branddevices\"]/div[1]/span/span/span[2]"));

            Select device1 = new Select(deviceDropDown);

            device1.selectByVisibleText("4G Smartphone");
            sleepFor(5);
            device1.selectByVisibleText("4G Tablet");
            sleepFor(3);
            device1.selectByVisibleText("3G Tablet");
            sleepFor(3);
        }

        public void troubleShooting(){

        overViewLink();
        clickByXpath("//*[@id=\"browsePopularSection\"]/div/div[2]/div/div[2]/div[2]/div[2]/button/svg/path");
        clickByXpath("//span[@class='v-icon']");

    }

        public void phoneUpgrades(){

        overViewLink();
        clickByXpath("//*[@id=\"browsePopularSection\"]/div/div[2]/div/div[3]/div[2]/div[2]/button/svg");


        }



        public void billingUpgrades(){

        overViewLink();
        clickByXpath("//*[@id=\"browsePopularSection\"]/div/div[2]/div/div[4]/div[2]/div[2]/button/svg");



        }

        public void deviceSupport() {

        overViewLink();
        clickByXpath("//button[@aria-label='Device support']//*[local-name()='svg']");
        }



//----------------------------------------------------------------------------------------------------
    public void overViewLink(){

        supportButton();
        //support overview button
        clickByXpath(supportOverviewButton);
        //scroll
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,900)");
    }


}
