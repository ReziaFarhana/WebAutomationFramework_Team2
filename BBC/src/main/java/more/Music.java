package more;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;


public class Music {

    @FindBy (xpath = "//a[normalize-space()='More']")
    WebElement more;
    @FindBy (xpath = "//li[@class='orb-nav-music orb-first-visible']//a[normalize-space()='Music']")
    WebElement music;
    @FindBy (xpath = "//h2[contains(text(),'The ’90s master of the remix')]")
    WebElement remix;

    public void moreOption (){
        more.click();
    }

    public void textRemix (){
        more.click();
        music.click();
       String b= remix.getText();
        Assert.assertEquals(b,"The ’90s master of the remix","Test failed");
    }



}
