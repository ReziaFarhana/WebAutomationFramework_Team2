package bbcTest;

import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import bbcHomePage.Discovery;

public class DiscoveryTest extends WebAPI {


    Discovery explore;

    @BeforeMethod
    public void getinit() throws InterruptedException {
        explore = PageFactory.initElements(driver, Discovery.class);


        String bbcUrl = "https://www.bbc.com/";
        this.driver.get(bbcUrl);
        sleepFor(1);
    }
    @Ignore
    @Test//1
    public void discoveryTest() throws InterruptedException {

        explore.discovery();
        result("See where old and new intersect, often with technology and innovation",
                "//img[@title='See where old and new intersect, often with technology and innovation (Credit: Credit: Helmut Corneli/Alamy)']");

    }
    @Test//2
    public void animalDiscoveryTest() throws InterruptedException {

        explore.animalDiscovery();
        result("The discovery of two new Australian glider species is a boon for biodiversity yet presents a serious challenge for conservation.","//p[contains(@class,'introduction')]");

    }

    @Test//3
    public void visionWalkToursTest() throws InterruptedException {

        explore.visionWalkTours();


        result("Byron Bay Hinterland Tours","//span[text()='Byron Bay Hinterland Tours']");
    }

    @Test//4
    public void aFishsEpicTest() throws InterruptedException {

        explore.aFishsEpic();
        result("By Meghan Miner Murray","//span[ text()='By Meghan Miner Murray']");
    }

    @Test//5
    public void partOfEarthTest() throws InterruptedException {

        explore.partOfEarth();
        result("By Lucie McCormick",
                "//span[@class='index-body' and text()='By Lucie McCormick']");
    }
@Test//6
    public void earthsSoulTest() throws InterruptedException {

        explore.earthsSoul();
        result("An otherworldly landscape","//span[@class='fullsized_caption_title' and text()='An otherworldly landscape']");
    }




    public void result(String expected, String actual) {
        String expectedText = expected;
        String actualText = getTextByXpath(actual);
        Assert.assertEquals(actualText, expectedText, "the text did not match");

    }
}