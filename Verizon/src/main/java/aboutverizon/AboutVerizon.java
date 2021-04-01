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
        clickByXpath(aboutUsBanner);
    }

    public void careersPage() throws InterruptedException {
        aboutVerizonSection();
        clickByXpath(careersBanner);
    }

    public void newsPage() throws InterruptedException {
        aboutVerizonSection();
        clickByXpath(newsBanner);
    }

    public void resPage() throws InterruptedException {
        aboutVerizonSection();
        clickByXpath(resBanner);
    }

    public void innoPage() throws InterruptedException {
        aboutVerizonSection();
        clickByXpath(innoBanner);
    }

    public void eduPage() throws InterruptedException {
        aboutVerizonSection();
        clickByXpath(eduBanner);
    }

    public void broPage() throws InterruptedException {
        aboutVerizonSection();
        clickByXpath(broBanner);
    }

}
