package footer;

import common.WebAPI;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static footer.FooterWebElement.*;

public class Footer extends WebAPI {

    public void scrollDown() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight);");
        sleepFor(2);
    }

    public void adPage() throws InterruptedException {
        scrollDown();
        waitTimeExplicit(adButton);
        clickByXpath(adButton);

    }

    public void termPage() throws InterruptedException {
        scrollDown();
        waitTimeExplicit(termButton);
        clickByXpath(termButton);

    }

    public void privacyPage() throws InterruptedException {
        scrollDown();
        waitTimeExplicit(privacyButton);
        clickByXpath(privacyButton);

    }

    public void caPrivacyPage() throws InterruptedException {
        scrollDown();
        waitTimeExplicit(caPrivacyButton);
        clickByXpath(caPrivacyButton);

    }

    public void sellPersonalPage() throws InterruptedException {
        scrollDown();
        waitTimeExplicit(sellPersonalButton);
        clickByXpath(sellPersonalButton);

    }

    public void reqPersonalPage() throws InterruptedException {
        scrollDown();
        waitTimeExplicit(reqPersonalButton);
        clickByXpath(reqPersonalButton);

    }

    public void taxPage() throws InterruptedException {
        scrollDown();
        waitTimeExplicit(taxButton);
        clickByXpath(taxButton);

    }

    public void supplyChainSecurityPage() throws InterruptedException {
        scrollDown();
        waitTimeExplicit(supplyChainSecurityButton);
        clickByXpath(supplyChainSecurityButton);

    }


}





