package contactus;

import common.WebAPI;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;


import static contactus.ContactUsWebElement.*;


public class ContactUs extends WebAPI {


    public void scrollDown() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight);");
    }


    public void locateContactUs() throws InterruptedException {
        scrollDown();


    }

    public void contactUsPage() throws InterruptedException {
        scrollDown();
        clickByXpath(contactUsTab);

    }

    public void getIdCardsPage() throws InterruptedException {
        scrollDown();
        clickByXpath(contactUsTab);
        clickByXpath(getIdCardTab);

    }

    public void trackaClaimPage() throws InterruptedException {
        scrollDown();
        clickByXpath(contactUsTab);
        clickByXpath(trackaClaimTab);

    }

    public void autoInsurancePage() throws InterruptedException {
        scrollDown();
        clickByXpath(contactUsTab);
        clickByXpath(autoInsuranceTab);

    }

    public void policyDocsPage() throws InterruptedException {
        scrollDown();
        clickByXpath(contactUsTab);
        clickByXpath(policyDocsTab);

    }

    public void makePaymentPage() throws InterruptedException {
        scrollDown();
        clickByXpath(contactUsTab);
        clickByXpath(makePaymentTab);

    }
    public void goPaperlessPage() throws InterruptedException {
        scrollDown();
        clickByXpath(contactUsTab);
        clickByXpath(goPaperlessTab);

    }




}
