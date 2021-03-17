package helpcenterpage;

import common.WebAPI;
import homepage.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import static helpcenterpage.HelpCenterWebElements.*;
import static homepage.HomePageWebElements.helpcenterlocator;

public class HelpCenter extends WebAPI {

//    HomePage homePage;
    @FindBy(how = How.ID, using =searchHelpBoxButtonId ) public WebElement searchBoxButton;



    public void searchHelpBox(){
//        homePage.helpCenterOption();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,4000);");
        clickByLinkText(helpcenterlocator);
       typeOnInputField(searchHelpTopicsLocator,"refund");
       searchBoxButton.click();
    }
    public void frequentlyAskedQuestions(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,4000);");
        clickByLinkText(helpcenterlocator);
        clickByXpath(frequentlyAskedQuestionsxPath);

    }
    public void wheresMyOrder(){
        frequentlyAskedQuestions();
        clickByXpath(wheresMyOrderxPath);
    }
    public void trackOrderButton(){
        frequentlyAskedQuestions();
        wheresMyOrder();
        clickByXpath(trackYourOrderButtonxPath);
    }
    public void trackOrder(){
        frequentlyAskedQuestions();
        wheresMyOrder();
        trackOrderButton();
        typeOnInputField(emailInputId,"walmarttest@test.org");
        typeOnInputField(orderNumInputId,"1234567891238");
        clickByCss(viewOrderStatusButtonCSSSelector);

    }

}
