package VerizonTest;

import VerizonHomepage.overviewSupport;
import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static VerizonHomepage.webElement.*;


public class supportTest extends WebAPI {

        overviewSupport customerService;

    @BeforeMethod
    public void getinit() throws InterruptedException {
        customerService= PageFactory.initElements(driver, overviewSupport.class);

        String verizonUrl = "https://www.verizon.com/";
        this.driver.get(verizonUrl);
        sleepFor(1);
    }

    public void result(String expected,String actual){
        String expectedText =expected;
        String actualText = getTextByXpath(actual);
        Assert.assertEquals(actualText,expectedText,"Test Did Not Match");
    }

    @Test //1
    public void supportButtonTest(){

        customerService.supportButton();
        result("Support","//div[contains(@class,'gnav20-featured-card-top-label gnav20-column-highlight')]");



    }

    @Test//2
    public void supportOverviewTest() throws InterruptedException {

      customerService.supportOverview();
      result("Sign in","//h1[normalize-space()='Sign in']");


    }

    @Test//3
    public void myVerizonSignInTest() throws InterruptedException {

       customerService.myVerizonSignIn();
        assertEqualByXpath(actualTextSecretError,expectedTextSecretError);


    }
    @Test//4
    public void frequentlyAskedQuestions(){

        customerService.frequentlyAskedQuestions();
        //result();

    }

    @Test//5
    public void deviceTest() throws InterruptedException {

        customerService.device();

    }

    @Test//6
    public void troubleShootTest(){

        customerService.troubleShooting();
        //result();
    }


    @Test//7
    public void phoneUpgradeTest(){

        customerService.phoneUpgrades();
       // result();
    }


    @Test//8
    public void billingAndpaymentsTest(){

        customerService.billingUpgrades();
       // result();

    }

    @Test//
    public void deviceSupport(){

        customerService.deviceSupport();
       // result();
    }






}
