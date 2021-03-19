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
//    @FindBy(how= How.XPATH, using=listsXp)public WebElement listOption;
    @FindBy(how= How.XPATH, using=decorXp)public WebElement decorOp;
    @FindBy(how= How.CSS, using=seeMorePlusCss)public WebElement seeMorePlus;
    @FindBy(how= How.ID, using=searchBoxID)public WebElement searchBox;
    @FindBy(how= How.ID, using=signupEmailID)public WebElement signUp;
//    @FindBy(how= How.XPATH, using=priceMinXp)public WebElement priceMin;
//    @FindBy(how= How.XPATH, using=priceMaxCss)public WebElement priceMax;


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
        clickByCss(closeOutps5PopupCss);
        clickByXpath(maddenNfl21GameResultXp);
        clickByXpath(heartButtonXp);
    }
    public void hamburgermenu() throws InterruptedException {

        clickByXpath(hamburgermenuXp);
        JavascriptExecutor js = (JavascriptExecutor) driver;
      js.executeScript("window.scrollBy(0,3000);");
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

        clickByXpath(easterOptionXp);
        clickByXpath(easterOption2Xp);
    }
    public void navigateToDecorPage() throws InterruptedException {
        hamburgermenu();
        hoverOver(driver,decorOp);
        clickByXpath(partysuppliesXp);

    }
    //uncommiited
    public void storePickupOption() throws InterruptedException {
        scrollDown();
        clickByXpath(storePickupCusXp);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1500);");
//        hoverOver(driver, seeMorePlus);
        Thread.sleep(3000);
//        clickByXpath(seeMorePlusCss);
//        Thread.sleep(2000);
        clickByXpath(storePickupDropDownXp);

    }
    public void skateboardOption(){
        clickByXpath(skateboardOptionCusXp);
        clickOnElement(bestSellersSortClass);
        clickByXpath(hightoLowSortXp);
        clickByXpath(deliverToHomeRadiobtnXp);

    }
    public void searchBox(){
//        inputValueInTextBoxByWebElement(searchBox,searchProduct);
        typeOnInputBox(searchBoxID,searchProduct);
        clickOnElement(refineByPriceClassXp);
//        inputValueInTextBoxByWebElement(priceMin,priceMinValue);
//        inputValueInTextBoxByWebElement(priceMax,priceMaxValue);
    }
    public void newsletterSignUp(){
        inputValueInTextBoxByWebElement(signUp,signupEmail);
        clickByXpath(signupBtnXp);
    }
    public void myItemsBtn(){
        clickByXpath(myItemsBtnXp);
        clickOnElement(signupCreateBtnClass);

    }
    public void babyOption() throws InterruptedException {

        clickByXpath(hamburgermenuXp);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,5000);");
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

        clickByXpath(babyOptionXp);
        clickByXpath(strollersXp);
    }
    public void electronicsAndOfficeOption() throws InterruptedException {

        clickByXpath(hamburgermenuXp);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,5000);");
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

        clickByXpath(electronicsOfficeXp);
        clickByXpath(wearableTechXp);
    }
    public void toyGamesVideoGames() throws InterruptedException {

        clickByXpath(hamburgermenuXp);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,5000);");
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

        clickByXpath(toysgamesvidXp);
        clickByXpath(outdoorPlayXp);
    }


}
