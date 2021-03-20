package testGeicoHomePage;

import common.WebAPI;
import geicoHomePage.GeicoHomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class TestGeicoCareerPage  extends WebAPI {
    GeicoHomePage geicoHomePage;

    @BeforeMethod
    public void runBeforeEachTest(){
        geicoHomePage= PageFactory.initElements(driver,GeicoHomePage.class);
    }

    @Test(enabled = true)
    private  void validateOpportunitiesCareer() throws InterruptedException {
        geicoHomePage.verifyOppportuniesCareerIsClickable();

    }

    @Test(enabled = true)
    private  void validateMenusFromOpportunities() throws InterruptedException {
        geicoHomePage.verifyMenusFromOpportunities();

    }

    @Test(enabled = true)
    private void validateCareerCurrentUrl(){

        geicoHomePage.verifyCareerPageUrl();
    }

    @Test
    private void validateCareerOpportunitiesText(){

        geicoHomePage.verifyCareerOpportunitiesText();
    }

    @Test
    private void validateCareerOpportunitiesAttribute(){

        geicoHomePage.verifyCareerOpportunitiesAttribute();
    }

    @Ignore
    @Test
    private void validateCustomerServiceIsClickable() throws InterruptedException {
        geicoHomePage.verifyCustomerServiceIsClickable();
    }


}


