package geicoHomePage;

import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import static geicoHomePage.WebElement.*;


public class Insurance extends WebAPI {


    public void propertyInsurancePage() throws InterruptedException {

        clickByXpath("//a[normalize-space()='Insurance']");
        sleepFor(4);
        clickByXpath("//*[@id=\"primary-navigation\"]/div[2]/ul/li[2]/a/span[2]");

    }

    public void typesOfPropertyInsurance() throws InterruptedException {


        propertyInsurancePage();
        //contact us--> radio buttons

        clickByLinkText("contact us");


        WebElement claimsButton=driver.findElement(By.xpath(claimsButtonXpath));
        claimsButton.click();
        sleepFor(2);
        WebElement quotesButton=driver.findElement(By.xpath(quotesButtonXpath));
        quotesButton.click();
        sleepFor(1);
        WebElement paymentsButton=driver.findElement(By.xpath(paymentsButtonXpath));
        paymentsButton.click();
        WebElement roadSideAssistenceButton=driver.findElement(By.xpath(rdSideAssistButtonXpath));
        roadSideAssistenceButton.click();
        sleepFor(2);
        WebElement somethingElseButton=driver.findElement(By.xpath(somethingElseButtonXpath));
        somethingElseButton.click();

        //click continue

        WebElement myPolicyButton=driver.findElement(By.xpath(myPolicybuttonXpath));
        myPolicyButton.click();
        clickById(continueButton);
        WebElement updatePolicy=driver.findElement(By.xpath(updatePolicyButton));
        updatePolicy.click();
        clickByXpath(policyTopicContinue);
        //choose topic
        WebElement updateVehicle=driver.findElement(By.xpath(updateVehicleButton));
        updateVehicle.click();
        clickByXpath(policyUpdateContinue);

    }
    //--Hover Over
    public void businessInsurance() throws InterruptedException {
        WebElement geicoInsurance =driver.findElement(By.xpath(insurance));
        WebElement business=driver.findElement(By.xpath(businessInsurance));
        WebElement owner=driver.findElement(By.xpath(businessOwner));
        Actions actions = new Actions(driver);
        actions.moveToElement(geicoInsurance).click().build().perform();
        sleepFor(3);
        actions.moveToElement(business).build().perform();
        sleepFor(3);
        actions.moveToElement(owner).click().build().perform();
        sleepFor(3);
    }

    public void getQuote() throws InterruptedException {
        businessInsurance();
        //windowHandle();
        scrollByXPATH(("//h3[text()='Commercial Auto Insurance']"));
        sleepFor(3);
        clickByXpath(commercialQuote);
        typeOnElement(zipcode,"11590");
        Select businessType=new Select(driver.findElement(By.xpath(businessDescription)));
        businessType.selectByVisibleText("Other Common Businesses");
        Select businessOption=new Select(driver.findElement(By.xpath(businessDescription)));
        businessOption.selectByVisibleText("Wholesale & Manufacturing Businesses");
        clickByXpath(continueButton2);

    }









}
