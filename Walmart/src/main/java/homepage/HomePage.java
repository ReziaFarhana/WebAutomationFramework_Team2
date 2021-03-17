package homepage;

import common.WebAPI;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static homepage.HomePageWebElements.*;

public class HomePage extends WebAPI {
    @FindBy(how= How.XPATH, using=cultureDropDownXpath) public WebElement cultureDropDown;


    public void scrollDown(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,5000);");
    }
    public void helpCenterOption(){
        scrollDown();
       // JavascriptExecutor js = (JavascriptExecutor)driver;
       clickByLinkText(helpcenterlocator);
        //js.executeScript("arguements[0].scrollIntoView();", helpcenterlocator);
    }

    public void productRecallsOption() throws InterruptedException {
        scrollDown();
        clickByXpath(productRecallsXpath);
        scrollDown();
        clickByXpath(careersOptionXPath);
        windowHandle();
        hoverOver(driver,cultureDropDown);


    }
}
