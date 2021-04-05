package sample;
import static sample.BBCWebElement.*;
import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BBCHome  extends WebAPI {
BBCWebElement key;

//Action method:
    @FindBy(how= How.XPATH,using =searchBoxLocator)public WebElement searchBox;
    @FindBy(how= How.XPATH,using =searchButtonLocator)public WebElement searchButton;
    @FindBy (how = How.ID, using =reelLocator ) public WebElement reel;
    @FindBy(how= How.XPATH,using =destinations)public WebElement destinationsOptions;

//    String bbcUrl="https://www.bbc.com";
//    this.driver.get(bbcUrl);

    public void getUrl() throws InterruptedException {
        sleepFor(2);
        getCurrentUrl("https://www.bbc.com");
    }

    public void musicLinkSection() {
        clickByXpath(more);
        clickOnElement(music,driver);
    }

public void soundsLinkSection(){
        clickByXpath(more2);
        clickByXpath(sounds);
}

    public void wordNewsSection(){
        clickByXpath(more);
        clickByXpath(tv);
    }

public void weatherSection(){
        clickByXpath(more);
        clickByXpath(weather);
        navigateBack();
}

public void travelSection(){
        clickByXpath(more);
        clickOnElement(travel,driver);
        clickByXpath(culture);
}

public void searchBoxSection() throws InterruptedException {
searchBox.sendKeys(productName);
sleepFor(2);
searchButton.click();
}

public void sportSection() throws InterruptedException {
     clickOnElement(sport);
     sleepFor(2);
     getTextByCss(sportText);
     sleepFor(2);
}

public void workLifeSection() throws InterruptedException { //Worklife
   clickOnElement(workLife);
    sleepFor(2);
    clickByCss(workLife);
    clickById(workLifeText);
}

    public void allSportSection() throws InterruptedException {
        clickOnElement(sport);
        sleepFor(2);
        getTextByCss(sportText);
        sleepFor(2);
        clickOnElement(allSports);
        clickByXpath(rugbyUnion);
        clickOnElement(allTeams,driver);
        navigateBack();
    }

    public void futureSection() throws InterruptedException {
        sleepFor(2);
        clickOnElement(future);
        clickByXpath(bbcFuture);
        waitTimeExplicit(bbcFuture);
       // waitUntilClickAble(By.xpath(bbcFuture));
    }

    public void newsSection() throws InterruptedException {
        clickOnElement(news,driver);
        sleepFor(4);
        clickByXpath(video);
    }

    public void advertisementSection() throws InterruptedException {
          waitTimeExplicit(advertisement);
          clickByXpath(advertisement);
   }

      public void termsOfUseSection() throws InterruptedException {
          waitTimeExplicit(advertisement);
          clickByXpath(advertisement);
          sleepFor(2);
          clickByXpath(termsOfUse);
      }
     public void usingBBCContentSection() throws InterruptedException {
         waitTimeExplicit(advertisement);
         clickByXpath(advertisement);
         sleepFor(2);
         clickByXpath(termsOfUse);
         waitTimeUsingFluent(usingBBCContent);
         clickByXpath(usingBBCContent);
     }

     public void businessSection() throws InterruptedException {
         clickByCss(news1);
         sleepFor(2);
         //selectOptionByVisibleText(business,businessText);
         clickByXpath(business);
     }

        public void companiesSection() throws InterruptedException {
            clickByCss(news1);
            waitTimeUsingFluent(business);
            clickByXpath(business);
            sleepFor(3);
            clickOnElement(companies);
            navigateBack();
         }

public void sectionOfUKNews() throws InterruptedException {
    clickByCss(news1);
    sleepFor(2);
    clickOnElement(ukNews,driver);
    sleepFor(3);
    navigateBack();
}

public void worldSection() throws InterruptedException {
        clickByCss(news1);
        clickByXpath(world);
        sleepFor(3);
}

public void techSection() throws InterruptedException {
       clickByCss(news1);
       sleepFor(2);
       clickByXpath(world);
       waitTimeExplicit(tech);
       clickOnElement(tech);
}

public void scienceSection() throws InterruptedException {
    clickByCss(news1);
    clickByXpath(world);
    waitTimeExplicit(world);
    sleepFor(2);
    clickOnElement(science);
}

public void latinAmericaSection() throws InterruptedException {
    clickByCss(news1);
    sleepFor(2);
    clickByXpath(world);
    sleepFor(2);
    clickByXpath(latinAmerica);
    navigateBack();
}

    public void selectAsiaSection() throws InterruptedException {
        clickByCss(news1);
        sleepFor(2);
        clickByXpath(world);
        sleepFor(2);
        clickByXpath(asia);
    }

        public void coronavirusSection () throws InterruptedException {
            clickOnElement(news1);
            sleepFor(2);
            clickByXpath(world);
            waitTimeUsingFluent(coronavirus);
            clickByXpath(coronavirus);
            // handleNewTab(driver);
        }

        public void storiesSection () throws InterruptedException {
            clickOnElement(news1, driver);
            sleepFor(2);
            clickByXpath(world);
            clickByXpath(stories);
        }

   public void destinationsSection() {
       clickByXpath(travel1);
       clickByXpath(destinations);
       //selectOptionByVisibleText(WebElement destinationsOptions," String value")
   }

   public void foodSection() throws InterruptedException {
        clickByXpath(travel1);
        sleepFor(2);
        clickOnElement(food,driver);

   }

    public void selectEuropeSection() throws InterruptedException {
        clickByCss(news1);
        sleepFor(2);
        clickByXpath(world);
        sleepFor(2);
        clickByXpath(europe);
    }

    public void selectGolfSection() throws InterruptedException {
        clickOnElement(sport);
        sleepFor(2);
        clickByXpath(golfSection);
    }

    public void tennisSection() throws InterruptedException {
        clickByXpath(sport);
        sleepFor(2);
        clickByXpath(tennisSection);
    }

    public void checkingSectionOfAthletics() throws InterruptedException {
        clickByXpath(sport);
        sleepFor(2);
        clickByCss(athleticsOption);
    }

    public void selectCyclingOption() throws InterruptedException {
       clickOnElement(sport);
       sleepFor(3);
        clickOnElement(cyclingOption);
    }

    public void formula1Section(){
        clickByXpath(sport);
        clickOnElement(formula1Option);
    }

    public void selectCricketSection(){
       clickByXpath(sport);
        clickOnElement(selectCricket);
    }
    }

