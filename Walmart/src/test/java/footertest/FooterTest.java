package footertest;

import common.WebAPI;
import footer.Footer;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static footer.FooterWebElement.*;

public class FooterTest extends WebAPI {

    Footer footer;

    @BeforeMethod
    public void init() {
        footer = PageFactory.initElements(driver, Footer.class);

    }

    @Test
    public void urlTest() {

        String actualText = driver.getCurrentUrl();
        Assert.assertEquals(actualText, walmartUrl, "Test failed");

    }

    @Test
    public void titleTest() {

        String expectedText = "Walmart.com | Save Money. Live Better.";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Test failed");

    }

    @Test
    public void nameTest() throws InterruptedException {
        footer.scrollDown();
        String expectedText = "Walmart.com";
        String actualText = getTextByXpath(nameLocator);
        Assert.assertEquals(actualText, expectedText, "Test failed");


    }

    @Test
    public void adNameTest() throws InterruptedException {
        footer.scrollDown();
        assertEqualByXpath(adButton, "Our Ads");


    }

    @Test
    public void adTitleTest() throws InterruptedException {
        footer.adPage();
        String expectedText = "Notices";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Test failed");


    }

    @Test
    public void adUrlTest() throws InterruptedException {
        footer.adPage();
        String actualText = driver.getCurrentUrl();
        Assert.assertEquals(actualText, adsUrl, "Test failed");


    }

    @Test
    public void termNameTest() throws InterruptedException {
        footer.scrollDown();
        assertEqualByXpath(termButton, "Terms of Use");


    }

    @Test
    public void termPageTest() throws InterruptedException {
        footer.termPage();
        String expectedText = "Walmart.com Terms of Use - Walmart.com";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Test failed");


    }

    @Test
    public void termUrlTest() throws InterruptedException {
        footer.termPage();
        String actualText = driver.getCurrentUrl();
        Assert.assertEquals(actualText, termsUrl, "Test failed");


    }

    @Test
    public void privacyNameTest() throws InterruptedException {
        footer.scrollDown();
        assertEqualByXpath(privacyButton, "Privacy & Security");


    }

    @Test
    public void privacyPageTest() throws InterruptedException {
        footer.privacyPage();
        String expectedText = "Privacy & Security";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Test failed");


    }

    @Test
    public void privacyUrlTest() throws InterruptedException {
        footer.privacyPage();
        String actualText = driver.getCurrentUrl();
        Assert.assertEquals(actualText, privacyUrl, "Test failed");


    }

    @Test
    public void caPrivacyNameTest() throws InterruptedException {
        footer.scrollDown();
        assertEqualByXpath(caPrivacyButton, "CA Privacy Rights");


    }

    @Test
    public void caPrivacyPageTest() throws InterruptedException {
        footer.caPrivacyPage();
        String expectedText = "California Privacy Rights";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Test failed");


    }

    @Test
    public void caPrivacyUrlTest() throws InterruptedException {
        footer.caPrivacyPage();
        String actualText = driver.getCurrentUrl();
        Assert.assertEquals(actualText, caPrivacyUrl, "Test failed");


    }

    @Test
    public void sellPersonalNameTest() throws InterruptedException {
        footer.scrollDown();
        assertEqualByXpath(sellPersonalButton, "Do Not Sell My Personal Information");


    }

    @Test
    public void sellPersonalPageTest() throws InterruptedException {
        footer.sellPersonalPage();
        String expectedText = "Who is making the request and are they a CA resident?";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Test failed");


    }

    @Test
    public void sellPersonalUrlTest() throws InterruptedException {
        footer.sellPersonalPage();
        String actualText = driver.getCurrentUrl();
        Assert.assertEquals(actualText, sellPersonalUrl, "Test failed");


    }

    @Test
    public void reqPersonalNameTest() throws InterruptedException {
        footer.scrollDown();
        assertEqualByXpath(reqPersonalButton, "Request My Personal Information");


    }

    @Test
    public void reqPersonalPageTest() throws InterruptedException {
        footer.reqPersonalPage();
        String expectedText = "Who is making the request and are they a CA resident?";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Test failed");


    }

    @Test
    public void reqPersonalUrlTest() throws InterruptedException {
        footer.reqPersonalPage();
        String actualText = driver.getCurrentUrl();
        Assert.assertEquals(actualText, reqPersonalUrl, "Test failed");


    }

    @Test
    public void taxNameTest() throws InterruptedException {
        footer.scrollDown();
        assertEqualByXpath(taxButton, "Tax Exempt Program");


    }

    @Test
    public void taxPageTest() throws InterruptedException {
        footer.taxPage();
        String expectedText = "Walmart tax exempt";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Test failed");


    }

    @Test
    public void supplyChainSecurityNameTest() throws InterruptedException {
        footer.scrollDown();
        assertEqualByXpath(supplyChainSecurityButton, "California Supply Chain Security Act");


    }

    @Test
    public void supplyChainSecurityTest() throws InterruptedException {
        footer.supplyChainSecurityPage();
        String expectedText = "California Transparency in Supply Chains Act";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Test failed");


    }


}