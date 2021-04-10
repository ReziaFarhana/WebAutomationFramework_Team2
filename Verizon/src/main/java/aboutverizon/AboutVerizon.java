package aboutverizon;

import common.WebAPI;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;


import static aboutverizon.AboutVerizonWebElement.*;


public class AboutVerizon extends WebAPI {

    public void aboutVerizonSection() throws InterruptedException {
        scrollDown();
        sleepFor(2);
    }


    public void scrollDown() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight);");
    }

    public void aboutUsPage() throws InterruptedException {
        aboutVerizonSection();
        waitTimeExplicit(aboutUsBanner);
        clickByXpath(aboutUsBanner);
    }

    public void careersPage() throws InterruptedException {
        aboutVerizonSection();
        waitTimeExplicit(careersBanner);
        clickByXpath(careersBanner);
    }

    public void newsPage() throws InterruptedException {
        aboutVerizonSection();
        waitTimeExplicit(newsBanner);
        clickByXpath(newsBanner);
    }

    public void resPage() throws InterruptedException {
        aboutVerizonSection();
        waitTimeExplicit(resBanner);
        clickByXpath(resBanner);
    }

    public void innoPage() throws InterruptedException {
        aboutVerizonSection();
        waitTimeExplicit(innoBanner);
        clickByXpath(innoBanner);
    }

    public void eduPage() throws InterruptedException {
        aboutVerizonSection();
        waitTimeExplicit(eduBanner);
        clickByXpath(eduBanner);
    }

    public void broPage() throws InterruptedException {
        aboutVerizonSection();
        waitTimeExplicit(broBanner);
        clickByXpath(broBanner);
    }

}
