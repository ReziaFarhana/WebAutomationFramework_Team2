package get_to_know_us;

import common.WebAPI;
import data.DataStorage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.io.IOException;
import java.util.List;
import java.util.Properties;

import static databases.ConnectToSqlDB.loadProperties;
import static get_to_know_us.GetToKnowUsWebElement.BeautyCategoryWebElement.*;
import static get_to_know_us.GetToKnowUsWebElement.*;

public class GetToKnowUs extends WebAPI {

    @FindBy(how = How.XPATH, using = getToKnowUsText)
    public WebElement getToKnowUsXp;
    @FindBy(how = How.XPATH, using = ourCompanyLocator)
    public WebElement ourCompany;
    @FindBy(how = How.CSS, using = walmartLogoInCorporateLocator)
    public WebElement walmartLogoInCorporate;
    @FindBy(how = How.LINK_TEXT, using = ourStoryLocator)
    public WebElement ourStory;
    @FindBy(how = How.XPATH, using = leadershipLocator)
    public WebElement leadership;
    @FindBy(how = How.XPATH, using = executiveManagementLocator)
    public WebElement executiveManagement;
    @FindBy(how = How.XPATH, using = boardOfDirectorsLocator)
    public WebElement boardOfDirectors;

    @FindBy(how = How.CSS, using = workingAtWalmartLocator)
    public WebElement workingAtWalmart;
    @FindBy(how = How.XPATH, using = careerAtWalmartLocator)
    public WebElement careerAtWalmart;
    @FindBy(how = How.XPATH, using = moreThanExpectedVideoLocator)
    public WebElement moreThanExpectedVideo;
    @FindBy(how = How.XPATH, using = walmartCareerPageLocator)
    public WebElement walmartCareerPage;
    @FindBy(how = How.XPATH, using = careerTextLocator)
    public WebElement careerText;
    @FindBy(how = How.XPATH, using = allCareerLocator)
    public WebElement allCareerAreas;
    @FindBy(how = How.XPATH, using = technologyFromCareerLocator)
    public WebElement technologyFromCareer;
    @FindBy(how = How.XPATH, using = searchJobTitleLocator)
    public WebElement searchJobTitle;
    @FindBy(how = How.XPATH, using = jobAllLocationLocator)
    public WebElement jobAllLocation;
    @FindBy(how = How.XPATH, using = jobAllLocationSearchLocator)
    public WebElement jobAllLocationSearch;

    @FindBy(how = How.XPATH, using = searchResultLocator)
    public WebElement searchResult;
    @FindBy(how = How.CLASS_NAME, using = searchForJobsLocator)
    public WebElement searchForJobs;
    @FindBy(how = How.CSS, using = searchBtnForJobsLocator)
    public WebElement searchBtnForJobs;
    @FindBy(how = How.XPATH, using = searchJobsByFindElementsLocator)
    public WebElement searchJobsByFindElements;
    //  @FindBy(how=How.PARTIAL_LINK_TEXT, using=fullTimeLocator) public WebElement fullTime;
    @FindBy(how = How.XPATH, using = fullTimeCheckBoxLocator)
    public WebElement fullTimeCheckBox;

    @FindBy(how = How.XPATH, using = careerLoginLocator)
    public WebElement careerLogin;
    @FindBy(how = How.XPATH, using = careerLoginLocator)
    public WebElement welcomeTextInLoginPage;
    @FindBy(how = How.XPATH, using = userNameLocator)
    public WebElement userNameField;
    @FindBy(how = How.XPATH, using = passwordLocator)
    public WebElement passwordField;
    //slideShow
    @FindBy(how = How.XPATH, using = slideShowBtnLocator)
    public WebElement slideShowBtn;
    @FindBy(how = How.XPATH, using = searchLocator)
    public WebElement searchBox;
    @FindBy(how = How.XPATH, using = searchBtnLocator)
    public WebElement searchBtn;
    @FindBy(how = How.XPATH, using = toySearchTextLocator)
    public WebElement toySearchText;
    @FindBy(how = How.CSS, using = shopByAgeLocator)
    public WebElement shopByAge;
    @FindBy(how = How.CSS, using = toysForKidsLocator)
    public WebElement toysForKids;
    @FindBy(how = How.CSS, using = giftingLocator)
    public WebElement gifting;
    @FindBy(how = How.CSS, using = giftingDepartmentLocator)
    public WebElement giftingDepartment;
    // @FindBy(how=How.CSS, using=toysForKidsLocator) public WebElement toysForKids;
    @FindBy(how = How.CSS, using = hotWheelsLocator)
    public WebElement hotWheels;


//

    public void verifyGetToKnowUsInFooter() {
        windowsFullPageScrollDown();
        getToKnowUsXp.isDisplayed();
    }

