package sampletest;

import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import sample.GeicoHomePage;

public class GeicoHomePageTest extends WebAPI {

    GeicoHomePage geicoHomePage;
    @BeforeMethod
    public void getInit() {
        geicoHomePage = PageFactory.initElements(driver,GeicoHomePage.class);

    }

@Test(priority = 1)@Ignore
    public void testGeicoTitle() throws InterruptedException {
        geicoHomePage.Geicozipcode();
        String exR="What would you like to protect?";
        String acR=geicoHomePage.autoinsurancegettext.getText();
    Assert.assertEquals(exR,acR,"text  is not available");
}


@Test(priority = 2)@Ignore
    public void testWebandMobile() throws InterruptedException {
    String exR="INFORMATION";
    String acR=geicoHomePage.information1.getText();
    Assert.assertEquals(exR,acR,"tab is not available");
}
@Test(priority = 3)@Ignore
    public void testinfoTabMobileapp() throws InterruptedException {
        geicoHomePage.infoTabMobileapp();
   String exR="Web and Mobile";
   String acR=geicoHomePage.webandMobileTitle1.getText();
   Assert.assertEquals(exR,acR,"tab is not available");

}

@Test(priority = 4)@Ignore
    public void testMobileApp() throws InterruptedException {
        geicoHomePage.mobileApp();
    String exR="Wherever you go we'll be there checking your blind spot.";
    String acR=geicoHomePage.MobileAppText1.getText();
    Assert.assertEquals(exR,acR,"tab is not available");


}

    @Test(priority = 5)@Ignore
    public void testExpressServices() throws InterruptedException {
        geicoHomePage.ExpressServices();
        String exR="Express Services";
        String acR=geicoHomePage.expressServicesText1.getText();
        Assert.assertEquals(exR,acR,"  text does not match ");
    }


    @Test(priority = 6)@Ignore
    public void testAmazonAlexa() throws InterruptedException {
        geicoHomePage.amazonAlexa();
      String exR="The GEICO Skill for Amazon Alexa";
      String acR=geicoHomePage.amazonAlexaText1.getText();
      Assert.assertEquals(exR,acR," text does not match");
    }


    @Test(priority = 7)@Ignore
    public void testgeicoLiving() throws InterruptedException {
        geicoHomePage.geicoLiving();
     String exR="FEATURED ARTICLES";
       String acR=geicoHomePage.geicoLivingtext1.getText();
       Assert.assertEquals(exR,acR," text does not match");
    }

@Test(priority = 8)@Ignore
public void testSocialMedia() throws InterruptedException {
    geicoHomePage.SocialMedia();
   String exR= "Connect With GEICO on Social Media";
   String acR=geicoHomePage.socialMediaText1.getText();
    Assert.assertEquals(exR,acR," text does not match");
}

    @Test(priority = 9)@Ignore
    public void testGeicoFacebook() throws InterruptedException {
        geicoHomePage.geicoFacebook();
      String exR= "There's even more to like about GEICO on Facebook. See how you could save on car insurance and more.";
      String acR=geicoHomePage.geicoFacebookText1.getText();
      Assert.assertEquals(exR,acR," text does not match");
    }


    @Test(priority = 10)
    public void testGeicoTweeter() throws InterruptedException {
        geicoHomePage.GeicoTweeter();
//        String exR= "There's even more to like about GEICO on Facebook. See how you could save on car insurance and more.";
//        String acR=geicoHomePage.geicoFacebookText1.getText();
//        Assert.assertEquals(exR,acR," text does not match");


    }
}
