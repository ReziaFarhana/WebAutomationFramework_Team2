package registraionPage;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class RegistrationPage extends WebAPI {

    @FindBy(xpath = "//ul[@class='gnav20-dropdown']/li/a[text()='Register']") public WebElement registraionPageLink;
    @FindBy(css = "input#serviceTypeUserId") public WebElement selectLink;
    @FindBy(css = "button#continue") public WebElement continueButton;
    @FindBy(xpath = "(//a[@data-label='Personal'])[1]") public WebElement personalTextLink;


    public void registrationPageValidate(){
        registraionPageLink.click();
        System.out.println(driver.getCurrentUrl());
        Assert.assertTrue(driver.getCurrentUrl().contains("verizon.com/account/register"));
    }

    public void createAccountPage(){
        selectLink.click();
        if (continueButton.isEnabled()){
            System.out.println("continue button is enabled");
        }
        continueButton.click();
        driver.switchTo().frame("c-8cv83gjh6aro");
        personalTextLink.click();
        driver.switchTo().defaultContent();
    }



}
