package topdevicebrands;

import common.WebAPI;

import static topdevicebrands.PersonalHomePageWebElements.*;

public class Samsung extends WebAPI {

    public void topDeviceBrandsCategoryList() {
        getTextFromWebElementsByXpath(topAccessoryBrandsList);
        //getTextFromWebElementTest(topAccessoryBrandsList);
    }

    public void samsungTab() {
        clickByLinkText(samsungLocator);
    }

    public void shopSamsungPage() {
        samsungTab();
        clickByXpath(buyButton);

    }

    public void shopSamsungPage() {
        samsungTab();
        clickByXpath(buyButton);

    }


}
