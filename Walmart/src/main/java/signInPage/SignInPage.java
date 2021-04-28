package signInPage;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class SignInPage extends WebAPI {
    @FindBy(xpath = "//button[@id='gnav20-sign-id']/span/span")
    WebElement signInBtn;
    @FindBy(xpath = "(//*[@id=\"IDToken1\"])[1]")
    WebElement userField;
    @FindBy(xpath = "//*[@id=\"IDToken2\"]")
    WebElement passWordField;
    @FindBy(xpath = "(//*[@id=\"login-submit\"])[1]")
    WebElement signInOnSignInPage;
    @FindBy(xpath = "(//*[@id=\"rememberUserName\"])[1]")
    WebElement rememberMeBtn;
    @FindBy(xpath = "(//*[@id=\"registerLink\"])[1]")
    WebElement registerBtn;
    @FindBy(xpath = " //*[@id=\"forgotPwdLink\"]")
    WebElement forgotBtn;
    @FindBy(xpath = "//*[@id=\"cancel\"]")
    WebElement cancelBtn;
    @FindBy(css = "#gnav20-sign-in > ul > li:nth-child(3) > a")
    WebElement prepaidInstantPayBtn;
    @FindBy(xpath = "(//*[@id=\"businessLink\"])[1]")
    WebElement businessSignInBtn;
    @FindBy(xpath = "//*[@id=\"sso\"]/div[1]/div[1]/div[1]/h2")
    WebElement businessSignInPage;
    @FindBy(xpath = "//*[@id=\"gnav20-sign-in\"]/ul/li[4]/a")
    WebElement wishList;


    public void verifySignInBtnIsClickable() {
        signInBtn.isEnabled();
        signInBtn.click();
    }

    public void verifyUserAndPasswordField() {
        signInBtn.click();
        userField.sendKeys("saif");
        passWordField.sendKeys("1234");

    }

    public void verifyUserAndPasswordFieldUsingDataProvider(String name, String password) throws InterruptedException {
        signInBtn.click();
        Thread.sleep(2000);
        userField.sendKeys(name);
        Thread.sleep(2000);
        passWordField.sendKeys(password);
        Thread.sleep(2000);

    }


    public void verifySignInBtnIsDisabledWhenUserAndPasswordFieldEmpty() {
        signInBtn.click();
        boolean b = signInOnSignInPage.isEnabled();
        Assert.assertFalse(b);
    }

    public void verifyForgotBtnIsEnabled() {
        signInBtn.click();
        if (forgotBtn.isEnabled()) {
            forgotBtn.click();
            cancelBtn.click();
        } else {
            System.out.println("Forgot button is not working as expected");
        }
    }

    public void verifyRememberMeBtnIsCheckAble() {
        signInBtn.click();
        rememberMeBtn.click();
        boolean b = rememberMeBtn.isSelected();
        Assert.assertTrue(b);

    }

    public void verifyRegistrationBtn() {
        signInBtn.click();
        if (registerBtn.isEnabled()) {
            registerBtn.click();
        }
    }

    public void verifyBusinessSignInBtnIsEnabled() {
        signInBtn.click();
        if (businessSignInBtn.isEnabled()) {
            businessSignInBtn.click();
        }
    }

    public void verifyBusinessSignInPageText() {
        signInBtn.click();
        businessSignInBtn.click();
        String s = businessSignInPage.getText();
        System.out.println(s);
        Assert.assertEquals(s, "Wireless, enterprise, government and education customers");

    }

    public void verifyDropDownIsShownWhenMouseHoverOnSignIn() throws InterruptedException {
        Actions actions = new Actions(driver);
        actions.moveToElement(signInBtn).perform();
        Thread.sleep(4000);

    }

    public void verifyprepaidInstantPayCanBeClickedFromDropDown() throws InterruptedException {
        Actions actions = new Actions(driver);
        actions.moveToElement(signInBtn).perform();
        Thread.sleep(4000);
        prepaidInstantPayBtn.click();

    }

    public void verifyWishListCanBeClickedFromDropDown() throws InterruptedException {
        Actions actions = new Actions(driver);
        actions.moveToElement(signInBtn).perform();
        Thread.sleep(4000);
        wishList.click();

    }

}