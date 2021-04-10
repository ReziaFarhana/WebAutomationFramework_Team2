package news_world_test;

import common.WebAPI;
import news_world.NewsWorld;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;


public class NewsWorldTest extends WebAPI {

    NewsWorld nw;

    @BeforeMethod
    public void getInIt() {
        nw = PageFactory.initElements(driver, NewsWorld.class);
    }

    // this method is to verify BBC home page

    @Test

    public void verifyBBCHomePage() {
        String expected = "https://www.bbc.com/";
        String actual = getCurrentPageUrl();
        Assert.assertEquals(actual, expected, "Test failed ");
    }

    @Test(enabled = false)//1
    public void validateExploreBBCGetText() {
        nw.verifyBBCExploreText();
    }

    @Test(enabled = false)//2
    public void validateUrlIsAsExpected() {
        nw.verifyCurrentUrl();
    }

    @Test(enabled = false)//3
    public void validateBBCSocialTitleGetAttribute() {
        nw.verifyBBCSocialTitle(); }

    @Test(enabled = false)//4
    public void validateTwitterLogoIsDisplayed() {
        nw.verifyTwitterLogo(); }

    @Test(enabled = false)//5
    public void validateFacebookLogoIsDisplayed() {
        nw.verifyFacebookLogo();
    }

    @Test(enabled = false)//6
    public void validateInstagramLogoIsDisplayed() {
        nw.verifyInstagramLogo();
    }

    @Test(enabled = false)//7
    public void validateContactBBC() {
        nw.verifyContactBBC(); }

    @Test(enabled = false)//8
    public void validateBBCPrograms() {
        nw.verifyBBCPrograms();
    }

    @Test(enabled = false)//9
    public void validateNonFunctionalityOfSportImage() {
        nw.verifySportImageIsNonFunctional();
    }
    @Test(enabled = false)//10
    public void validateFindAProgram() {
        nw.verifyFindAProgram();
    }

    @Test(enabled = false)//11
    public void validateAtoZisDisplayed() {
        nw.checkAtoZisDisplayed();
    }

    //       @Test // 12
//    public void verifyBBCNewsIsClicked() {
//            nw.clickOnBBCNewsLink();
//            assertEqualByXpath(bbcNewsLink,"News");
//        }
//
//        @Test // 13
//        public void verifyNewsWorldIsClicked(){
//            nw.clickOnNewsWorldLink();
//            assertEqualByXpath(newsWorldLink,"World");
//        }
//
//        @Test  // 14
//        public void verifyNewsWorldAsiaLinkIsClicked(){
//            nw.clickOnNewsWorldAsiaLink();
//           assertEqualByXpath(newsWorldAsiaLink,"Asia");
//        }

//        @Test  // 15
//        public void verifyChinaIsClickable(){
//            nw.clickOnAsiaChina();
//            assertEqualByXpath(newsAsiaChina,"China");
//        }
//
//        @Test  // 16
//        public void verifyNewsChinaEconomyIsClickable(){
//            nw.clickOnNewsChinaEconomyBounceBack();
//            assertEqualByXpath(ChinaEconomyNews,"Chinese economy continues its pandemic bounce back");
//        }
//         @Test  // 17
//        public void verifyChinaEconomyIsDisplayed(){
//            nw.ChinaEconomyIsDisplayed();
//            assertEqualByXpath(ChinaEconomyNews,"Chinese economy continues its pandemic bounce back");
//    }


//    @Test  // 18
//    public void verifyCoronaVirusLink() {
//        nw.clickOnCoronaVirusLink();
//        String expected = "Coronavirus";
//        String actual = coronaViruslink;
//        Assert.assertEquals(actual, expected, "Test failed");
//
        @Test(enabled = false)//19
        public void testMusic () {
            nw.moreOption();
        }
        @Test(enabled = false)//20
        public void testDisplayRemix () {
            nw.textRemix();
        }

    }