    //2:navigate().to()
    public void verifyOurCompanyIsClickable() {
        verifyGetToKnowUsInFooter();
        clickByXpath(ourCompanyLocator);
        driver.navigate().to("https://corporate.walmart.com/");
    }
    //3walmart logo in Corporate page

    public void verifyWalmartLogoInCorporatePageIsDisplayed() {
        verifyOurCompanyIsClickable();
        walmartLogoInCorporate.isDisplayed();
    }

    public void verifyOurStory() throws InterruptedException {
        verifyOurCompanyIsClickable();
        Actions actions = new Actions(driver);
        actions.moveToElement(ourStory).build().perform();
        sleepFor(3);
        clickByXpath(leadershipLocator);
        getTextByXpath(executiveManagementLocator);
    }

    public void verifyBoardOfDirectors() throws InterruptedException {
        verifyOurCompanyIsClickable();
        Actions actions = new Actions(driver);
        actions.moveToElement(ourStory).build().perform();
        sleepFor(3);
        clickByXpath(leadershipLocator);
        getTextByXpath(boardOfDirectorsLocator);
    }

    public void verifyWorkingAtWalmart() throws InterruptedException {
        verifyOurCompanyIsClickable();
        Actions actions = new Actions(driver);
        actions.moveToElement(ourStory).build().perform();
        sleepFor(3);
        clickByCss(workingAtWalmartLocator);
        clickByXpath(careerAtWalmartLocator);
    }

    public void verifyMoreThanExpectedVideo() throws InterruptedException {
        verifyWorkingAtWalmart();
        Actions actions = new Actions(driver);
        actions.moveToElement(moreThanExpectedVideo).build().perform();
        sleepFor(3);
        moreThanExpectedVideo.click();
    }

    public void verifyWalmartCareerPage() throws InterruptedException {
        verifyWorkingAtWalmart();
        driver.navigate().to("https://corporate.walmart.com/our-story/working-at-walmart");
        driver.navigate().to("https://corporate.walmart.com/our-story/working-at-walmart#careers");

    }

    public void verifyAllCareerAreas() throws InterruptedException {
        driver.navigate().to(" http://careers.walmart.com/");
        sleepFor(3);
        allCareerAreas.click();
        Actions actions = new Actions(driver);
        actions.moveToElement(technologyFromCareer).perform();
        sleepFor(3);
        searchJobTitle.sendKeys("manager");
        jobAllLocation.sendKeys("NY");
        clickByXpath(jobAllLocationSearchLocator);

    }

    public void verifyCareerLogin() throws InterruptedException {
        driver.navigate().to(" http://careers.walmart.com/");
        sleepFor(3);
        WebElement popupWindow = null;
        popupWindow.click();
        Actions actions = new Actions(driver);
        actions.moveToElement(careerLogin).build().perform();
        sleepFor(2);
        clickByLinkText("ECOMMERCE");
    }


    public void verifySearchForJobs() {//Software Engineering
        driver.navigate().to(" http://careers.walmart.com/");
        WebElement popupWindow = null;
        popupWindow.click();
        searchForJobs.sendKeys("Software Engineer");
        searchBtnForJobs.click();
    }

    public void verifySearchForJobsByFindElements() {
        verifySearchForJobs();
        List<WebElement> webElements = driver.findElements(By.xpath("//*[@class='WP4F WDVO WN5 WGAG']/div"));
        System.out.println(webElements);

    }

    public void verifyFullTimeCheckBox() throws InterruptedException {
        verifySearchForJobs();
        clickByXpath(fullTimeCheckBoxLocator);
        sleepFor(1);
        clickByXpath(fullTimeCheckBoxLocator);
    }

    public void verifySlideShow() throws InterruptedException {
        for (int i = 0; i < 4; i++) {
            clickByXpath(slideShowBtnLocator);
            sleepFor(2);
        }
    }

    public void verifySearchBox() throws InterruptedException {
        searchBox.sendKeys("Toys");
        sleepFor(2);
        clickByXpath(searchBtnLocator);
//            toySearchText.isDisplayed();
    }

    public void verifyShopByAge() throws InterruptedException {
        windowsPageScrollToLocator(By.xpath(shopByAgeLocator));
        Actions actions = new Actions(driver);
        actions.moveToElement(toysForKids).build().perform();
        clickByCss(giftingLocator);
        // waitUntilVisible(By.cssSelector(giftingDepartmentLocator));
        clickByXpath(toysForKidsLocator);
        Actions act = new Actions(driver);
        act.moveToElement(hotWheels).build().perform();
        sleepFor(2);

    }


    public void walmartSignIn() throws IOException {
        Properties properties = loadProperties();
        String email = properties.getProperty("emailAddress");
        String password = properties.getProperty("password");
        clickByXpath(accountLocator);
        clickByXpath(signInLocator);
        typeById(emailInputBox, email);
        typeById(passwordInputBox, password);
        clickByXpath(keepMeSignInCheckBox);
        clickByCss(signInButton);
    }
}



