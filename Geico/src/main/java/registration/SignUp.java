package registration;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class SignUp extends WebAPI {

    @FindBy(xpath = "//a[@data-side-panel-trigger=\"information\"]") public WebElement informationLink;
    @FindBy(xpath = "(//li[@data-name=\"My Account\"])[1]") public WebElement myAccountElement;
    @FindBy(xpath = "(//a[text()='Sign up for online access'])[2]") public WebElement signUpLink;
    @FindBy(xpath = "(//span[@class=\"form-message\"])[1]") public WebElement errorMessage;
    @FindBy(xpath = "(//span[@class=\"form-message\"])[2]") public WebElement errorMessage2;
    @FindBy(xpath = "//div[@id='form-field-TextInputZipComponent-1']//asd-input-errors//div//span[@class='form-message']")
    public WebElement errorMessage3;
    @FindBy(css = "input#TextInputComponent-1") public WebElement policyNumberBox;
    @FindBy(css = "input#TextInputDateComponent-2") public WebElement dateOfBirthBox;
    @FindBy(css = "input#TextInputZipComponent-1") public WebElement mailingZipCode;
    @FindBy(css = "input#TextInputZipComponent-1") public WebElement submitButton;


    public void signUpPageValidation(){
        informationLink.click();
        myAccountElement.click();
        signUpLink.click();
        String actual = driver.getCurrentUrl();
        String expected = "https://ecams.geico.com/activation?traceback=static";
        Assert.assertEquals(actual,expected);

    }
    public void validateRegistration(){
        informationLink.click();
        myAccountElement.click();
        signUpLink.click();
        policyNumberBox.sendKeys("123456789");
        dateOfBirthBox.click();
        submitButton.click();
        System.out.println(errorMessage.getText());
        System.out.println(errorMessage2.getText());
        //System.out.println(errorMessage3.getText());
        dateOfBirthBox.sendKeys("07181995");
        mailingZipCode.sendKeys("11421");
        submitButton.click();
    }

}
