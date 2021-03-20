package testHopePage;

import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import testWalmartHomePage.Verizon_Home_Page;

public class TestVerizonHomePage extends WebAPI {


    Verizon_Home_Page verizon_home_page;

    @BeforeMethod

    public void runBeforeEachTest(){
        verizon_home_page= PageFactory.initElements(driver,Verizon_Home_Page.class);

    }

    @Test

    public void validateIsWhyVerizonButtonWorking() throws InterruptedException {

        verizon_home_page.verifyIsWhyVerizonClickable();
    }


    @Test

    public void validateIsWhyVerizonTextReadable() throws InterruptedException {

        verizon_home_page.verifyWhyVerizonText();

    }

    @Test

    public void validateIsWhyVerizonOverviewPageDisplayed() throws InterruptedException {

        verizon_home_page.verifyWhyVerizonOverviewPageDisplayed();

    }


    @Test

    public void validateIsNetworkButtonWorking() throws InterruptedException {

        verizon_home_page.verifyIsNetworkButtonWorking();

    }


    @Test

    public void validatedIsGetMoreFunctionWorks() throws InterruptedException {

        verizon_home_page.verifyIsGetMoreFunctionClickable();

    }


    @Test

    public void validateIsSocialImpactDisplayed() throws InterruptedException {

        verizon_home_page.verifyIsSocialImpactWorks();


    }

    @Test

    public void validateNetworkTextUnderNetworkButton() throws InterruptedException {

        verizon_home_page.verifyNetworkTextIsUnderNetworkButton();
    }

    @Test

    public void validate5gOverviewPageIsDisPlay() throws InterruptedException {

        verizon_home_page.verify5gOverviewPageIsDisPlay();


    }

    @Test

    public void validateWirelessCoverageMapIsDisplay() throws InterruptedException {

        verizon_home_page.verifyWirelessCoverageMapIsDisplay();

    }

    @Test

    public void validate5gLabsIsWorking() throws InterruptedException {

        verizon_home_page.verify5gLabsIsWorking();

    }

    @Test

    public void validateIsNetworkAwardPageEnable() throws InterruptedException {

     verizon_home_page.verifyIsNetworkAwardPageEnable();

    }

    @Test

    public void validateTheFiosPage() throws InterruptedException {

        verizon_home_page.verifyTheFiosPage();
}

    @Test

    public void validateTheGlobalCoveragePage() throws InterruptedException {

        verizon_home_page.verifyTheGlobalCoveragePage();

    }

    @Test

    public void validateGlobalHelloTextReadable() throws InterruptedException {

        verizon_home_page.veriyGlobalHelloTextReadable();
    }


}
