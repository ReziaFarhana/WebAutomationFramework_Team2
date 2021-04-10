package geicoTestPage;

import common.WebAPI;
import geicoHomePage.Insurance;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static geicoHomePage.WebElement.businessOwnerTextLocater;

public class GeicoTest extends WebAPI {

    Insurance insurance;

    @BeforeMethod
    public void getinit() throws InterruptedException {
        insurance = PageFactory.initElements(driver, Insurance.class);


        String geicoUrl = "https://www.geico.com/";
        this.driver.get(geicoUrl);
        sleepFor(1);
    }

    @Test//1
    public void propertyPageTest() throws InterruptedException {

        insurance.propertyInsurancePage();

        String expectedText = "Types Of Property Insurance For Your Home";

        String actualText = getTextByXpath("//h1[normalize-space()='Types Of Property Insurance For Your Home']");
        Assert.assertEquals(actualText, expectedText, "Test Did Not Match");


    }

    @Test//2  radio button
    public void typesOfPropertyInsuranceTest() throws InterruptedException {

        insurance.typesOfPropertyInsurance();
        result("It's easy to update the vehicles on your policy.", "//*[@id=\"find-help\"]/h2");


    }

    @Test//3
    public void businessInsurance() throws InterruptedException {
        insurance.businessInsurance();
        String expectedText = "";
        String actualText = getTextByXpath(businessOwnerTextLocater);
        Assert.assertEquals(actualText, expectedText, "text did not match");
    }
    @Test
    public void getQuotes() throws InterruptedException {

        insurance.getQuote();
    }


    public void result(String expected, String actual) {

        String expectedText = expected;
        String actualText = getTextByXpath(actual);
        Assert.assertEquals(actualText, expectedText, "Test Did Not Match");
    }
}