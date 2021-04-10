package verizonHomepage;

import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static verizonHomepage.WebElement.*;

public class Support extends WebAPI {

    //click on Suppport Button
    public void supportButton(){
        clickByXpath("//*[@id=\"vz-gh20\"]/div/div/div/div[1]/div/div[1]/div[2]/div/div[1]/div[2]/div[2]/div/div/div[3]");

    }

    //Support Button with Hover
    public void supportButtonHover() throws InterruptedException {

        clickByXpath("//*[@id=\"vz-gh20\"]/div/div/div/div[1]/div/div[1]/div[2]/div/div[1]/div[2]/div[2]/div/div/div[3]");
        hoverOverElement("//a[@id='gnav20-Support-L2-1']", "//body/div[@class='header globalclientheader']/div[@id='vz-gh20']/div/div[@class='xf-page-unified xfpage page basicpage']/div[@class='gnav20 gnav20-sticky']/div[@class='gnav20-sticky-content']/div[@class='gnav20-apicomponentnewdesign']/div[@class='gnav20-width-wrapper gnav20-new-design gnav20-promo-bottom']/div[@class='gnav20-main gnav20-nav-open']/div[@class='gnav20-gnav-new-design']/div[@class='gnav20-desktop']/div[@class='gnav20-row-two']/div[@class='gnav20-navigation']/div[@class='gnav20-navigation']/div[@class='gnav20-global-nav-list gnav20-navigation-list']/div[@class='gnav20-navigation-item']/div[@class='gnav20-primary-menu gnav20-featured-card']/div[@class='gnav20-sub-header-menu gnav20-sub-menu gnav20-grouping-active']/div[@class='gnav20-content-wrapper gnav20-grouping-active']/ul[@role='none']/li[5]");
    }

//---------------Overview----------------------
    public void supportOverview() throws InterruptedException {

        supportButton();
        //support overview button
        clickByXpath(supportOverviewButton);

    }
    public void supportOverviewVerizonSupport() throws InterruptedException {

        supportButton();
        //support overview button
        clickByXpath(supportOverviewButton);
        //scroll
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,900)");
        sleepFor(2);
        //my verizon
        clickByXpath(myVerizonButton);
        typeByXpath("//*[@id=\"IDToken1\"]","Simar");
        typeByXpath("//*[@id=\"IDToken2\"]","12456");
        clickByXpath("//*[@id=\"login-submit\"]");
    }

    public void supportoverviewFindStore() throws InterruptedException {

        supportOverview();
        sleepFor(2);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,2500)");

        sleepFor(2);
        clickByXpath("//span[@aria-label='Find a store']//*[local-name()='svg']");
        nElementNEnter("//input [@id='searchBarClone' and @placeholder='Enter a zip code, city or state']","60564");
        sleepFor(2);
    }

    //overview-->covid19-->cust hours-->chat
    public void frequentlyAskedQuestions () throws InterruptedException {

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
        //clickByXpath("//a[text()='Verizon mobile contact us page']");
        clickByXpath("//*[@id=\"app\"]/main/div/div/div[1]/div[1]/div[1]/a");
        sleepFor(2);

        // clickByXpath("//*[@id=\"app\"]/main/div/div/div[1]/div[1]/div[1]/a");
        //clickByXpath("//*[@id=\"itemqid7fa165039e8e\"]/h3");


    }
    //Overview
    public void troubleShooting () throws InterruptedException {

        supportButton();
        //support overview button
        clickByXpath(supportOverviewButton);
        //scroll
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1500)");

        clickByXpath("//button[@aria-label='Troubleshooting assistant']//*[local-name()='svg']");
        clickByXpath("//*[@id=\"devicecomponent\"]/div[1]/span/span/span[2]/span");

        clickByXpath("//*[@id=\"devices\"]/li[1]");
        JavascriptExecutor js2 = (JavascriptExecutor) driver;
        js2.executeScript("window.scrollBy(0,1000)");
        sleepFor(2);

    }

