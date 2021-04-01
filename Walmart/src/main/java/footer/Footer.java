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
        clickByXpath(adButton);

    }

    public void termPage() throws InterruptedException {
        scrollDown();
        clickByXpath(termButton);

    }

    public void privacyPage() throws InterruptedException {
        scrollDown();
        clickByXpath(privacyButton);

    }

    public void caPrivacyPage() throws InterruptedException {
        scrollDown();
        clickByXpath(caPrivacyButton);

    }

    public void sellPersonalPage() throws InterruptedException {
        scrollDown();
        clickByXpath(sellPersonalButton);

    }

    public void reqPersonalPage() throws InterruptedException {
        scrollDown();
        clickByXpath(reqPersonalButton);

    }

    public void taxPage() throws InterruptedException {
        scrollDown();
        clickByXpath(taxButton);

    }

    public void supplyChainSecurityPage() throws InterruptedException {
        scrollDown();
        clickByXpath(supplyChainSecurityButton);

    }


}





