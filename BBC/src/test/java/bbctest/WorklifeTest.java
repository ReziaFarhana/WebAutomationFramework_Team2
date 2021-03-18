package bbctest;

import bbc.Registration;
import bbc.Worklife;
import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static bbc.bbcWebelements.*;

public class WorklifeTest extends WebAPI {
    Worklife worklife;

    @BeforeMethod
    public void initialization() {
        worklife = PageFactory.initElements(driver, Worklife.class);
    }

    @Test
    public void workLifeTabTest() {
        worklife.worklifeTab();
        String expectedText = "Home - BBC Worklife";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Title is not a match");
    }

 @Test
    public void whatIsWorklifeTabTest(){
        worklife.whatIsWorklifeTab();
        String expectedText = "What is BBC Worklife?";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Title is not a match");
    }

    @Test
    public void howWeWorkTabTest() {
        worklife.howWeWorkTab();
        String expectedText = "How we work";
        String actualText = getTextByXpath(howWeWorkText);
        Assert.assertEquals(actualText, expectedText, "Title is not a match");

    }

    @Test
    public void howWeLiveTabTest() {
        worklife.howWeLiveTab();
        String expectedText = "How we live";
        String actualText = getTextByXpath(howWeLiveText);
        Assert.assertEquals(actualText, expectedText, "Title is not a match");
    }

    @Test
    public void howWeThinkTabTest() {
        worklife.howWeThinkTab();
        String expectedText = "How we think";
        String actualText = getTextByXpath(howWeThinkText);
        Assert.assertEquals(actualText, expectedText, "Title is not a match");
    }

    @Test
    public void equalityMattersTabTest() {
        worklife.equalityMattersTab();
        String expectedText = "Equality Matters";
        String actualText = getTextByXpath(equalityMattersText);
        Assert.assertEquals(actualText, expectedText, "Title is not a match");

    }

    @Test
    public void remoteControlTabTest() {
        worklife.remoteControlTab();
        String expectedText = "Remote Control";
        String actualText = getTextByXpath(remoteControlText);
        Assert.assertEquals(actualText, expectedText, "Title is not a match");

    }

    @Test
    public void worklifeReadMoreTest() {
        worklife.worklifeReadMore();
//        String expectedText = "What are the rules for commenting and uploading?";
//        String actualText = getTextByXpath(rules);
//        Assert.assertEquals(actualText, expectedText, "Title is not a match");
    }

    @Test
    public void termsOfUsePageTest() {
        worklife.termsOfUsePage();
        String expectedText = "What are the rules for commenting and uploading?";
        String actualText = getTextByXpath(rules);
        Assert.assertEquals(actualText, expectedText, "Title is not a match");

    }

    @Test
    public void fullVersionOfBBCTermsOfUseTest() {
        worklife.fullVersionOfBBCTermsOfUse();
        String expectedTitle = "bbc_terms_of_use.pdf";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle,"Ttitle did not match");
    }

    @Test
    public void BBCAccessibilityHelpPageTest() {
        worklife.BBCAccessibilityHelpPage();
        String expectedTitle = "Accessibility";
        String actualTitle = getTextByCss(accessibilityTitle);
        Assert.assertEquals(actualTitle,expectedTitle,"Ttitle did not match");
    }

    @Test
    public void accessibilityIPlayerPageTest() {
        worklife.BBCAccessibilityHelpPage();
        String expectedTitle = "Search results";
        String actualTitle = getTextByXpath(searchResultsText);
        Assert.assertEquals(actualTitle,expectedTitle,"Ttitle did not match");
    }

    @Test
    public void searchResultsPageTest(){
        worklife.searchResultsPage();
        String expectedTitle = "Troubleshooting problems with downloads on a mobile or tablet";
        String actualTitle = getTextByXpath(troubleShootText);
        Assert.assertEquals(actualTitle,expectedTitle,"Ttitle did not match");
    }













}


