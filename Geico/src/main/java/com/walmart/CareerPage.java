package com.walmart;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class CareerPage extends WebAPI {
@FindBy(xpath = "//*[@id=\"header-left-links\"]/ul[1]/li[1]/a")
WebElement insuranceBtn;
@FindBy(xpath = "//body/nav[@id='primary-navigation']/div[2]/ul[1]/li[3]/a[1]/span[2]")
WebElement businessInsuranceBtn;
@FindBy(xpath = "//*[@id=\"primary-navigation\"]/div[2]/ul/li[3]/div/ul/li[1]/a/span")
private WebElement businessOwnerBtn;
    @FindBy(xpath = "//*[@id=\"primary-navigation\"]/div[2]/ul/li[3]/div/ul/li[2]/a/span")
    private WebElement generalLiabilityBtn;
    @FindBy(xpath = "//*[@id=\"primary-navigation\"]/div[2]/ul/li[3]/div/ul/li[3]/a/span")
    private WebElement professionalLiabilityBtn;
    @FindBy(xpath = "//*[@id=\"primary-navigation\"]/div[2]/ul/li[3]/div/ul/li[4]/a/span")
    private WebElement cyberLiabilityBtn;
    @FindBy(xpath = "//*[@id=\"primary-navigation\"]/div[2]/ul/li[3]/div/ul/li[5]/a/span")
    private WebElement workerCompensationBtn;
    @FindBy(xpath = "//body/nav[@id='primary-navigation']/div[2]/ul[1]/li[3]/div[1]/ul[1]/li[6]/a[1]/span[1]")
    private WebElement medicalMalpracticeBtn;
    @FindBy(xpath = "//*[@id=\"primary-navigation\"]/div[2]/ul/li[3]/div/ul/li[7]/a/span")
    private WebElement wellnessAndFitnessBtn;
    @FindBy(xpath = "//*[@id=\"primary-navigation\"]/div[2]/ul/li[3]/div/ul/li[8]/a/span")
    private WebElement commercialAutoBtn;
    @FindBy(xpath = "//*[@id=\"primary-navigation\"]/div[2]/ul/li[3]/div/ul/li[6]/a/span")
    private WebElement rideshareBtn;
    @FindBy(xpath = "/html/head/title")
    WebElement InsuranceCalculator;
    @FindBy(xpath = "//*[contains(text(),'See all our Business Insurance products')]")
    WebElement allBusinessProductLink;
    @FindBy(css = "#title-bar > p")
    WebElement getMedicalMalpracticeText;





    public void checkIfInsuranceBtnIsClickable(){
    insuranceBtn.click();
}
public void checkBusinessInsuranceBtnIsEnabled(){
    insuranceBtn.click();
    businessInsuranceBtn.click();
}

public void verifyIfCustomerIsAbleToNavigateToBusinessOwnerPage() throws InterruptedException {
    insuranceBtn.click();
    Actions actions=new Actions(driver);
    Thread.sleep(3000);
    actions.moveToElement(businessInsuranceBtn).perform();
    Thread.sleep(3000);
    businessOwnerBtn.click();
}

public void verifyBusinessInsuranceCalculator(){
        insuranceBtn.click();
        businessInsuranceBtn.click();
        boolean b=InsuranceCalculator.isEnabled();
        Assert.assertTrue(b);


}
    public void verifyIfCustomerIsAbleToNavigateToGeneralLiabilityPage() throws InterruptedException {
        insuranceBtn.click();
        Actions actions=new Actions(driver);
        Thread.sleep(5000);
        actions.moveToElement(businessInsuranceBtn).perform();
        Thread.sleep(5000);
        generalLiabilityBtn.click();
    }

    public void verifyLinkForAllBusinessProduct(){
        insuranceBtn.click();
        businessInsuranceBtn.click();
        allBusinessProductLink.isEnabled();
        Assert.assertTrue(allBusinessProductLink.isEnabled());
    }

    public void verifyLinkForAllBusinessProductIsClickable(){
        insuranceBtn.click();
        businessInsuranceBtn.click();
        allBusinessProductLink.click();
    }


    public void verifyIfCustomerIsAbleToNavigateToProfessionalLiabilityPage() throws InterruptedException {
        insuranceBtn.click();
        Actions actions=new Actions(driver);
        Thread.sleep(5000);
        actions.moveToElement(businessInsuranceBtn).perform();
        Thread.sleep(5000);
        professionalLiabilityBtn.click();
    }

    public void verifyIfCustomerIsAbleToNavigateToCyberLiabilityPage() throws InterruptedException {
        insuranceBtn.click();
        Actions actions=new Actions(driver);
        Thread.sleep(5000);
        actions.moveToElement(businessInsuranceBtn).build().perform();
        Thread.sleep(5000);
        cyberLiabilityBtn.click();
    }

    public void verifyIfCustomerIsAbleToNavigateToWorkerCompensationPage() throws InterruptedException {
        insuranceBtn.click();
        Actions actions=new Actions(driver);
        Thread.sleep(5000);
        actions.moveToElement(businessInsuranceBtn).perform();
        Thread.sleep(5000);
       workerCompensationBtn.click();
    }

    public void verifyIfCustomerIsAbleToNavigateToMedicalMalpracticePage() throws InterruptedException {
        insuranceBtn.click();
        Actions actions=new Actions(driver);
        Thread.sleep(5000);
        actions.moveToElement(businessInsuranceBtn).perform();
        Thread.sleep(5000);
        medicalMalpracticeBtn.click();
    }

    public void verifyMedicalMalpracticeText() throws InterruptedException {
        insuranceBtn.click();
        Actions actions=new Actions(driver);
        Thread.sleep(5000);
        actions.moveToElement(businessInsuranceBtn).perform();
        Thread.sleep(5000);
        medicalMalpracticeBtn.click();
       String s= getMedicalMalpracticeText.getText();
      Assert.assertEquals(s,"Medical Malpractice Insurance");

    }

    public void verifyIfCustomerIsAbleToNavigateToCommercialAutoPage() throws InterruptedException {
        insuranceBtn.click();
        Actions actions=new Actions(driver);
        Thread.sleep(5000);
        actions.moveToElement(businessInsuranceBtn).perform();
        Thread.sleep(5000);
        businessOwnerBtn.click();
    }

    public void verifyIfCustomerIsAbleToNavigateToRidesharePage() throws InterruptedException {
        insuranceBtn.click();
        Actions actions = new Actions(driver);
        Thread.sleep(5000);
        actions.moveToElement(businessInsuranceBtn).build().perform();
        Thread.sleep(2000);
       rideshareBtn.click();
    }



}
