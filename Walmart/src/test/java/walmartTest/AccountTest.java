package walmartTest;


import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import walmartHomePage.*;

public class AccountTest extends WebAPI {


  WalmartAccountInfo account;

    @BeforeMethod
    public void getinit() throws InterruptedException {
        account = PageFactory.initElements(driver, WalmartAccountInfo.class);

        String walmartUrl = "https://www.walmart.com/";
        this.driver.get(walmartUrl);


    }
    @Test//test (1)

    public void goToAccountPageTest() throws InterruptedException {

        account.goToAccountPage();
        String expectedText ="Create your Walmart account";
        String actualText = getTextByXpath("//*[@id=\"sign-in-widget\"]/h1/span[2]");
        Assert.assertEquals(actualText,expectedText,"Text didn't match");


    }

    @Test //(2)

    public void createAccountForm() throws InterruptedException {

        account.createAccountForm();
       String expectedText ="Create a";
        String actualText = getTextByXpath("//*[@id=\"sign-up-form\"]/div[5]/div[1]/label/span[1]");
       Assert.assertEquals(actualText,expectedText,"Text didn't match");


    }
    @Test //(3)
    public void signInErrorTest() throws InterruptedException {
        account.signInError();

        String expectedText ="Reset Your Password";
        String actualText = getTextByXpath("//*[@id=\"global-error\"]/button");
        Assert.assertEquals(actualText,expectedText,"Text didn't match");


    }


}



//                String expectedText ="";
//                String actualText = getTextByXpath();
//                Assert.assertEquals(actualText,expectedText,"Text didn't match");
//
//                String expectedText ="";
//                String actualText = getTextByXpath();
//                Assert.assertEquals(actualText,expectedText,"Text didn't match");

