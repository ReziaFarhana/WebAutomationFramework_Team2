package contactustest;

import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import contactus.ContactUs;

import static contactus.ContactUsWebElement.*;


public class ContactUsTest extends WebAPI {

    ContactUs contact;

    @BeforeMethod
    public void init() {
        contact = PageFactory.initElements(driver, ContactUs.class);

    }

    @Test
    public void urlTest() throws InterruptedException {
        contact.locateContactUs();
        String actualText = driver.getCurrentUrl();
        Assert.assertEquals(actualText, geicoUrl, "Test failed");
    }

    @Test
    public void titleTest() throws InterruptedException {
        contact.locateContactUs();
        String expectedText = "An Insurance Company For Your Car And More | GEICO";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Test failed");

    }

    @Test
    public void contactUsTabTest() throws InterruptedException {
        contact.locateContactUs();
        assertEqualByXpath(contactUsTab, "CONTACT US");

    }

    @Test
    public void aboutUsPageTest() throws InterruptedException {
        contact.contactUsPage();
        String actualText = driver.getCurrentUrl();
        Assert.assertEquals(actualText, contactUsUrl, "Test failed");

    }


    @Test
    public void aboutUsTitleTest() throws InterruptedException {
        contact.contactUsPage();
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, "How To Contact Us ~ Customer Service Information | GEICO", "Test failed");

    }

    @Test
    public void helpSectionTest() throws InterruptedException {
        contact.contactUsPage();
        assertEqualByXpath(helpSection, "What do you need help with today?");

    }

    @Test
    public void quickLinksTest() throws InterruptedException {
        contact.contactUsPage();
        assertEqualByXpath(quickLinksSection, "Quick Links");

    }

    @Test
    public void expressServicesTest() throws InterruptedException {
        contact.contactUsPage();
        assertEqualByXpath(expressServices, "Express Services");

    }

    @Test
    public void claimsCenterTest() throws InterruptedException {
        contact.contactUsPage();
        assertEqualByXpath(claimsCenter, "Claims Center");

    }

    @Test
    public void getaQuoteTest() throws InterruptedException {
        contact.contactUsPage();
        assertEqualByXpath(getaQuote, "Get a Quote");

    }

    @Test
    public void getIdCardUrlTest() throws InterruptedException {
        contact.getIdCardsPage();
        String actualText = driver.getCurrentUrl();
        Assert.assertEquals(actualText, getIdCardUrl, "Test failed");
    }

    @Test
    public void getIdCardTitleTest() throws InterruptedException {
        contact.getIdCardsPage();
        String expectedText = "Online Service Center | GEICO";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Test failed");

    }

    @Test
    public void trackaClaimTabTest() throws InterruptedException {
        contact.contactUsPage();
        assertEqualByXpath(trackaClaimTab, "Track a claim");

    }



    @Test
    public void trackaClaimTitleTest() throws InterruptedException {
        contact.trackaClaimPage();
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, "Access Your Claim", "Test failed");

    }

    @Test
    public void autoInsuranceTabTest() throws InterruptedException {
        contact.contactUsPage();
        assertEqualByXpath(autoInsuranceTab, "Auto insurance");

    }



    @Test
    public void autoInsuranceTitleTest() throws InterruptedException {
        contact.autoInsurancePage();
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, "Car Insurance - Start a Free Auto Insurance Quote | GEICO", "Test failed");

    }

    @Test
    public void policyDocsTabTest() throws InterruptedException {
        contact.contactUsPage();
        assertEqualByXpath(policyDocsTab, "Policy documents");

    }

    @Test
    public void policyDocsUrlTest() throws InterruptedException {
        contact.policyDocsPage();
        String actualText = driver.getCurrentUrl();
        Assert.assertEquals(actualText, policyDocsUrl, "Test failed");
    }

    @Test
    public void policyDocsTitleTest() throws InterruptedException {
        contact.policyDocsPage();
        String expectedText = "Online Service Center | GEICO";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Test failed");

    }

    @Test
    public void makePaymentTabTest() throws InterruptedException {
        contact.contactUsPage();
        assertEqualByXpath(makePaymentTab, "Make a Payment");

    }

    @Test
    public void makePaymentUrlTest() throws InterruptedException {
        contact.makePaymentPage();
        String actualText = driver.getCurrentUrl();
        Assert.assertEquals(actualText, makePaymentUrl, "Test failed");
    }

    @Test
    public void makePaymentTitleTest() throws InterruptedException {
        contact.makePaymentPage();
        String expectedText = "Online Service Center | GEICO";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Test failed");

    }

    @Test
    public void goPaperlessTabTest() throws InterruptedException {
        contact.contactUsPage();
        assertEqualByXpath(goPaperlessTab, "Go Paperless");

    }

    @Test
    public void goPaperlessUrlTest() throws InterruptedException {
        contact.goPaperlessPage();
        String actualText = driver.getCurrentUrl();
        Assert.assertEquals(actualText, goPaperlessUrl, "Test failed");
    }

    @Test
    public void goPaperlessTitleTest() throws InterruptedException {
        contact.goPaperlessPage();
        String expectedText = "Online Service Center | GEICO";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Test failed");

    }





}
