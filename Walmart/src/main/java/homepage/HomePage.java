package homepage;

import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static homepage.HomePageWebElements.*;

public class HomePage extends WebAPI {
    @FindBy(how= How.XPATH, using=cultureDropDownXpath) public WebElement cultureDropDown;
//    @FindBy(how= How.CSS, using=covidReadMoreOptionId) public WebElement covidReadMore;
//    @FindBy(how= How.NAME, using=feedbackcommentsInputBoxName) public WebElement feedbackComments;


    public void scrollDown(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0,8000);");
////        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight);");
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
//uncommitted
    public void accessibilityOption(){
        scrollDown();
        clickByXpath(accessibilityoptionXpath);
        clickById(covidReadMoreOptionId);
        clickByXpath(xbtnXp);
    }
    public void trampolineOption(){
        scrollDown();
        clickByLinkText(trampolineOptionLinkText);
    }
    public void trampolinePageGiftElibileCheckBox(){
        trampolineOption();
        tryCheckbox(giftEligibleCheckBoxID);
    }
    public void contactUsOption(){
        scrollDown();
        clickByXpath(contactUsOptionXpath);
        clickByCss(contactUsButtonCss);
//        typeOnInputBox(chatwWalmartchatBoxCss, chatBoxValue);
        typeOnInputField(chatwWalmartchatBoxCss, chatBoxValue);
        clickByXpath(chatBoxSendButtonXP);
    }
    public void walmartEBooksLogo(){
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight);");
        clickByCss(walmartEBookLogoCss);
    }
    public void allsWellLogo(){
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight);");
        clickByCss(allswellLogoCss);
    }
    public void feedBackButton() throws InterruptedException {
        scrollDown();
        clickOnElement(feedbackButtonClass);
        Thread.sleep(2000);
        clickByXpath(feedback4StarRatingXP);
//        typeOnInputBox(feedbackButtonClass,feedbackcommentsInputValue);
        driver.findElement(By.name(feedbackcommentsInputBoxName)).sendKeys(feedbackcommentsInputValue);
        Thread.sleep(3000);
        clickByXpath(feedbackcommentsSubmitButtonXP);
    }
    public void ps4Option(){
        scrollDown();
        clickByXpath(ps4Xp);
        cancelAlert();
        clickByXpath(maddenNfl21GameResultXp);
        scrollDown();
        clickByXpath(seeAllReviewsButtonXp);
        clickByCss(mostRelevantDropDownCss);
        dropDown(mostRelevantDropDownCss,dropDownValue);



    }


}
