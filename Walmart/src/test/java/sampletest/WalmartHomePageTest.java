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

    @Test(priority = 1)
    @Ignore
    public void testSearchBox() throws InterruptedException {
        walmarthome.searchBox();

    }

    @Test(priority = 2)
    @Ignore
    public void testCareers() throws InterruptedException {
        walmarthome.Careers();

    }

    @Test(priority = 3)
    @Ignore
    public void testCareersLocations() throws InterruptedException {
        walmarthome.Careers();
        walmarthome.CareersLocations();
    }

    @Test(priority = 4)

    public void testWlamrtplus() throws IOException, IOException {
        clickOnElement(walmartplus);
    }


    @Test(priority = 5)
    @Ignore
    public void testWalmartplus() throws InterruptedException {
        walmarthome.wlamrtplusTab();
        String exResult = "Free shipping, no order minimum";
        String acResult = walmarthome.wlmplus1.getText();
        Assert.assertEquals(acResult, exResult, "text does not match");
    }

    @Test(priority = 6)
    @Ignore
    public void testfifteendaysofftab() throws InterruptedException {
        walmarthome.fifteendaysofftab();

    }

    @Test(priority = 7)
    @Ignore
    public void testAllCareerAreaTab() throws InterruptedException {
        walmarthome.allCarreerArea();
        String exResult = "";
        String acResult = walmarthome.allCareerArea.getText();
        Assert.assertEquals(acResult, exResult, "text does not match");
    }

    @Test(priority = 8)
    @Ignore
    public void testJobTitle() throws InterruptedException {
        walmarthome.Jobtitle();

    }

    @Test(priority = 9)@Ignore
    public void testMenuTab() throws InterruptedException {

        walmarthome.menuTab();


    }


}

