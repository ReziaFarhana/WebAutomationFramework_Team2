package testWalmartHomePage;


import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

import org.testng.Assert;


public class Verizon_Home_Page {


    @FindBy (xpath = "/html/body/div[1]/div/div/div/div/div[1]/div/div[1]/div[2]/div/div[1]/div[2]/div[2]/div/div/div[2]/div/button[2]")
    WebElement whyVerizon;

    @FindBy (xpath = "//*[@id=\"vz-gh20\"]/div/div/div/div[1]/div/div[1]/div[2]/div/div[1]/div[2]/div[2]/div/div/div[2]/div/div/div[2]/div")
    WebElement whyVerizonText;

    @FindBy (xpath = "//*[@id=\"gnav20-Why-Verizon-L2-1\"]")
    WebElement whyVerizonOverVew;

    @FindBy (xpath = "//*[@id=\"gnav20-Why-Verizon-L2-2\"]")
    WebElement network;

    @FindBy (xpath = "//*[@id=\"gnav20-Why-Verizon-L2-3\"]")
    WebElement getMore;

    @FindBy(xpath = "//*[@id=\"gnav20-Why-Verizon-L2-4\"]")
    WebElement socialImpact;


    @FindBy (xpath = "//*[@id=\"vz-gh20\"]/div/div/div/div[1]/div/div[1]/div[2]/div/div[1]/div[2]/div[2]/div/div/div[2]/div/div/div[2]/ul/li[2]/div/div")
    WebElement networkText;

    @FindBy (xpath = "//*[@id=\"gnav20-Why-Verizon-L3-1\"]")
    WebElement fiveG_OverView;

    @FindBy (xpath = "//*[@id=\"gnav20-Why-Verizon-L3-2\"]")
    WebElement wirelessCoverageMap;

    @FindBy (xpath = "//*[@id=\"gnav20-Why-Verizon-L3-2\"]")
    WebElement fiveGLabs;

    @FindBy (xpath ="//*[@id=\"gnav20-Why-Verizon-L3-4\"]" )
    WebElement networkAwards;

    @FindBy (xpath = "//*[@id=\"gnav20-Why-Verizon-L3-5\"]")
    WebElement fios;

    @FindBy (xpath = "//*[@id=\"gnav20-Why-Verizon-L3-6\"]" )
    WebElement globalCoverage;

    @FindBy (xpath = "//*[@id=\"section_copy_copy_57\"]/div/div/div/div[1]/div[1]/h1")

    WebElement globalHelloText;



    public void verifyIsWhyVerizonClickable() throws InterruptedException {
        whyVerizon.click();
        Thread.sleep(3000);
    }

    public void verifyWhyVerizonText() throws InterruptedException {

        whyVerizon.click();
        Thread.sleep(3000);
        whyVerizonText.click();
        String s= whyVerizonText.getText();
        Assert.assertEquals(s,"Why Verizon");

        }
    public void verifyWhyVerizonOverviewPageDisplayed() throws InterruptedException{

        whyVerizon.click();
        Thread.sleep(3000);
        boolean displayed = whyVerizonOverVew.isDisplayed();
        Assert.assertTrue(displayed);


    }

    public void verifyIsNetworkButtonWorking() throws InterruptedException {
        whyVerizon.click();
        Thread.sleep(3000);
        network.click();
    }

    public void verifyIsGetMoreFunctionClickable() throws InterruptedException {

        whyVerizon.click();
        Thread.sleep(3000);
        boolean isIt = getMore.isEnabled();
        Assert.assertTrue(isIt);
    }

    public void verifyIsSocialImpactWorks() throws InterruptedException {
        whyVerizon.click();
        Thread.sleep(3000);
        boolean b= socialImpact.isEnabled();
        Assert.assertTrue(b);
    }

    public void verifyNetworkTextIsUnderNetworkButton() throws InterruptedException {

        whyVerizon.click();
        Thread.sleep(3000);

        network.click();

    }

    public void verify5gOverviewPageIsDisPlay() throws InterruptedException {

        whyVerizon.click();
        Thread.sleep(3000);

        network.click();
        Thread.sleep(3000);

        boolean b =fiveG_OverView.isDisplayed();
        Assert.assertTrue(b);


    }

    public void verifyWirelessCoverageMapIsDisplay() throws InterruptedException {

        whyVerizon.click();
        Thread.sleep(3000);

        network.click();
        Thread.sleep(3000);

      boolean isIt =  wirelessCoverageMap.isDisplayed();
      Assert.assertEquals(isIt, true, "Wireless Coverage Map Successfully displayed");

      Thread.sleep(3000);



    }


    public void verify5gLabsIsWorking() throws InterruptedException {

        whyVerizon.click();
        Thread.sleep(3000);

        network.click();
        Thread.sleep(3000);

       boolean isItEnable= fiveGLabs.isEnabled();
       Assert.assertTrue(isItEnable);

    }

    public void verifyIsNetworkAwardPageEnable() throws InterruptedException {

        whyVerizon.click();
        Thread.sleep(3000);

        network.click();
        Thread.sleep(3000);

        networkAwards.isEnabled();

    }

    public void verifyTheFiosPage() throws InterruptedException {

        whyVerizon.click();
        Thread.sleep(3000);

        network.click();
        Thread.sleep(3000);

        boolean fiosDisplay =fios.isDisplayed();
        Assert.assertEquals(fiosDisplay, true, "Fios Page is displayed");


    }

    public void verifyTheGlobalCoveragePage() throws InterruptedException {

        whyVerizon.click();
        Thread.sleep(3000);

        network.click();
        Thread.sleep(3000);

        globalCoverage.click();

    }

    public void veriyGlobalHelloTextReadable() throws InterruptedException {

        whyVerizon.click();
        Thread.sleep(3000);

        network.click();
        Thread.sleep(3000);

       if (globalCoverage.isEnabled()){
           globalCoverage.getText();

       }

       //globalHelloText.getText();
       //Thread.sleep(3000);
    }

}
