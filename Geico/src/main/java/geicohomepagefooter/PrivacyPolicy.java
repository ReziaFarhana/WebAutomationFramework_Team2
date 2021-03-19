package geicohomepagefooter;

import common.WebAPI;

import static geicohomepagefooter.GeicoHomePageFooterWebElements.*;

public class PrivacyPolicy extends WebAPI {

    public void privacyPolicyLink() throws InterruptedException {
        windowsFullPageScrollDown();
        Thread.sleep(5);
        clickByXpath(privacyPolicyLocator);
    }


}
