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
        waitTimeExplicit(contactUsTab);
        clickByXpath(contactUsTab);

    }

    public void getIdCardsPage() throws InterruptedException {
        scrollDown();
        waitTimeExplicit(contactUsTab);
        clickByXpath(contactUsTab);
        waitTimeExplicit(getIdCardTab);
        clickByXpath(getIdCardTab);

    }

    public void trackaClaimPage() throws InterruptedException {
        scrollDown();
        waitTimeExplicit(contactUsTab);
        clickByXpath(contactUsTab);
        waitTimeExplicit(trackaClaimTab);
        clickByXpath(trackaClaimTab);

    }

    public void autoInsurancePage() throws InterruptedException {
        scrollDown();
        waitTimeExplicit(contactUsTab);
        clickByXpath(contactUsTab);
        waitTimeExplicit(autoInsuranceTab);
        clickByXpath(autoInsuranceTab);

    }

    public void policyDocsPage() throws InterruptedException {
        scrollDown();
        waitTimeExplicit(contactUsTab);
        clickByXpath(contactUsTab);
        waitTimeExplicit(policyDocsTab);
        clickByXpath(policyDocsTab);

    }

    public void makePaymentPage() throws InterruptedException {
        scrollDown();
        waitTimeExplicit(contactUsTab);
        clickByXpath(contactUsTab);
        waitTimeExplicit(makePaymentTab);
        clickByXpath(makePaymentTab);

    }
    public void goPaperlessPage() throws InterruptedException {
        scrollDown();
        waitTimeExplicit(contactUsTab);
        clickByXpath(contactUsTab);
        waitTimeExplicit(goPaperlessTab);
        clickByXpath(goPaperlessTab);

    }




}