//-------------------MOBILE-------------------

    public void mobileHoverOverElement() throws InterruptedException {
        supportButton();
        //
        clickByXpath("//*[@id=\"gnav20-Support-L2-2\"]");
        sleepFor(3);
        hoverOverElement(hoverOverMobile1, hoverDownloadVerizonAPP);
//        sleepFor(3);

    }
    public void billingFilterTopics () throws InterruptedException {
        supportButton();
        clickByXpath("//*[@id=\"gnav20-Support-L2-2\"]");
        clickByXpath("//*[@id=\"gnav20-Support-L3-2\"]");
        JavascriptExecutor js2 = (JavascriptExecutor) driver;
        js2.executeScript("window.scrollBy(0,500)");
        //Search for billing topic
        nElementNEnter("//input[@type='text' and @placeholder='All Topics' and @class='extra-padding' ]", "auto pay");
        //clickByLinkText("How do I pay my Verizon Visa Card bill?");
        sleepFor(4);
    }
    public void device () throws InterruptedException {
        supportButton();
        //support overview button
        clickByXpath(supportOverviewButton);
        //scroll
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,900)");
        //questions about your device page
        clickByXpath("//button[contains(@aria-label,'Questions about your device?')]//*[local-name()='svg']");
        //Apple Tab
        clickByXpath("//*[@id=\"brandRecordSpotlightWrapper\"]/div[3]/div[2]/div[1]/a/p");

        //drop down
        clickByXpath("//*[@id=\"branddevices\"]/div[1]/span/span/span[1]");
        clickByXpath("//li[text()='5G Smartphone']");
        nElementNEnter("//*[@id=\"myInput\"]", " Apple iPhone 12 mini ");
        sleepFor(2);

    }
    public void phoneUpgrades () throws InterruptedException {

        supportButton();
        //support overview button
        clickByXpath(supportOverviewButton);
        JavascriptExecutor js2 = (JavascriptExecutor) driver;
        js2.executeScript("window.scrollBy(0,1000)");

        clickByXpath("//button[@aria-label='Phone upgrades']//*[local-name()='svg']");
        sleepFor(2);
        //username and password
        typeByXpath("//body/main[@role='main']/div[@id='main-content']/div[@class='row']/div[@class='col-sm-5']/form[@id='login-form']/div[1]/input[1]", "Simar");
        typeByXpath("//*[@id=\"IDToken2\"]", "12456");
        clickByXpath("//*[@id=\"login-submit\"]");
        sleepFor(2);
    }

    public void deviceSupport () throws InterruptedException {
        overViewLink();
        clickByXpath("//button[@aria-label='Device support']//*[local-name()='svg']");
        clickByXpath("//*[@id=\"brandRecordSpotlightWrapper\"]/div[3]/div[2]/div[5]/a/p");
        clickByXpath("//*[@id=\"branddevices\"]/div[1]/span/span/span[2]/span");
        clickByXpath("//*[@id=\"branddeviceselection\"]/li[2]");
    }

    //----------------------HOME---------------------------------

    //Support-->
    public void homeTab() throws InterruptedException {
        //supportButton
       supportButton();
        //home tab
        sleepFor(2);
        clickByXpath("//a[@id='gnav20-Support-L2-3' and @class='gnav20-subanchor gnav20-haschild gnav20-hide-on-mobile']");
        sleepFor(2);
        hoverOverElement("//a[@id='gnav20-Support-L3-9']","//a[@id='gnav20-Support-L3-12']");
    }
    public void fiosInternetAndTV(){

        supportButton();
        clickByXpath("//*[@id=\"gnav20-Support-L3-10\"]");

    }

    //-----------CONTACT US-------------------

    //Support-->Contact Tab-->Hover
    public void contactUsLink(){

        supportButton();
        clickByXpath("//*[@id=\"gnav20-Support-L2-4\"]");

    }
    public void contactUsChatBox() throws InterruptedException {

        contactUsLink();
        clickByXpath("//a[@class='contact_type wireless contact_link mobile_chat ' and text()='Chat now']");
        sleepFor(2);
    }
    //---------------Sign In----------------


    public void signIn(){
        supportButton();
        clickByLinkText("Sign in");

    }

    public void signInUsernameAndPassword(){
        signIn();
        typeByXpath("//*[@id=\"IDToken1\"]","Simar");
        typeByXpath("//*[@id=\"IDToken2\"]","123456");
        tryCheckBoxXpath("//label[@class='checkbox-inline checkbox-position']");
        clickByXpath("//*[@id=\"login-submit\"]");
    }





        public void visaBill () throws InterruptedException {
            supportButton();
            clickByXpath("//*[@id=\"gnav20-Support-L2-2\"]");
            clickByXpath("//*[@id=\"gnav20-Support-L3-2\"]");
            JavascriptExecutor js2 = (JavascriptExecutor) driver;
            js2.executeScript("window.scrollBy(0,500)");

            clickByXpath("//a[@title='How do I pay my Verizon Visa Card bill?']//i[@class='slide-arrow']");

        }
        public void overViewLink () throws InterruptedException {

            supportButton();
            //support overview button
            clickByXpath(supportOverviewButton);
            //scroll
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,900)");
        }


    }
