package geicoTestPage;

import common.WebAPI;
import geicoHomePage.PropertyInsurance;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GeicoTest extends WebAPI {

    PropertyInsurance insurance;

    @BeforeMethod
    public void getinit() throws InterruptedException {
        insurance = PageFactory.initElements(driver, PropertyInsurance.class);


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
        result("It's easy to update the vehicles on your policy.","//*[@id=\"find-help\"]/h2");



    }

    public void result(String expected, String actual){

        String expectedText = expected;
        String actualText = getTextByXpath(actual);
        Assert.assertEquals(actualText, expectedText, "Test Did Not Match");
    }
}