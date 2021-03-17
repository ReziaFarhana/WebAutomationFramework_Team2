package homepage;

import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static homepage.HomePageWebElement.*;

public class HomePage extends WebAPI {
    //Action class


    //Find by annotation - 1st approach
    @FindBy(how= How.CSS,using = HomePageWebElement.searchBoxLocator) public WebElement searchBox;//new reference variable is searchBox,
    // WebElement is a Type of data
    @FindBy(how= How.CSS,using = HomePageWebElement.searchButtonLocator) public WebElement searchButton;//new reference variable is searchButton.
    @FindBy(how=How.XPATH,using = visitRealButtonXpathLocator) public WebElement visitRealButton;
    @FindBy(how=How.XPATH, using = aboutBBCXpathLocator) public WebElement aboutBBC;
    @FindBy(how=How.ID, using =signInIDLocator) public WebElement signIn;

//    //Find By Annotation- 2nd approach, using public
//    @FindBy(id=searchBoxLocator)public WebElement searchBox1;
//
//    //Find By Annotation (private) - 3rd approach using Getter & Setter
//    @FindBy(id=searchBoxLocator)private WebElement searchBox2;
//    public WebElement getSearchBox2() {
//        return searchBox2;
//    }
//
//    public void setSearchBox2(WebElement searchBox2) {
//        this.searchBox2 = searchBox2;
//    }
//
//
//
//    public void demo(){
//        searchBox.sendKeys("Mask");
//        searchButton.click();
//    }
    public void searchBoxFunc(){
        searchBox.sendKeys("COVID-19");
        searchButton.click();

    }
//    public void checkLatestBusinessNews(){
//        latestBusinessNews.click();
//    }

    public void checkVisitReal() {
        visitRealButton.click();
    }
    public void checkAboutBBC(){
        aboutBBC.click();
    }
    public void checkSignIn(){
       signIn.click();
    }


}
