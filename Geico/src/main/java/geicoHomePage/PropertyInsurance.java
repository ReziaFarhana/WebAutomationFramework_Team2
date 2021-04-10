package geicoHomePage;

import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static geicoHomePage.WebElement.*;


public class PropertyInsurance extends WebAPI {


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







}
