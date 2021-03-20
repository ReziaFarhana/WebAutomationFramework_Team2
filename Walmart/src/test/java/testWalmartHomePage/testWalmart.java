package testWalmartHomePage;


import common.WebAPI;
import homePage.WalmartHomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testWalmart extends WebAPI {
WalmartHomePage walmartHomePage;


@BeforeMethod

public void runBeforeEachTest(){

    walmartHomePage= PageFactory.initElements(driver,WalmartHomePage.class);
}

@Test
private void validateElectronicsAndOfficeIsClickable(){

    walmartHomePage.verifyElectronicsAndOfficeIsClickable();
    }

@Test(enabled = false)
private void validateTvAndVideoIsEnabled(){

    walmartHomePage.verifyTvAndVideoIsEnabled();
}

@Test(enabled = false)

private void validateIpadAndTabletIsDisplayed(){

    walmartHomePage.verifyIpadAndTabletIsDisplayed();
    }

@Test(enabled = false)

private void validateComputersIsEnable(){

    walmartHomePage.verifyIsComputersEnable();
}

@Test(enabled = false)

    private void validatedLaptopsIsClickable(){

    walmartHomePage.verifyIsLaptopsClickable();
}




}
