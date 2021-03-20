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

@Test@Ignore
    public void testGeicoTitle() throws InterruptedException {
        geicoHomePage.Geicozipcode();
        String exR="What would you like to protect?";
        String acR=geicoHomePage.autoinsurancegettext.getText();
    Assert.assertEquals(exR,acR,"text  is not available");
}


@Test@Ignore
    public void testWebandMobile() throws InterruptedException {
        geicoHomePage.infoTab();
    String exR="INFORMATION";
    String acR=geicoHomePage.infotab.getText();
    Assert.assertEquals(exR,acR,"tab is not available");
}
@Test
    public void testinfoTabMobileapp() throws InterruptedException {
        geicoHomePage.infoTabMobileapp();
    String exR="";
    String acR=geicoHomePage.webandmobile.getText();
    Assert.assertEquals(exR,acR,"tab is not available");

}





}
