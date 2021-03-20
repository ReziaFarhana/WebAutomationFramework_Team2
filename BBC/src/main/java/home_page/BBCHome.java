package home_page;


import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import static home_page.BBCWebElement.*;

public class BBCHome extends WebAPI {

    @FindBy(xpath = lookingForDesign)
    public WebElement design;

    /**
     * This method will look for a culture link from a BBC home page menu
     * and will open it
     * @throws InterruptedException
     */
    public void clickOnCultureOption() throws InterruptedException {
        clickByCss(cultureLinkFromBBCBarMenu);
        sleepFor(3);
    }

    /**
     * Method to open a Film link found in culture home page
     * @throws InterruptedException
     */
    public void useFilmLinkInCultureHomePage() throws InterruptedException {
        clickOnCultureOption();
        clickByXpath(filmInCultureLink);
    }

    /**
     * Method to open a film labeled as The film that broke several taboos
     * which is inside culture page under Film option
     * @throws InterruptedException
     */
    public void openFilmBrokeSeveralTaboos() throws InterruptedException {
        useFilmLinkInCultureHomePage();
        clickByXpath(brokeSeveralTaboos);
    }
       // Leaving this method for further info
    /**
     * Method to load more articles - the button found at the bottom of
     * Film - BBC Culture page
     * @throws InterruptedException
     */
    public void reloadMoreButton() throws InterruptedException {
        useFilmLinkInCultureHomePage();
        scrollToBottomPage();
        int sizeFirst = driver.findElements(By.tagName("span")).size();
        driver.findElement(By.name(reloadMore)).click();
       int sizeSecond = driver.findElements(By.tagName("span")).size();
    }

    /**
     * Method to open the ART link in the culture page
     * @throws InterruptedException
     */
    public void clickOnArtLink() throws InterruptedException {
        clickOnCultureOption();
        clickByXpath(artLinkInCulturePage);
    }

    /**
     * Method to open A detail hidden in a masterpiece By Kelly Grovier
     * using the image link attached
     * @throws InterruptedException
     */
    public void openDetailMasterpiece() throws InterruptedException {
        clickOnArtLink();
        scroll("1000");
        sleepFor(2);
        clickByXpath(detailHiddenInMasterpiece);
    }

    /**
     * Method to open What do our dreams mean? By Cath Pound
     * using the text link
     * @throws InterruptedException
     */
    public void openWhatDoOurDreamsMeansLink() throws InterruptedException {
        clickOnArtLink();
        clickByCss(whatDoOurDreamsMeans);
        sleepFor(3);
    }

    /**
     * Method to open the book link under culture page
     * @throws InterruptedException
     */
    public void usingBooksLinkInCulturePage() throws InterruptedException {
        clickOnCultureOption();
        clickByXpath(lookingForBooks);
        sleepFor(3);
    }

    /**
     * Method to open a literature link which is found inside books page
     * @throws InterruptedException
     */
    public void clickOnLiteratureLink() throws InterruptedException{
        usingBooksLinkInCulturePage();
        clickByXpath(lookingForLiterature);
        sleepFor(3);
       // Thread.onSpinWait();
    }

    /**
     * Method to check if the more tab menu inside a culture page
     * will be able to open a music link indirectly
     * @throws InterruptedException
     */
    public void openMoreTabOption() throws InterruptedException {
        clickOnCultureOption();
        clickByXpath(lookingForMoreTab);
        sleepFor(2);
        clickByXpath(insideMoreTabMusic);
        sleepFor(3);
    }

    /**
     * Method to open a music link directly from culture page
     * same link is verified @openMoreTabOption()
     * @throws InterruptedException
     */
    public void openMusicTab() throws InterruptedException {
        clickOnCultureOption();
        clickByXpath(lookingForMusicTab);
        sleepFor(2);
    }

    /**
     * Method to open the TV tab in a culture page
     * @throws InterruptedException
     */
    public void openTVTab() throws InterruptedException {
        clickOnCultureOption();
        clickByXpath(lookingForTVTab);
        sleepFor(2);
    }

    /**
     * Method to open the Photography tab in a culture page
     * @throws InterruptedException
     */
    public void openPhotohraphyTab() throws InterruptedException {
        clickOnCultureOption();
        clickByXpath(lookingForPhotographyTab);
        sleepFor(2);
    }

    /**
     * Method to open the Style tab in a culture page
     * @throws InterruptedException
     */
    public void openStyleTab() throws InterruptedException {
        clickOnCultureOption();
        clickByXpath(lookingForStyleTab);
        sleepFor(2);
    }

    /**
     * Method to open the Identities tab in a culture page
     * @throws InterruptedException
     */
    public void openIdentitiesTab() throws InterruptedException {
        clickOnCultureOption();
        clickByXpath(lookingForIdentitiesTab);
        sleepFor(2);
    }

    /**
     * Method to open the The Collection tab in a culture page
     * @throws InterruptedException
     */
    public void openCollectionTab() throws InterruptedException {
        clickOnCultureOption();
        clickByXpath(lookingForCollectionTab);
        sleepFor(3);
    }

    /**
     * Method to open What you didn't know about color/colour
     * It is found in the middle page of The Collection page
     * @throws InterruptedException
     */
    public void openWhatYouDidnotKnowAboutColour() throws InterruptedException {
        openCollectionTab();
        scroll("1200");
        clickByXpath(colorInCollection);
        sleepFor(3);
    }

    /**
     * Method looking for Design page inside The Collection page
     * @throws InterruptedException
     */
    public void lookingForDisnePage() throws InterruptedException {
        openCollectionTab();
        scroll("1500");
        sleepFor(5);
        clickByXpath(lookingForDesign);
        sleepFor(3);
    }

    public void clickOnUltimateDiningExperience() throws InterruptedException {
        lookingForDisnePage();
        clickByXpath(ultimateDiningExperience);
        sleepFor(3);
    }

    public void clickOnOurLoveAffairsHomes() throws InterruptedException {
        lookingForDisnePage();
        clickByXpath(ourLoveAffairs);
        sleepFor(3);
    }






}
