package sample;

import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.io.IOException;

import static sample.WalmartHomePageWebElements.*;

public class WlamartHomePage extends WebAPI {

    WebAPI wa = new WebAPI();

    @FindBy(how = How.XPATH, using = searchBoxLocator)
    public WebElement searchBox;
    @FindBy(how = How.XPATH, using = searchButtonLocator)
    public WebElement searchButton;
    @FindBy(how = How.XPATH, using = careers)
    public WebElement career;
    @FindBy(how = How.XPATH, using = allCareersArea)
    public WebElement allCareers;
    @FindBy(xpath = careersLocation)
    public WebElement careerLoc;
    @FindBy(xpath = walmartplusText)
    public WebElement walmartplusText1;
    @FindBy(xpath = Accounttab)
    public WebElement Accountabb;
    @FindBy(xpath = Samsclub)
    public WebElement Samscl;
    @FindBy(xpath = walmartplus)
    public WebElement wlmplus;
    @FindBy(xpath = walmrtplusText1)
    public WebElement wlmplus1;
    @FindBy(xpath = fifteendaysoff)
    public WebElement fiftenday;
    @FindBy(xpath = allcareerarea)
    public WebElement allCareerArea;
    @FindBy(xpath = jobTitle)
    public WebElement jobtitle;
    @FindBy(xpath = menu)
    public WebElement menu1;
    @FindBy(xpath = homeImprovment)
    public WebElement homeImprovment1;
    @FindBy(xpath = doorsandGates)
    public WebElement doorsandGates1;
    @FindBy(xpath = Benefits)
    public WebElement Benifits1;
    @FindBy(xpath = allBenefits)
    public WebElement allBenefits1;
    @FindBy(xpath = getWalmartplusbenifits)
    public WebElement getWalmartplusbenifits1;
    @FindBy(xpath = getFifteendaysoff)
    public WebElement getFifteendaysoff1;
    @FindBy(xpath = searchMyStore)
    public WebElement searchMyStore1;
    @FindBy(xpath = searchButtontrial)
    public WebElement searchButtontrial1;
    @FindBy(xpath = vase)
    public WebElement vase1;
    @FindBy(xpath = cart)
    public WebElement cart1;
    @FindBy(xpath = addMoreItems)
    public WebElement addMoreItems1;
    @FindBy(xpath = SignInToCreateAnAccount)
    public WebElement SignInToCreateAnAccount1;
    @FindBy(xpath = CreateAnAccount)
    public WebElement CreateAnAccount1;
    @FindBy(xpath = CreateWalmartAccount)
    public WebElement CreateWalmartAccount1;

    public void searchBox() throws InterruptedException {
        searchBox.sendKeys(productName);
        Thread.sleep(3000);
        searchButton.click();

    }

    public void Careers() throws InterruptedException {
        career.click();
        Thread.sleep(5000);
        allCareers.click();
        Thread.sleep(5000);


    }


    public void CareersLocations() throws InterruptedException {
        career.click();
        Thread.sleep(5000);
        allCareers.click();
        allCareers.wait();
        sleepFor(20);
        careerLoc.click();

    }


    public void Careerstab() throws InterruptedException {
        career.click();
        Thread.sleep(5000);
    }


    public void clickOnElement(String locator) {
        try {
            driver.findElement(By.cssSelector(walmartplus)).click();
        } catch (Exception ex) {
            try {
                driver.findElement(By.className(walmartplus)).click();
            } catch (Exception ex2) {
                try {
                    driver.findElement(By.id(walmartplus)).click();
                } catch (Exception ex3) {
                    driver.findElement(By.xpath(walmartplus)).click();
                }
            }
        }
    }

    public void brockenlink() throws IOException {
        WebAPI wp = new WebAPI();
        wa.brokenLink();
    }

    public void wlamrtplusTab() throws InterruptedException {
        wlmplus.click();
        wait(10);
    }

    public void fifteendaysofftab() throws InterruptedException {
        wlmplus.click();
        wlmplus1.click();
        fiftenday.click();


    }

    public void allCarreerArea() throws InterruptedException {
        career.click();
        Thread.sleep(5000);
        allCareerArea.click();


    }

    public void Jobtitle() throws InterruptedException {
        career.click();
        sleepFor(5);
        allCareers.click();
    }

    public void menuTab() throws InterruptedException {
        menu1.click();
        mouseHoverByXpath(homeImprovment);
        Thread.sleep(5000);

    }

    public void walmartPlusBenifits() throws InterruptedException {
        getWalmartplusbenifits1.click();
        sleepFor(5);
        getFifteendaysoff1.click();
        sleepFor(5);
        searchMyStore1.sendKeys("vase");
        searchButtontrial1.click();


    }

    public void inputBox() {
        typeOnInputBox(searchButtontrial, "vase");
    }

    public void freeTrial() throws InterruptedException {

        getWalmartplusbenifits1.click();
        sleepFor(5);
        getFifteendaysoff1.click();
        sleepFor(5);
        cart1.click();
        addMoreItems1.click();
        SignInToCreateAnAccount1.click();
        CreateAnAccount1.click();


    }


}



