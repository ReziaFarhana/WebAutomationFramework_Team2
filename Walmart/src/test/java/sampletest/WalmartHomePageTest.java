package sampletest;

import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import sample.WlamartHomePage;

import java.io.IOException;

import static sample.WalmartHomePageWebElements.walmartplus;

public class WalmartHomePageTest extends WebAPI {

    WlamartHomePage walmarthome;

    @BeforeMethod
    public void getInit() {
        walmarthome = PageFactory.initElements(driver, WlamartHomePage.class);

    }

    @Test@Ignore
    public void testSearchBox() throws InterruptedException {
        walmarthome.searchBox();

    }
    @Test@Ignore
    public void testCareers() throws InterruptedException {
        walmarthome.Careers();

    }
    @Test@Ignore
    public void testCareersLocations() throws InterruptedException {
        walmarthome.Careers();
        walmarthome.CareersLocations();

    }
    @Test@Ignore
    public void testBrokenLink() throws IOException {
        walmarthome.brockenlink();


    }



    @Test@Ignore
    public void testWlamrtplus() throws IOException ,IOException{

        clickOnElement(walmartplus);
    }


   /* @Test
    public void testGetWalmartPlusText () throws InterruptedException {
        getwalmartplustext();



    }*/


@Test
    public void testWalmartplus() throws InterruptedException {
    walmarthome.wlamrtplusTab();
    String exResult="Free shipping, no order minimum";
    String acResult=   walmarthome. wlmplus1.getText();
    Assert.assertEquals(acResult,exResult,"text does not match");
}



    }
